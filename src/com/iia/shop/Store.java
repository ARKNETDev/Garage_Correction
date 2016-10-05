package com.iia.shop;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Voiture;

public class Store {

	private static ArrayList<Voiture> voiture;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		voiture = new ArrayList<Voiture>();
		Voiture v1 = new Voiture("Peugeot", "206", "Gris", 50, 2006, 4500);
		Voiture v2 = new Voiture("Audi", "A5", "Noir - Marron", 110, 2013, 6000);
		voiture.add(v1);
		voiture.add(v2);
		System.out.println("Gestion des vehicules");
		System.out.println("");
		System.out.println("1 - Créer une nouvelle voiture");
		System.out.println("2 - mettre à jour une voiture");
		System.out.println("3 - voir toutes les voitures");
		System.out.println("4 - Sélectionner une voiture");
		System.out.println("5 - Supprimer une voitures");
		System.out.println("");

		System.out.println("Votre choix");
		int choice = scan.nextInt();
		Voiture voiture;
		switch (choice) {
		case 1:
			voiture = new Voiture();
			setVehicule(voiture);

			create(voiture);
			break;

		case 2:
			Voiture readvoiture = ReadOne(scan.nextInt());
			DisplayCar(voiture);
			break;

		case 3:
			ArrayList<Voiture> voiture = ReadAll();

			for (Voiture voiture2 : voiture) {
				DisplayCar(voiture2);
			}
			
			break;

		case 4:
			System.out.println("Saisir le numéro de la voiture :");
			Voiture ReadCar = ReadOne(scan.nextInt());

			DisplayCar(ReadCar);

			setVehicule(ReadCar);
			break;

		case 5:
			System.out.println("Saisir le numéro de la voiture :");
			delete(scan.nextInt());
			break;

		default:
			break;
		}
	}

	private static void create(Voiture vehicule) {
		voiture.add(vehicule);
	}

	private static void delete(int i) {
		voiture.remove(i);
	}

	private static ArrayList<Voiture> ReadAll() {
		return voiture;
	}

	private static Voiture ReadOne(int i) {
		return voiture.get(i);
	}

	private static void DisplayCar(Voiture vehicule) {
		System.out.println("Marque : " + vehicule.getMarque());
		System.out.println("Marque : " + vehicule.getModel());
		System.out.println("Marque : " + vehicule.getColor());
		System.out.println("Marque : " + vehicule.getSpeed());
		System.out.println("Marque : " + vehicule.getYear());
		System.out.println("Marque : " + vehicule.getPrice());
	}

	private static void setVehicule(Voiture vehicule) {
		System.out.println("Saisir la marque de la voiture :");
		vehicule.setMarque(scan.nextLine());
		// System.out.println("");
		System.out.println("Saisir le modele de la voiture :");
		vehicule.setModel(scan.nextLine());
		// System.out.println("");
		System.out.println("Saisir la couleur de la voiture :");
		vehicule.setColor(scan.nextLine());
		// System.out.println("");
		System.out.println("Saisir l'année de la voiture :");
		vehicule.setYear(scan.nextInt());
		// System.out.println("");
		System.out.println("Saisir la vitesse de la voiture :");
		vehicule.setSpeed(scan.nextInt());
		// System.out.println("");
		System.out.println("Saisir le prix de la voiture :");
		vehicule.setPrice(scan.nextDouble());
		System.out.println("");
	}

}
