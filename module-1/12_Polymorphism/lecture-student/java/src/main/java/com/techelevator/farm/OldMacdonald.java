package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable tractor = new Tractor();
		Singable cow = new Cow();
		Singable chicken = new Chicken();
		Singable pig = new Pig();

		Singable[] singables = new Singable[] {tractor, cow, chicken, pig};

		System.out.println("DJ KHALED... !");

		for (Singable singable: singables) {

			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonal had a farm...");
			System.out.println("And on his farm there was a " + name);
			System.out.println("And it make the sound " + sound);
		}

//		Sellable tractor2 = new Tractor();
		Sellable cow2 = new Cow();
		Sellable pig2 = new Pig();

		List<Sellable> farmAnimal = new ArrayList<Sellable>();
		farmAnimal.add(cow2);
		farmAnimal.add(pig2);

		for(Sellable sellable: farmAnimal) {
			System.out.println(sellable.getName() + " " + sellable.getPrice());
		}

//		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken() };
//
//		for (FarmAnimal animal : farmAnimals) {
//			String name = animal.getName();
//			String sound = animal.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();

//		}
	}
}