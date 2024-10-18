package com.microcare.basicjava;

import java.util.Scanner;

public class ExceptionExmaple {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("ENter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//try {
		System.out.println(a/b);
		//}
		//catch(Exception e) {
	//		System.out.println(e.getMessage());
	//	}
		
		System.out.println(a*b);
		
	}

	}

}
