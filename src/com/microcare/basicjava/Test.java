package com.microcare.basicjava;
public class Test {

	public static void main(String[] args) {
		System.out.println("first statement");
		
		check2();
check();
	}
	
	private static String check() {
		System.out.println("second statement");
		
		return "this is a string";
		
	}
	
	public static void check2() {
		System.out.println("third statement");
		check();
	}

}
