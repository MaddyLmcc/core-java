package com.lao.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {
	
	public void linkedListOperations() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		
		System.out.println(linkedList);
		
		//Add an element to the first
		linkedList.addFirst(1);
		System.out.println(linkedList);
		
		//Add an element to Last
		linkedList.addLast(5);
		System.out.println(linkedList);
		
		//Get the first value
		System.out.println(linkedList.getFirst());
		
		//Get the first value using index position
		System.out.println(linkedList.get(3));
		
		//Remove first value
		System.out.println(linkedList.removeFirst());
		
		//Remove Last value
		System.out.println(linkedList.removeLast());
		
		//Poll Method using delete the first element in the List
		System.out.println(linkedList.poll());
		
		//Poll Last method
		System.out.println(linkedList.pollLast());
		
		//Adding
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		System.out.println(linkedList);
		
		//Remove first occurrence
		linkedList.removeFirstOccurrence(2);
		System.out.println(linkedList);
		
		//Remove last occurrence
		linkedList.removeLastOccurrence(4);
		System.out.println(linkedList);
		
		System.out.println("------------------");
		//Iterate using for loop
		for(int i=0; i<linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("------------------");
		
		//Iterate using for-each loop
		for (Integer integer : linkedList) {
			System.out.println(integer);	
		}
		
		System.out.println("------------------");
		
		//Iterate using iterator
		Iterator<Integer> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------");
		
		//Iterate using while loop
		int i=0;
		while(linkedList.size()>i) {
			System.out.println(linkedList.get(i));
			i++;
		}
	}

	public static void main(String[] args) {
		LinkedListExamples example = new LinkedListExamples();
		example.linkedListOperations();

	}

}
