package a;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		armstrong(8208);
//		RiceCalculator(89);
//		mcd(20, 12);
//		IsPalindrome("holaloh");
//		IsPalindromeInteger(202);
//		Reverse("alan");
		

		Pokemon pokemon1 = new Pokemon(1, "Charmander", 1, "Fuego", 1);
		Pokemon pokemon2 = new Pokemon(2, "Bulbasur", 1, "Planta", 1);
		Pokemon pokemon3 = new Pokemon(3, "Squirtle", 1, "Agua", 1);



		Pokemon.addPokemon(pokemon1);
		Pokemon.addPokemon(pokemon2);
		Pokemon.addPokemon(pokemon3);
		
		Pokedex pokedex = new Pokedex();





		Scanner sc = new Scanner(System.in);
		Pokemon.showPokemonList();

		System.out.println("Elige un pokemon");
		int choosePokemon = sc.nextInt();

		Pokemon p = Pokemon.pokemonList.get(choosePokemon - 1);

		int options;
		System.out.println("Que quieres hacer\n 1=Entrenar\n 2=Combatir\n 3=Evolucionar\n 4=Mirar mis pokemon\n5=Salir");

		do {

			Double random = Math.random()* pokedex.pokedex.size();
			Double randomPokemonNumber = Math.floor(random) ;
			int randomPokemon = randomPokemonNumber.intValue();

			Double random2 = Math.random()* 10;
			Double randomPokemonNumber2 = Math.floor(random2) ;
			int randomPower = randomPokemonNumber2.intValue();
			
			Double random3 = Math.random()* 10;
			Double randomPokemonNumber3 = Math.floor(random3) ;
			int randomLevel = randomPokemonNumber3.intValue();
			
			Double random4 = Math.random()* 5;
			Double randomPokemonNumber4 = Math.floor(random4) ;
			int randomEvolution = randomPokemonNumber4.intValue();
			
			//Pokemon pRandom = pokedex.pokedex.get(randomPokemon);
			Pokemon pRandom2 = new Pokemon(pokedex.pokedex.get(randomPokemon).id,pokedex.pokedex.get(randomPokemon).name,randomPower,pokedex.pokedex.get(randomPokemon).type,randomLevel,randomEvolution);


			 options = sc.nextInt();

			switch(options) {
			  case 1:
				 p.train(p);
			    break;
			  case 2:
			  p.fight(p, pRandom2);
			    break;
			  case 3:
				  p.upgrade(p);
			    break;
			  case 4:
				  p.showPokemonList();
			  default:
			    // code block
			}
			
		}while(options != 5);
		
	}

	public static void armstrong(Integer number) {
		String strNum = number.toString();
		double armstrong = 0;

		for (int i = 0; i < strNum.length(); i++) {
			Character c = strNum.charAt(i);
			int cNumber = Integer.parseInt(String.valueOf(c));

			armstrong += Math.pow(cNumber, strNum.length());
		}
		if (number == armstrong) {
			System.out.println("Es un número de armstrong!!");
		} else {
			System.out.println("No es un número de armstrong");
		}
	}

	public static void RiceCalculator(int rice) {
		int pack5 = 0;
		int pack3 = 0;
		int x = 0;
		if (rice >= 5) {
			pack5 += rice / 5;
			x = rice % 5;

		}
		if (x >= 3) {
			pack3 += x / 3;
			x = rice % 3;

		}
		System.out.println("paquetes de 5=" + pack5 + "\npaquetes de 3=" + pack3 + "\npaquetes de 1=" + x);
	}

	public static void mcd(int x, int y) {
		int a = 0;
		while (x != 0) {
			a = x;

			x = y % x;

			y = a;

		}
		System.out.println(a);
	}

	public static void IsPalindrome(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		String inverse = stringBuilder.reverse().toString();
		if (string.equals(inverse)) {
			System.out.println("Is palindrome");
		} else {
			System.out.println("Is not a palidrome");
		}
	}

	public static void IsPalindromeInteger(Integer number) {
		StringBuilder stringBuilder1 = new StringBuilder(number.toString());
		String inverseInt = stringBuilder1.reverse().toString();
		if (number.toString().equals(inverseInt)) {
			System.out.println("Is a palindrome");
		} else {
			System.out.println("Is not a palidrome");
		}
	}

	public static void Reverse(String str) {
		String strInverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strInverse += str.charAt(i);
		}
		System.out.println(strInverse);
	}

}
