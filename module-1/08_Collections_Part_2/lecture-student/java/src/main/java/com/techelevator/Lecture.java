package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declare a map with a key of String, and a value of String
		Map<String, String> nameToZip = new HashMap<String, String>();

		// Add three items to the MapL
		nameToZip.put("David", "44128");
		nameToZip.put("Dan", "44124");
		nameToZip.put("Elizabeth", "44812");

		System.out.println("The map has " + nameToZip.size() + " key-value pairs.");

		String davidZip = nameToZip.get("David");
		String danZip = nameToZip.get("Dan");
		String elizabethZip = nameToZip.get("Elizabeth");

		System.out.println("David lives in " + davidZip);
		System.out.println("Dan lives in " + danZip);
		System.out.println("Elizabeth lives in " + elizabethZip);

		boolean containsElizabeth = nameToZip.containsKey("Elizabeth");
		boolean containAndrew = nameToZip.containsKey("Andrew");

		System.out.println("Contains Elizabeth: " + containsElizabeth);
		System.out.println("Contains Andrew " + containAndrew);

		boolean contains44124 = nameToZip.containsValue("44124");
		System.out.println("Someone with a value of 44124? " + contains44124);

		nameToZip.remove("Dan");
		System.out.println(nameToZip);
		System.out.println(nameToZip.size());

		for(Map.Entry<String, String> nameZip : nameToZip.entrySet()) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}

		System.out.println("Example of keyset");
		Map<Integer, String> employees = new HashMap<Integer, String>();
		employees.put(1000, "Steve");
		employees.put(2000, "Alice");
		employees.put(3000, "T-Pain");
		employees.put(4000, "Steve");

		Set<Integer> employeeIds = employees.keySet();
		for (Integer id : employeeIds) {
			String mapValue = employees.get(id);
			System.out.println(mapValue);
		}


	}

}
