package myPackage.two;

import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nombre_a_la_fin = 0;
		int nombre_actuel = 0;
		
		ArrayList<Integer> liste_1 = new ArrayList<Integer>();
		ArrayList<Integer> liste_2 = new ArrayList<Integer>();
		
		do {
			System.out.println("Veuillez entrer des chiffres, pour vous arretez taper 0");
			nombre_actuel = sc.nextInt();
			if (nombre_actuel == 0)
				break;
			if (nombre_a_la_fin != nombre_actuel) {
				liste_1.add(nombre_actuel);
			}
			nombre_a_la_fin = nombre_actuel;
		} while (true);
		do {
			System.out.println("Enter an int to add to the liste_2 and 0 to end.");
			nombre_actuel = sc.nextInt();
			if (nombre_actuel == 0)
				break;
			if (nombre_a_la_fin != nombre_actuel) {
				liste_2.add(nombre_actuel);
			}
			nombre_a_la_fin = nombre_actuel;
		} while (true);
		if (liste_1.size() != 0) {
			for (int i : liste_1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
		if (liste_2.size() != 0) {
			for (int i : liste_2) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
		if (liste_1.size() == 0 && liste_2.size() == 0) {
			System.out.println("vide");
			System.exit(0);
		} else {
			for (int i : liste_2)
				if (!liste_1.contains(i))
					liste_1.add(i);
		}
		for (int i : liste_1) {
			System.out.print(i + " ");
		}
	}

}
