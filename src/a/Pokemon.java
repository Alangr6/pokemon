package a;

import java.util.ArrayList;

public class Pokemon {

	static ArrayList<Pokemon> pokemonList = new ArrayList<>();

	int id;
	String name;
	int level;
	String type;
	double power;
	int evolution = 1;

	public void train(Pokemon pokemon) {
		this.level++;
		System.out.println("El pokemon " + pokemon.name + " esta al nivel " + this.level);
	}
	
	

	public Pokemon(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}



	public static void addPokemon(Pokemon pokemon) {
		pokemonList.add(pokemon);
	}

	public static void showPokemonList() {
		for (Pokemon pokemon : pokemonList) {
			System.out.println(pokemon);
		}
	}

	public void fight(Pokemon p, Pokemon p2) {
		switch (p.type) {
		case ("Fuego"):
			if (p2.type.equals("Agua")) {
				p.power = (p.power / 2) * p.evolution;

			} else if (p2.type.equals("Planta")) {
				p.power = (p.power * 2) * p.evolution;
			}
			break;
		case ("Planta"):
			if (p2.type.equals("Agua")) {
				p.power = (p.power * 2) * p.evolution;
			} else if (p2.type.equals("Fuego")) {
				p.power = (p.power / 2) * p.evolution;
			}
			break;
		case ("Agua"):
			if (p2.type.equals("Fuego")) {
				p.power = (p.power / 2) * p.evolution;
			} else if (p2.type.equals("Planta")) {
				p.power = (p.power * 2) * p.evolution;
			}
			break;
		default:
		}
		if (p.power + p.level > p2.power + p2.level) {
			System.out.println("Has ganado a " + p2.name + " con nivel:" + p2.level);
			addPokemon(p2);
			p.level++;
		} else if (p.power + p.level < p2.power + p2.level) {
			System.out.println("Has perdido contra " + p2.name + " con nivel:" + p2.level);
			p2.level++;
		} else {
			System.out.println("Has quedado empate contra " + p2.name + " con nivel:" + p2.level);
		}

	}

	public Pokemon(int id, String name, int level, String type, double power, int evolution) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.type = type;
		this.power = power;
		this.evolution = evolution;
	}

	public void upgrade(Pokemon pokemon) {
		if (pokemon.level >= 4) {
			pokemon.level = pokemon.level - 3;
			pokemon.evolution = pokemon.evolution + 1;
		}
		if (pokemon.name.equals("Charmander") && pokemon.evolution == 2) {
			pokemon.setName("Charmeleon");
		} else if (pokemon.name.equals("Charmeleon") && pokemon.evolution == 3) {
			pokemon.setName("Charizard");

		}
		if (pokemon.name.equals("Bulbasur") && pokemon.evolution == 2) {
			pokemon.setName("Ivysaur");
		} else if (pokemon.name.equals("Ivysaur") && pokemon.evolution == 3) {
			pokemon.setName("Venasaur");

		}
		if (pokemon.name.equals("Squirtle") && pokemon.evolution == 2) {
			pokemon.setName("Tortoise");
		} else if (pokemon.name.equals("Tortoise") && pokemon.evolution == 3) {
			pokemon.setName("Blastoise");

		}

		System.out.println(
				"Su pokemon acaba de evolucionar a " + pokemon.name + " ahora mismo es de evolucion" + this.evolution);

	}

	public static ArrayList<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public static void setPokemonList(ArrayList<Pokemon> pokemonList) {
		Pokemon.pokemonList = pokemonList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public int getEvolution() {
		return evolution;
	}

	public void setEvolution(int evolution) {
		this.evolution = evolution;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", level=" + level + ", type=" + type + ", power=" + power
				+ ", evolution=" + evolution + "]";
	}

	public Pokemon(int id, String name, int level, String type, int power) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.type = type;
		this.power = power;

	}

	public Pokemon() {

	}
}
