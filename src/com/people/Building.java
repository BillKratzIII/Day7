package com.people;

import java.util.ArrayList;

public class Building {

	public static void main(String[] args) {
		Student stuA = new Student("Brendan", 29, "Male", 6.2f, "8974", false, true, true);
		Student stuB = new Student("Mary", 35, "Female", 5.2f, "9847", true, true, true);
		Janitor jA = new Janitor("Kavita", 30, "Female", 5.0f , true, "Head Groundskeper");
		ArrayList<Person> ourBuilding = new ArrayList<>(3);
		ourBuilding.add(stuA);
		ourBuilding.add(stuB);
		ourBuilding.add(jA);
		
		for (int i=0; i<ourBuilding.size(); i++){
			System.out.println(ourBuilding.get(i).getName() + "'s age is " + ourBuilding.get(i).getAge());
		}
		
		for (int i=0; i<ourBuilding.size(); i++){
			System.out.println(ourBuilding.get(i).toString());
		}
	}

}
