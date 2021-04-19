package com.hometask.generic2;

/**
 * @author Martha Partuta
 * */

public class App {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new Map<Integer, String>();
		map.add(34,"First");
		map.add(28,"Second");
		map.add(15,"Third");
		
		System.out.println(map);
		System.out.println();
		
		map.peekK();
		System.out.println(map);
		
		map.deleteLastAdd();
		System.out.println(map);
		
		//my version with List<Integer> when i have put String
		List <Integer>op = new List<Integer>(90,"ty");
		System.out.println(op);
		Integer opId = op.getId();
	    System.out.println(opId);
		System.out.println();
	}
}
