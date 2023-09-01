package com.lao.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
	
	public void arrayList() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Audi");
		arrayList.add("Madhan");
		arrayList.add("Madhan");
		System.out.println(arrayList);
		arrayList.add(null);
		System.out.println(arrayList);
		
		// Iterate using for-each loop
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("------------------");
		
		// Iterate using for loop
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("------------------");
		
		// Iterate using ListIterator 
		ListIterator<String> listIterator = arrayList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("------------------");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("------------------");
		
		// Iterate using iterator
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------");
		//Remove the particular object
		arrayList.remove(0);
	    System.out.println(arrayList);
	}

	public static void main(String[] args) {
		ArrayListExamples examples = new ArrayListExamples();
		examples.arrayList();

	}

}
