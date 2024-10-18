package com.microcare.basicjava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3 {

	public static void main(String[] args) {
		String s="     assign string value       ";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.replaceAll("s", ""));
		
		int[] i =new int[5];
		
		i[0]=2;
		i[1]=-23;
		i[2]=45;
		i[3]=50;
		i[4]=60;
		char[] c=new char[4];
		c[0]='a';
		c[1]='z';
		c[2]='!';
		c[3]='&';
		
		
		double[] d= {1.2,3.4,567.45,34.234};
		System.out.println(d[3]);
		
		
		System.out.println(i.length);
		for(int k=0;k<i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println(d.length);
		
		String[] s1= {"wdfaw","wefwef","wefwe","wefwe","wfwe","zxv","vsv","sva"};
System.out.println(s1.length);
System.out.println(LocalDate.now());
System.out.println(LocalDateTime.now());
System.out.println(LocalTime.now());


	}

}
