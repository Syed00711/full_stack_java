package com.microcare.basicjava;

public class StringMethods {

	public static void main(String[] args) {
		String s="This Is";
		String s1="A Microcare";
		
		String s2=s+" "+s1.toUpperCase();
		String s3 =s.concat(" ").concat(s1);
		
		System.out.println(s2);
		System.out.println(s3);
/*System.out.println(s3.charAt(15));
System.out.println(s3.replaceFirst("is", "e"));

System.out.println(s3.substring(5));
System.out.println(s3.substring(5, 10));

System.out.println(s3.toUpperCase());
System.out.println(s3.toLowerCase());

System.out.println(s3.startsWith("is"));
System.out.println(s3.endsWith("care"));


System.out.println(s3.lastIndexOf("i"));

char[] c= {'t','h','i','s'};*/
      System.out.println(s2.equals(s3));
      System.out.println(s2.equalsIgnoreCase(s3));
  String s4=" ";
  
  System.out.println(s4.isEmpty());
	}

}
