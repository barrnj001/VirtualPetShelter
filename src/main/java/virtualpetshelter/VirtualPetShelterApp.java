package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Cleveland Pet Shelter,");
		VirtualPetShelter shelter = new VirtualPetShelter();
		// To-Do list: create a hashmap of pets
		// give each pet individual needs
		// make it possible to adopt pet
		// make it possible to admit pet

		Scanner input = new Scanner(System.in);
		String userInput = "";

		shelter.addPet("Johnny", 50, 50, 50);
		shelter.addPet("Melissa", 50, 50, 50);
		shelter.addPet("Harold", 50, 50, 50);

		while (!userInput.equals("quit")) {
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("1. Feed a single pet");
			System.out.println("2. Play with a certain pet");
			System.out.println("3. Water a certain pet");
			System.out.println("4. Feed all pets.");
			System.out.println("5. Water all pets.");
			System.out.println("6. Admit a pet");
			System.out.println("7. Adopt a pet");
			System.out.println();
			System.out.println("Pet" + "\t" + "Hunger" + "\t" + "Playtime" + "\t" + "Water");
			System.out.println();

			for (PetNeeds pets : shelter.getPets()) {

				System.out.println(pets.getPetName() + "\t" + pets.getHunger() + "\t" + pets.getPlaytime() + "\t" + "\t"
						+ pets.getWater());
			}
			userInput = input.nextLine();

			if (userInput.equals("1")) {

				System.out.println("Which pet would you like to feed?");
				String petToFeed = input.nextLine();

				if (shelter.hasPet(petToFeed)) {
					shelter.feedSingularPet(petToFeed);
					System.out.println("Feeding " + petToFeed + ".");
				} else {
					System.out.println("That pet doesn't exist.");
					System.out.println();
				}

			} else if (userInput.equals("2")) {

				System.out.println("Which pet would you like to play with?");
				String pet = input.nextLine();

				if (shelter.hasPet(pet)) {
					System.out.println("Playing with " + pet + ".");
					shelter.playSingularPet(pet);
				}

				else {
					System.out.println("That pet doesn't exist.");
					System.out.println();
				}

			} else if (userInput.equals("3")) {
				System.out.println("Which pet would you like to water?");
				String pet = input.nextLine();

				if (shelter.hasPet(pet)) {
					System.out.println("You give " + pet + " a fresh bowl of water.");
					shelter.waterSingularPet(pet);
				} else {
					System.out.println("That pet doesn't exist");
					System.out.println();
				}

			} else if (userInput.equals("4")) {
				for (PetNeeds pets : shelter.getPets()) {
					pets.feedPet();
				}
				
			} else if (userInput.equals("5")) {
				for (PetNeeds pets : shelter.getPets()) {
					pets.waterPet();
				}
			}
			  else if (userInput.equals("6")) {
				System.out.println("What is the name of your pet?");
				String name = input.nextLine();

				if (shelter.hasPet(name)) {
					System.out.println("That pet is already in the shelter...");
					continue;
				}
				int hunger = 50;
				int playtime = 50;
				int water = 50;

				shelter.addPet(name, hunger, playtime, water);

				System.out.println(name
						+ " has been successfully admitted to the shelter! Their needs have mellowed out in their time spent here.");
			} else if (userInput.equals("7")) {
				System.out.println("Which pet would you like to adopt?");
				String name = input.nextLine();

				if (!shelter.hasPet(name)) {
					System.out.println("That pet is not in our shelter...");
					continue;
				}
				shelter.removePet(name);
				System.out.println("Thanks for giving " + name + " a happy home!");
			} else {
				System.out.println("Sorry, what was that?");
			}
			for (PetNeeds pets : shelter.getPets()) {
				pets.tick();
			}

		}
		System.out.println("Thank you for visiting the shelter!");

	}

}
