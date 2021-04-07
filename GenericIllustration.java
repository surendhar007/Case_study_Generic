package com.poc.generic;

import java.util.ArrayList;

public class GenericIllustration {
	public static void main(String[] args) {

		String in = new String("Computer science");
		DoublyLinkedListGeneric<String> dllg = new DoublyLinkedListGeneric<String>(in);
		String in1 = new String("Maths");
		String in2 = new String("Physics");
		dllg.insertFirst(in1);
		dllg.insertFirst(in2);
		System.out.println("Inserting elements at first");
		dllg.displayElements();
		String in3 = new String("AI");
		String in4 = new String("Angular");
		dllg.insertLast(in3);
		dllg.insertLast(in4);
		System.out.println("Inserting elements at last");
		dllg.displayElements();
		String in5 = new String("React");
		String in6 = new String("MySql");
		dllg.InsertAtIndex(in5, 4);
		dllg.InsertAtIndex(in6, 2);
		System.out.println("Inserting elements at given index");
		dllg.displayElements();
		dllg.removeFirst();
		dllg.removeFirst();
		System.out.println("Removing elements at first");
		dllg.displayElements();
		dllg.removeLast();
		dllg.removeLast();
		System.out.println("Removing elements at last");
		dllg.displayElements();
		dllg.removeAtIndex(1);
		System.out.println("Removing elements at Given index");
		dllg.displayElements();
		dllg.removeAtIndex(1); // having some doubt
		System.out.println("Removing elements at Given index");
		dllg.displayElements();
		dllg.InsertAtIndex(in5, 1);
		dllg.insertFirst(in1);
		dllg.insertLast(in4);
		dllg.displayElements();

		dllg.insertLast(in1);
		dllg.insertFirst(in2);
		dllg.InsertAtIndex(in6, 2);
		System.out.println("Also inserting duplicate nodes");
		dllg.displayElements();
		String search = new String("React");
		int index = dllg.find(search);
		if (index >= 0) {
			System.out.println(search + " Element found at " + index);
		} else {
			System.out.println(search + " Not found");
		}
		System.out.println(" ");
		String search1 = new String("MySq");
		ArrayList<Integer> index1 = dllg.findAll(search1);
		if (index1.size() == 0) {
			System.out.println(search1 + " element is not present in the list");
		} else {
			String indexValues = index1.toString();
			System.out.println(search1 + " element is present in the indexes of list");
			System.out.println(indexValues);
		}
		System.out.println(" ");
		String search2 = new String("Maths");
		ArrayList<Integer> index2 = dllg.findAll(search2);
		if (index2.size() == 0) {
			System.out.println(search2 + " element is not present in the list");
		} else {
			String indexValues = index2.toString();
			System.out.println(search2 + " element is present in the indexes of list at");
			System.out.println(indexValues);
		}
		System.out.println(" ");

	}
}
