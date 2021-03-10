package com.techelevator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		List<String> names = new ArrayList<String>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Boromir");
		names.add("Gimli");
		names.add("Legolas");

		System.out.println(names.size());


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for(int i=0; i < names.size(); i++ ) {
			// Arrays: to access are element I had to say arr[i]
			String name = names.get(i);
			System.out.println(name);
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");

		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add (2, "David");
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean containsBalrog = names.contains("Gimli");
		System.out.println(containsBalrog);

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int gandalfLocation = names.indexOf("Gandalf");
		System.out.println(gandalfLocation);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		/*
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		*/
		for(String name : names) {
			System.out.println(name);
		}

		System.out.println("STRANGE SITUATION");
		// 1. Create a list, FAST!
		List<Integer> numList = List.of(1, 2, 4, 5, 0 , -1);
		// 1a. Quickly print out a list
		System.out.println(numList);
		// 1b. List.of(...) has problem, the list it creates is immutable
		// Won't work:
		// numList.add(34);

		// 2. Lets transform a list into an array:
		List<Boolean> booleansList = new ArrayList<Boolean>();
		booleansList.add(true);
		booleansList.add(false);
		booleansList.add(true);

		// 2a. shortcut way of transforming it into an array :
		// problem is that the syntax hard to remember

//		Boolean [] booleanArr = booleansList.toArray(new Boolean[0]);
//		for (int i=0; i <booleanArr.length; i++) {
//			System.out.println(booleanArr[i]);
//		}

		// 2b. RECOMMENDED method:
		Boolean [] booleanArr = new Boolean[booleansList.size()];
		for (int i=0; i < booleansList.size(); i++) {
			booleanArr[i] = booleansList.get(i);
		}
		for (int i=0; i < booleanArr.length; i++) {
			System.out.println(booleanArr[i]);
		}


		// 3. Convert an array to a list:
		// 3a. Shortcut method, but has drawbacks:
		System.out.println("************************");
		String [] arrString = {"potato", "carrot", "tomatoes"};
//		List<String> arrList = Arrays.asList(arrString);
//		arrString[0] = "celery";

		// 3b. Long, boring, but it works
		List<String> soupIngredients = new ArrayList<String>();
		for (int i=0; i < arrString.length; i++) {
			soupIngredients.add(arrString[i]);
		}


		// print out the array:
		for (int i=0; i < arrString.length; i++) {
			System.out.println(arrString[i]);
		}

		// print out the list:
		System.out.println(soupIngredients);
	}
}
