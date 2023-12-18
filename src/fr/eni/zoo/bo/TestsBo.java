package fr.eni.zoo.bo;

import java.util.ArrayList;
import java.util.List;


public class TestsBo {

	public static void main(String[] args) {
		System.out.println("Partie 1 - Tests de la couche métier.");
		//partie utilisateur
		List<Animal> Animals = List.of(
				new Animal(1, "Simba", false, TypeAnimal.LION),
				new Animal(2, "Coco", true, TypeAnimal.SINGE),
				new Animal(3, "Gerald", false, TypeAnimal.GIRAFE),
				new Animal(4, "dumbo", true, TypeAnimal.ELEPHANT));
		System.out.println("Les Animaux");
		for (Animal animal : Animals) {
			System.out.println(animal);
		}
		
		//partie métier
		Adresse a1 = new Adresse(1, 9, " chemin des bois", "44000", "Nantes");
		Adresse a2 = new Adresse(2, "1 rue de la forêt", "35000", "Rennes");
		Adresse a3 = new Adresse(3, "2b rue Faraday", "44800", "Saint Herblain"); 
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		
		Salarie s1 = new Soignant(1, "Dupont", "Daniel", 1800, TypeAnimal.LION);
		Salarie s2 = new Soignant(2, "Martin","Julie", 1750, TypeAnimal.SINGE);
		Salarie s3 = new Gardien(3, "Dubois", "Sophie", 1600, true);
		Salarie s4 = new Gardien(4, "Leclerc", "Jacques", 1700, false);

		//Polymorphisme
		List<Salarie> tempContacts = new ArrayList<>();
		tempContacts.add(s1);
		tempContacts.add(s2);
		tempContacts.add(s3);
		tempContacts.add(s4);		
		System.out.println("Les salariés");
		for (Salarie contact : tempContacts) {
			System.out.println(contact);
		}	
	}
}
