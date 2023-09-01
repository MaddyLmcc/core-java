package com.lao.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples {
	
	public void treeSet() {
		TreeSet<Integer> treeSET = new TreeSet<Integer>();
		treeSET.add(10);
		treeSET.add(1);
		treeSET.add(2);
		treeSET.add(5);
		System.out.println(treeSET);
		
		//First value
		System.out.println(treeSET.first());
		
		//Last value
		System.out.println(treeSET.last());
		
		//headSet()
		System.out.println(treeSET.headSet(5));
		
		//TailSet()
		System.out.println(treeSET.tailSet(2));
		
		//SubSet()
		System.out.println(treeSET.subSet(1, 10));
		
		//Iterate using iterator
		Iterator<Integer> iterator = treeSET.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Iterate using descending iterator
		Iterator<Integer> descItertor = treeSET.descendingIterator();
		while (descItertor.hasNext()) {
			System.out.println(descItertor.next());
			
		}
	}

	public static void main(String[] args) {
		TreeSetExamples example = new TreeSetExamples();
		example.treeSet();

	}

}
