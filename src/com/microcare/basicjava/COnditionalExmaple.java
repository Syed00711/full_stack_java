package com.microcare.basicjava;

public class COnditionalExmaple {
	
	static int num=5;

	public static void main(String[] args) {
		
		int i=10;
		
		
		if(i>10) {
			System.out.println("i is  greater or equal than 10");
		}
		else if(num<=10){
			System.out.println("i is less than 10");
		}
		else if(i==10) {
			System.out.println("i euqal to 10");
		}
		else {
			System.out.println("i is equal to 10");
		}
		char n='3';
		
		switch(n) {
		case '1':
			System.out.println("i is 1");
			break;
		case '2':
			System.out.println("i is 2");
			break;
		case '3':
			System.out.println("i is 3");
			break;
		default:
			System.out.println("i is greater than 3");
		}
		

	}
	
	public static void check() {
		System.out.println(num);
	}

}
