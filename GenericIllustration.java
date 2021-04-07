package com.poc.generic;

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
		String search = new String("Maths");
		int index = dllg.find(search);
		if (index >= 0) {
			System.out.println("Element found at " + index);
		} else {
			System.out.println("Not found");
		}
	}
}
