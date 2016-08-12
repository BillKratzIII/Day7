package zooassignment;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		ArrayList<Animal> zooAnimals = new ArrayList<>();
		zooAnimals.add(new Elephant("Arthur", true, "Male", 4, "Grey", "African Elephant"));
		zooAnimals.add(new Zebra("Frank", true, "Female", 4, "White & Black", "Zebra"));
		zooAnimals.add(new Gorilla("Steve", true, "Male", 2, "Brown", "Gorilla"));
		zooAnimals.add(new Kangaroo("Roo", true, "Female", 2, "Brown", "Kangaroo"));
		zooAnimals.add(new Bat("Echo", true, "Male", 2, "Black", "Fruit Bat"));
		zooAnimals.add(new Owl("Hoot", true, true, false, "White", "Snow Owl"));
		zooAnimals.add(new Eagle("George", true, true, false, "Brown & White", "Bald Eagle"));
		zooAnimals.add(new Ostrich("Joe", true, false, false, "Black", "Ostrich"));
		zooAnimals.add(new Penguin("Ted", true, false, true, "Black & White", "Penguin"));
		zooAnimals.add(new Flamingo("Jim", true, false, false, "Pink", "Flamingo"));
		zooAnimals.add(new Snake("Monty", true, 0, true, "Green & Black", "Python"));
		zooAnimals.add(new Turtle("Speedy", true, 4, true, "Green", "Terrapin"));
		zooAnimals.add(new Crocodile("Aly", true, 4, true, "Green", "Saltwater Crocodile"));
		zooAnimals.add(new Lizard("Lizzy", true, 4, false, "Green", "Iguana"));
		zooAnimals.add(new Alligator("Bob", true, 4, true, "Green", "American Alligator"));
		zooAnimals.add(new Frog("Mr. Frog", true, true, 4, "Green", "Tree Frog"));
		zooAnimals.add(new Salamander("Sam", true, true, 4, "Black", "Salamander"));
		zooAnimals.add(new Toad("Harry", true, true, 4, "Brown", "Horny Toad"));
		zooAnimals.add(new Newt("Newton", true, true, 4, "Black", "Newt"));
		zooAnimals.add(new Caecilian("Cecil", true, false, 0, "Grey", "Caecilian"));
		zooAnimals.add(new Koi("Karen", true, false, true, "Orange", "Koi Fish"));
		zooAnimals.add(new Shark("Henry", true, true, true, "Grey", "Great White Shark"));
		zooAnimals.add(new Piranha("Peppy", true, true, true, "Grey", "Piranha"));
		zooAnimals.add(new Eel("Evan", true, true, true, "Green", "American Eel"));
		zooAnimals.add(new Tuna("Tommy", true, true, true, "Blue", "Bluefin Tuna"));

		System.out.println("Today at the zoo I saw:");
		for (int i = 0; i < zooAnimals.size(); i++) {
			System.out.println("-" + zooAnimals.get(i).toString());
			zooAnimals.get(i).eat();
		}

	}

}
