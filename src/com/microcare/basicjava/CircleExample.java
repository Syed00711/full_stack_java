package com.microcare.basicjava;

import java.util.Scanner;

public class CircleExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Radius:");
			double radius=sc.nextDouble();
			System.out.println("Area of circle for given raidus is:");
		  System.out.println(Math.PI*Math.pow(radius, 2));
		}

	}

}
