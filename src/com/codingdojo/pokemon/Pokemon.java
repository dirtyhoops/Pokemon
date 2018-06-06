package com.codingdojo.pokemon;

public class Pokemon extends AbstractPokemon{
	private static int pokemonCount = 0;
	private String name, type;
	private int health;
	
	public Pokemon(String name, String type, int health) {
		this.setName(name);
		this.setType(type);
		this.setHealth(health);
		pokemonCount++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}
	
}
