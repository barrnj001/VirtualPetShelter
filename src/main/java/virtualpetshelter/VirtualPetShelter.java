package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {

	private HashMap<String, PetNeeds> pets;

	VirtualPetShelter() {
		pets = new HashMap<String, PetNeeds>();
	}

	public void addPet(String name, int hunger, int playtime, int water) {
		PetNeeds newPet = new PetNeeds(name, hunger, playtime, water);
		pets.put(name, newPet);
	}

	public Collection<PetNeeds> getPets() {
		return pets.values();
	}

	public boolean hasPet(String pet) {
		PetNeeds selectedPet = pets.get(pet);

		boolean hasPet;
		if (selectedPet == null) {
			hasPet = false;
		}

		else {
			hasPet = true;
		}
		return hasPet;
	}

	public void feedSingularPet(String pet) {
		pets.get(pet).feedPet();
	}

	public void playSingularPet(String pet) {
		pets.get(pet).playWithPet();

	}

	public void waterSingularPet(String pet) {
		pets.get(pet).waterPet();
	}

	public void tickEmAll(String pet) {
		pets.get(pet).tick();
	}
	public int getHowHungry (String pet) {
		return pets.get(pet).getHunger();
	}

	public void removePet(String pet) {
		pets.remove(pet);
		
	}
	public void feedEmAll(String pet) {
		pets.get(pet).feedPet();
	}

}
