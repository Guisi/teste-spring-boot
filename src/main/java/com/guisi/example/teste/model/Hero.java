package com.guisi.example.teste.model;

import java.util.ArrayList;
import java.util.List;

public class Hero {
	
	public static List<Hero> HEROES;
	
	public static Long getNextId() {
		return HEROES.stream().mapToLong(hero -> hero.getId()).max().orElse(0) + 1;
	}

	private Long id;
	private String name;
	
	public Hero(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + "]";
	}

	static {
		HEROES = new ArrayList<>();
		long id = 1l;
		HEROES.add(new Hero(id++,"Alan Scott"));
		HEROES.add(new Hero(id++,"Alfred Pennyworth"));
		HEROES.add(new Hero(id++,"Amanda Waller"));
		HEROES.add(new Hero(id++,"Ant-Man"));
		HEROES.add(new Hero(id++,"Aquaman"));
		HEROES.add(new Hero(id++,"Arisia"));
		HEROES.add(new Hero(id++,"Asterix"));
		HEROES.add(new Hero(id++,"Atrocitus"));
		HEROES.add(new Hero(id++,"Bane"));
		HEROES.add(new Hero(id++,"Barbara Gordon"));
		HEROES.add(new Hero(id++,"Barry Allen"));
		HEROES.add(new Hero(id++,"Bart Allen"));
		HEROES.add(new Hero(id++,"Batgirl"));
		HEROES.add(new Hero(id++,"Batman"));
		HEROES.add(new Hero(id++,"Batwoman"));
		HEROES.add(new Hero(id++,"Beast Boy"));
		HEROES.add(new Hero(id++,"Billy Batson"));
		HEROES.add(new Hero(id++,"Bizarro"));
		HEROES.add(new Hero(id++,"Black Adam"));
		HEROES.add(new Hero(id++,"Black Canary"));
		HEROES.add(new Hero(id++,"Black Panther"));
		HEROES.add(new Hero(id++,"Blue Beetle"));
		HEROES.add(new Hero(id++,"Booster Gold"));
		HEROES.add(new Hero(id++,"Captain America"));
		HEROES.add(new Hero(id++,"Carol Ferris"));
		HEROES.add(new Hero(id++,"Catman"));
		HEROES.add(new Hero(id++,"Catwoman"));
		HEROES.add(new Hero(id++,"Conan the Barbarian"));
		HEROES.add(new Hero(id++,"Cyclone"));
		HEROES.add(new Hero(id++,"Damian Wayne"));
		HEROES.add(new Hero(id++,"Daredevil"));
		HEROES.add(new Hero(id++,"Darkseid"));
		HEROES.add(new Hero(id++,"Deadman"));
		HEROES.add(new Hero(id++,"Deadshot"));
		HEROES.add(new Hero(id++,"Deathstroke"));
		HEROES.add(new Hero(id++,"Detective Chimp"));
		HEROES.add(new Hero(id++,"Dick Grayson"));
		HEROES.add(new Hero(id++,"Doc Savage"));
		HEROES.add(new Hero(id++,"Doctor Strange"));
		HEROES.add(new Hero(id++,"Dream Girl"));
		HEROES.add(new Hero(id++,"Elektra"));
		HEROES.add(new Hero(id++,"Elongated Man"));
		HEROES.add(new Hero(id++,"Etrigan"));
		HEROES.add(new Hero(id++,"Fantastic Four"));
		HEROES.add(new Hero(id++,"Fire"));
		HEROES.add(new Hero(id++,"Ganthet"));
		HEROES.add(new Hero(id++,"Ghost Rider"));
		HEROES.add(new Hero(id++,"Green Arrow"));
		HEROES.add(new Hero(id++,"Green Lantern"));
		HEROES.add(new Hero(id++,"Guardians of the Galaxy"));
		HEROES.add(new Hero(id++,"Guy Gardner"));
		HEROES.add(new Hero(id++,"Gypsy"));
		HEROES.add(new Hero(id++,"Hal Jordan"));
		HEROES.add(new Hero(id++,"Harley Quinn"));
		HEROES.add(new Hero(id++,"Harvey Bullock"));
		HEROES.add(new Hero(id++,"Hawkeye"));
		HEROES.add(new Hero(id++,"Hellboy"));
		HEROES.add(new Hero(id++,"Huntress"));
		HEROES.add(new Hero(id++,"Ice"));
		HEROES.add(new Hero(id++,"Incredible Hulk"));
		HEROES.add(new Hero(id++,"Iron Fist"));
		HEROES.add(new Hero(id++,"Iron Man"));
		HEROES.add(new Hero(id++,"Jade"));
		HEROES.add(new Hero(id++,"James Gordon"));
		HEROES.add(new Hero(id++,"Jason Todd"));
		HEROES.add(new Hero(id++,"Jay Garrick"));
		HEROES.add(new Hero(id++,"Jeannette"));
		HEROES.add(new Hero(id++,"Jimmy Olsen"));
		HEROES.add(new Hero(id++,"John Stewart"));
		HEROES.add(new Hero(id++,"Joker"));
		HEROES.add(new Hero(id++,"Kate Spencer"));
		HEROES.add(new Hero(id++,"Killer Croc"));
		HEROES.add(new Hero(id++,"Kilowog"));
		HEROES.add(new Hero(id++,"Knockout"));
		HEROES.add(new Hero(id++,"Kon-El"));
		HEROES.add(new Hero(id++,"Krypto"));
		HEROES.add(new Hero(id++,"Kyle Rayner"));
		HEROES.add(new Hero(id++,"Larfleeze"));
		HEROES.add(new Hero(id++,"Lex Luthor"));
		HEROES.add(new Hero(id++,"Lois Lane"));
		HEROES.add(new Hero(id++,"Martian Manhunter"));
		HEROES.add(new Hero(id++,"Marvelman"));
		HEROES.add(new Hero(id++,"Maxwell Lord"));
		HEROES.add(new Hero(id++,"Mera"));
		HEROES.add(new Hero(id++,"Miss Martian"));
		HEROES.add(new Hero(id++,"Mr. Freeze"));
		HEROES.add(new Hero(id++,"Mr. Mxyzptlk"));
		HEROES.add(new Hero(id++,"Penguin"));
		HEROES.add(new Hero(id++,"Phantom Girl"));
		HEROES.add(new Hero(id++,"Phantom Stranger"));
		HEROES.add(new Hero(id++,"Poison Ivy"));
		HEROES.add(new Hero(id++,"Power Girl"));
		HEROES.add(new Hero(id++,"Ragdoll"));
		HEROES.add(new Hero(id++,"Ragman"));
		HEROES.add(new Hero(id++,"Ra's al Ghul"));
		HEROES.add(new Hero(id++,"Ray Palmer"));
		HEROES.add(new Hero(id++,"Renee Montoya"));
		HEROES.add(new Hero(id++,"Robin"));
		HEROES.add(new Hero(id++,"Saint Walker"));
		HEROES.add(new Hero(id++,"Scandal Savage"));
		HEROES.add(new Hero(id++,"Scarecrow"));
		HEROES.add(new Hero(id++,"Sinestro"));
		HEROES.add(new Hero(id++,"Spider-Man"));
		HEROES.add(new Hero(id++,"Starfire"));
		HEROES.add(new Hero(id++,"Stargirl"));
		HEROES.add(new Hero(id++,"Static"));
		HEROES.add(new Hero(id++,"Steel"));
		HEROES.add(new Hero(id++,"Stephanie Brown"));
		HEROES.add(new Hero(id++,"Sub-Mariner"));
		HEROES.add(new Hero(id++,"Sue Dibny"));
		HEROES.add(new Hero(id++,"Superboy Prime"));
		HEROES.add(new Hero(id++,"Supergirl"));
		HEROES.add(new Hero(id++,"Superman"));
		HEROES.add(new Hero(id++,"Talia al Ghul"));
		HEROES.add(new Hero(id++,"Ted Kord"));
		HEROES.add(new Hero(id++,"Teenage Mutant Ninja Turtles"));
		HEROES.add(new Hero(id++,"The Atom"));
		HEROES.add(new Hero(id++,"The Avengers"));
		HEROES.add(new Hero(id++,"The Defenders"));
		HEROES.add(new Hero(id++,"The Rocketeer"));
		HEROES.add(new Hero(id++,"The Shadow"));
		HEROES.add(new Hero(id++,"The Wasp"));
		HEROES.add(new Hero(id++,"Thom Kallor"));
		HEROES.add(new Hero(id++,"Tim Drake"));
		HEROES.add(new Hero(id++,"Two-Face"));
		HEROES.add(new Hero(id++,"Ventriloquist (Wesker)"));
		HEROES.add(new Hero(id++,"Wally West"));
		HEROES.add(new Hero(id++,"Watchmen"));
		HEROES.add(new Hero(id++,"Wolverine"));
		HEROES.add(new Hero(id++,"Wonder Girl"));
		HEROES.add(new Hero(id++,"Wonder Woman"));
		HEROES.add(new Hero(id++,"X-Men"));
		HEROES.add(new Hero(id++,"Zatanna"));
		HEROES.add(new Hero(id++,"Zatara"));
	}
}
