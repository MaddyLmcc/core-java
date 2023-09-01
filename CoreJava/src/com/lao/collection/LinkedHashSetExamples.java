package com.lao.collection;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetExamples {
	
	public void linkedhashSet() {
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("1");
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");
		System.out.println(linkedHashSet);
		
	}

	public static void main(String[] args) {
		LinkedHashSetExamples examples = new LinkedHashSetExamples();
		examples.linkedhashSet();

	}

}
