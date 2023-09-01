package com.lao.Map;

public class TreeMap {

	public static void main(String[] args) {
		java.util.TreeMap<String, String> teamName = new java.util.TreeMap<>();
		teamName.put("LMCC", "Sathy");
		teamName.put("5PM", "Puliyampati");
		teamName.put("Maximus", "Tirupur");
		teamName.put("Acc", "Maravamangalam");
		teamName.put(null, "Sathy");
		System.out.println(teamName);
		
		

	}

}
