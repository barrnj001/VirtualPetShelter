package virtualpetshelter;

import static org.junit.Assert.assertThat;
import java.util.Collection;
import java.util.HashMap;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import org.junit.Test;

public class PetShelterTest {

	@Test
	public void ShouldBeAbleToAddPet() {
		VirtualPetShelter pets = new VirtualPetShelter();
		pets.addPet("Alex", 1, 2, 1);
		assertTrue(pets.hasPet("Alex"));
	}
	
	@Test
	public void ShouldBeAbleToFeedPet() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addPet("Alex", 50, 30, 1);
		String pet = "Alex";
		int hungerBefore = shelter.getHowHungry(pet);
		shelter.feedSingularPet(pet);
		int hungerAfter = shelter.getHowHungry(pet);
		assertThat(hungerBefore, (lessThan(hungerAfter)));
	}
	
	@Test
	public void ShouldBeAbleToRemovePet() {
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addPet("Alex", 40, 40, 40);
		String petToRemove = "Alex";
		shelter.removePet(petToRemove);
		assertTrue(!shelter.hasPet("Alex"));
	}

}
