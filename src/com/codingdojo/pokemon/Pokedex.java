package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon{
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Pokemon Info \nName: " + pokemon.getName() + "\nType: " + pokemon.getType() + "\nHealth: " + pokemon.getHealth());
	}
}
