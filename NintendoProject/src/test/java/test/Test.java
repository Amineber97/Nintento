package test;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console ps = new Console("ps5");
		Console xbox = new Console("xbox");
		
		Jeu jeu1 = new Jeu("God of war", ps);
		Jeu jeu2 = new Jeu("PES 2022", ps);
		Jeu jeu3 = new Jeu("FIFA 2022", xbox);
		Jeu jeu4 = new Jeu("GTA V", ps);
		Jeu jeu5 = new Jeu("PUBG", xbox);




	}

}
