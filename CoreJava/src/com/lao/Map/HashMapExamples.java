package com.lao.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//Insert an element PUT method is used
		employeeMap.put(1, "Agni");
		employeeMap.put(2, "Riya");
		employeeMap.put(3, "Madhan");
		employeeMap.put(4, "LMCC");
		employeeMap.put(null, "LMCC");
		employeeMap.put(null, "Gncc");
		
		System.out.println(employeeMap);
		
		//copy of existing map
		Map<Integer, String> duMap = new HashMap<>();
		duMap.putAll(employeeMap);
		System.out.println(duMap);
		
		//delete the Map contents
		duMap.clear();
		System.out.println(duMap);
		
		//Key is present or not in  the Map
		System.out.println(employeeMap.containsKey(2));
		
		//Value is present or not
		System.out.println(employeeMap.containsValue("Madhan"));
		
		//Clone the map
		System.out.println(employeeMap.clone());
		
		//Empty or not
		System.out.println(employeeMap.isEmpty());
		
		//Fetch the set of keys
		System.out.println(employeeMap.keySet());
		
		//Fetch the value 
		System.out.println(employeeMap.values());
		
		//Entry Set
		System.out.println(employeeMap.entrySet());

	}

}
