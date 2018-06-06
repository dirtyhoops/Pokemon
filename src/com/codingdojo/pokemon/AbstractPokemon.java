package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		System.out.println(pokemon.getName() + " was attacked and lost 10 health");
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
}