package com.codingdojo.pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon pokemon1 = pokedex.createPokemon("Pikachu",  "Electric",  30);
		Pokemon pokemon2 = pokedex.createPokemon("Kabuto",  "Grass",  60);
		pokedex.pokemonInfo(pokemon1);
		pokedex.pokemonInfo(pokemon2);
		pokemon2.attackPokemon(pokemon1);
		pokedex.pokemonInfo(pokemon1);
		
	}
}
