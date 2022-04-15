package fr.humanbooster.horloge_de_berlin;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Parti declarative
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
		System.out.print("Entrez les heures (0-23) :");
		heures = scanner.nextInt();

		System.out.print("Entrez les heures (0-59) :");
		minutes = scanner.nextInt();
		scanner.close();

		moduloHeures = heures % 5;
		heures = (heures - moduloHeures) / 5;

		moduloMinutes = minutes % 5;
		minutes = (minutes - moduloMinutes) / 5;
		
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
		
		System.out.println(grandO);
		System.out.println(petitO);
		System.out.println(grandX);
		System.out.println(petitX);
	}
}
