package virtualpetshelter;

import java.util.HashMap;

public class PetNeeds {

	private String name;
	private int hunger = 50;
	private int playtime = 50;
	private int water = 50;

	PetNeeds(String name, int hunger, int playtime, int water) {
		this.name = name;
		this.hunger = hunger;
		this.playtime = playtime;
		this.water = water;
	}

	public String getPetName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getPlaytime() {
		return playtime;
	}
	public int getWater() {
		return water;
	}
	
	public void feedPet() {
		hunger += 20;
	}

	public void playWithPet() {
		playtime += 20;
		
	}
	public void waterPet() {
		water += 20;
	}
	public void tick() {
		hunger -= 5;
		playtime -= 5;
		water -= 5;
		
	}

}
