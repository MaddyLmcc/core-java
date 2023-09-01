package com.lao.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		java.util.LinkedHashMap<String, String> LMCC = new java.util.LinkedHashMap<>();
		LMCC.put("Batsman", "Rishi");
		LMCC.put("All-rounder", "Jeeva");
		LMCC.put("Bowler", "Pradeep");
		LMCC.put(null, "Pradeep");
		System.out.println(LMCC);
		
	}

}
