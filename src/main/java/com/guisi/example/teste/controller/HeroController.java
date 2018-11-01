package com.guisi.example.teste.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guisi.example.teste.model.Hero;

@RestController
@RequestMapping("/heroes")
@CrossOrigin
public class HeroController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Hero> getHeroes(@RequestParam(value = "name", required = false) String name) {
		List<Hero> heroes = null;
		if (name == null) {
			System.out.println("Recuperou heroes");
			heroes = Hero.HEROES;
		} else {
			System.out.println("Recuperou heroes pelo nome: " + name);
			heroes = Hero.HEROES.stream().filter(hero -> hero.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
		}
		
		heroes.sort((Hero h1, Hero h2) -> h1.getName().compareTo(h2.getName()));
		
		return heroes;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Hero getHero(@PathVariable("id") Long id) {
		System.out.println("Recuperou hero: " + id);
		return Hero.HEROES.stream().filter(hero -> hero.getId().equals(id)).findFirst().orElse(null);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void removeHero(@PathVariable("id") Long id) {
		System.out.println("Removeu hero: " + id);
		Hero.HEROES = Hero.HEROES.stream().filter(hero -> !hero.getId().equals(id)).collect(Collectors.toList());
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Hero> createHero(@RequestBody Hero hero) throws Exception {
		if (this.checkIfHeroExists(hero)) {
			throw new Exception("A hero named " + hero.getName() + " already exists!");
		} else {
			hero.setId(Hero.getNextId());
			System.out.println("Adicionou hero: " + hero);
			Hero.HEROES.add(hero);
			return new ResponseEntity<Hero>(hero, HttpStatus.OK);
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = "application/json")
	public Hero updateHero(@RequestBody Hero hero) throws Exception {
		if (this.checkIfHeroExists(hero)) {
			throw new Exception("A hero named " + hero.getName() + " already exists!");
		} else {
			System.out.println("Atualizou hero: " + hero);
			for (int i = 0; i < Hero.HEROES.size(); i++) {
				if (Hero.HEROES.get(i).getId().equals(hero.getId())) {
					Hero.HEROES.set(i, hero);
					break;
				}
			}
		}
		return hero;
	}
	
	private boolean checkIfHeroExists(Hero newHero) throws Exception {
		return Hero.HEROES.stream()
				.anyMatch(hero -> hero.getName().toLowerCase().equals(newHero.getName().trim().toLowerCase())
						&& (newHero.getId() == null || !hero.getId().equals(newHero.getId())));
	}
	
}