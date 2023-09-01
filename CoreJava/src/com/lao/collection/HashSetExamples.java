package com.lao.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamples {
	
	public void hashSet() {
		HashSet<String> hashSET = new HashSet<String>();
		hashSET.add("A");
		hashSET.add("B");
		hashSET.add("C");
		hashSET.add("A");
		hashSET.add(null);
		System.out.println(hashSET);
		hashSET.remove(null);
		System.out.println(hashSET);
		//Given value i present or NOT
		System.out.println(hashSET.contains("A"));
		
		//iterate using iterator
		Iterator<String> iterator = hashSET.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

	public static void main(String[] args) {
		HashSetExamples example = new HashSetExamples();
		example.hashSet();

	}

}
