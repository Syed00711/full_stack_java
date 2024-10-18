package com.microcare.basicjava;

public class Loopexample {

	public static void main(String[] args) {
		int [] n= {7,3,12,13,15,21,24,46};
		for(int i=1;i<n.length;i++) {
			if(n[i]%5==0) {
			System.out.println("n array has a number "
					+ "divisible by 5 at location:"+i);
		break;
			
			}
		}

	}

}
