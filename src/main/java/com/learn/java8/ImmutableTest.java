package com.learn.java8;

public class ImmutableTest {

	public static void main(String[] args) {
		
		Immutable immutable = new Immutable("Harish", 404);
		System.out.println(immutable.hashCode());
		System.out.println(immutable.getName());
		System.out.println(immutable.getRegNo());
		
		Immutable immutable1 = new Immutable("Suresh", 405);
		System.out.println(immutable1.hashCode());
		System.out.println(immutable1.getName());
		System.out.println(immutable1.getRegNo());
		
	}

}
