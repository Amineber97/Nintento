package test;
import metier.Boutique;
import metier.Console;
import metier.Jeu;
import metier.Client;
import metier.Salon;

public class Test {

	public static void main(String[] args) {

		Console ps = new Salon("ps5",20,"20/11/2021");
		Console xbox = new Salon("xbox",25,"10/10/2020");
		
		Boutique boutique = new Boutique("Test","");
		
		Jeu jeu1 = new Jeu("God of war", ps, boutique);
		Jeu jeu2 = new Jeu("PES 2022", ps, boutique);
		Jeu jeu3 = new Jeu("FIFA 2022", xbox, boutique);
		Jeu jeu4 = new Jeu("GTA V", ps, boutique);
		Jeu jeu5 = new Jeu("PUBG", xbox, boutique);


		
		Boutique b = new Boutique ("zara","rue des peupliers");

		
		Client c1 = new Client("K", "Momo");
		Client c2 = new Client("Mario", "Amine");
	}

}
