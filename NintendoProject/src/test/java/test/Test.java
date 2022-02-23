package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import metier.Boutique;
import metier.Console;
import metier.Jeu;
import metier.Client;


import metier.Boutique;

public class Test {

	public static void main(String[] args) {

		Console ps = new Console("ps5");
		Console xbox = new Console("xbox");
		
		Boutique boutique = new Boutique("Test","");
		
		Jeu jeu1 = new Jeu("God of war", ps, boutique);
		Jeu jeu2 = new Jeu("PES 2022", ps, boutique);
		Jeu jeu3 = new Jeu("FIFA 2022", xbox, boutique);
		Jeu jeu4 = new Jeu("GTA V", ps, boutique);
		Jeu jeu5 = new Jeu("PUBG", xbox, boutique);


		
		Boutique b = new Boutique ("zara","rue des peupliers");

		List<Jeu> a1 = new ArrayList();
		Collections.addAll(a1, jeu1, jeu2);
		
		
		Client c1 = new Client("K", "Momo", a1);
		Client c2 = new Client("Mario", "Amine", a1);
	}

}
