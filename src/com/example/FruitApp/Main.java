package com.example.FruitApp;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		
		Fruit s1 = new Fruit(101,"Apple",1500);
		fl.add(s1);
		Fruit s2 = new Fruit (102,"Orange",2000);
		fl.add(s2);
		Fruit s3 = new Fruit (103, "Kiwi", 2500);
		fl.add(s3);
		Fruit s4 = new Fruit (104,"Graph",5000);
		fl.add(s4);
		Fruit s5 = new Fruit (105, "Banana", 3000);
		fl.add(s5);
		Fruit s6 = new Fruit (106, "Cherry", 5000);
		fl.add(s6);
		Fruit s7 = new Fruit (107,"Guava",10000);
		fl.add(s7);
		Fruit s8 = new Fruit (108,"Grapefruit",8000);
		fl.add(s8);
		Fruit s9 = new Fruit (109, "Kumquat", 8500);
		fl.add(s9);
		Fruit s10 = new Fruit (110, "Watermelon",10000);
		fl.add(s10);
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arraylist (ordered)
		for (Fruit s:fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl,new FruitComparatorDesc());
		//Traverse elements of arraylist (reverse orderd)
		for (Fruit s:fl) {
			System.out.println(s.toString());
		}
	}

}
