package com.lao.stringconcepts;

public class StringBufferExamples {

	public static void main(String[] args) {
		//String is immutable object
		String name = "Madhan";
		System.out.println(name.concat("kumar"));
		System.out.println(name);
		
		//StringBuffer is mutable object
		StringBuffer name1 = new StringBuffer("Madhan");
		System.out.println(name1.append("kumar"));
		System.out.println(name1.capacity());
	}

}
