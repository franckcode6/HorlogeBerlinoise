package fr.humanbooster.horloge_de_berlin;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Partie declarative
		int heures = 0;
		int minutes = 0;
		int moduloHeures = 0;
		int moduloMinutes = 0;
		String grandO = "";
		String petitO = "";
		String grandX = "";
		String petitX = "";
		Scanner scanner = new Scanner(System.in);

		// Partie traitement
		//On stock la saisie des heures
		System.out.print("Entrez les heures (0-23) :");
		heures = scanner.nextInt();

		//On stock la saisie des minutes
		System.out.print("Entrez les heures (0-59) :");
		minutes = scanner.nextInt();
		scanner.close();
		
		//Calcul des petits O
		moduloHeures = heures % 5;
		//Calcul des gros O
		heures = (heures - moduloHeures) / 5;

		//Calcul des petits X
		moduloMinutes = minutes % 5;
		//Calcul des gros X
		minutes = (minutes - moduloMinutes) / 5;
		
		//Affichage des résultats
		for (int i = 0; i < heures; i++) {
			grandO += "O";
		}
		
		for (int i = 0; i < moduloHeures; i++) {
			petitO += "o";
		}
		
		for (int i = 0; i < minutes; i++) {
			grandX += "X";
		}
		
		for (int i = 0; i < moduloMinutes; i++) {
			petitX += "x";
		}
		
		//Affichage des heures par 5
		System.out.println(grandO);
		//Affichage du restant des heures
		System.out.println(petitO);
		//Affichage des minutes par 5
		System.out.println(grandX);
		//Affichage du restant des minutes
		System.out.println(petitX);
	}
}
