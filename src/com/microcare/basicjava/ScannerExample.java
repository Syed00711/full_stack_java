package com.microcare.basicjava;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	
	while(true) {
		System.out.println("Enter String:");
		String text= sc.next();
		System.out.println("Enter number:");
		int i=sc.nextInt();
		
		for(int k=0;k<i;k++) {
			System.out.println(text.toUpperCase());
		}
		
	}

	}

}
