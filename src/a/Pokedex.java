package a;

import java.util.ArrayList;

public class Pokedex {
	static ArrayList<Pokemon> pokedex = new ArrayList<>();

	public static void addToPokedex(Pokemon pokemon) {
		pokedex.add(pokemon);
	}



	public Pokedex() {
		Pokemon pokemon4 = new Pokemon(4, "fueguer", 3, "Fuego", 2);
		Pokemon pokemon5 = new Pokemon(5, "planter", 2, "Planta", 3);
		Pokemon pokemon6 = new Pokemon(6, "aguer", 5, "Agua", 4);

		Pokemon pokemon7 = new Pokemon(1, "Charmeleon", 3, "Fuego", 2, 2);
		Pokemon pokemon8 = new Pokemon(2, "Venus", 4, "Planta", 3, 2);
		Pokemon pokemon9 = new Pokemon(3, "Tortoise", 4, "Agua", 2, 2);
		pokedex.add(pokemon4);
		pokedex.add(pokemon5);
		pokedex.add(pokemon6);
		pokedex.add(pokemon7);
		pokedex.add(pokemon8);
		pokedex.add(pokemon9);
		
	}
	
	

}
