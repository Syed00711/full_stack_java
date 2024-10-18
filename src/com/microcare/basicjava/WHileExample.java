package com.microcare.basicjava;

public class WHileExample {

	public static void main(String[] args) {
		int n=1;
		
		while(true) {
			System.out.println("this is a while loop");
			if(n<=10) {
				n++;
				continue;
			}
			else {
				break;
			}
			
		}
		

	}

}
