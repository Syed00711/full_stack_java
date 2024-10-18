package com.microcare.basicjava;

public class MicrocareExample {
	
	int i;
	String s;
	static {
		System.out.println("This is a static block");
	}
	
	
	
	static final long l=324123123;
	
	public MicrocareExample() {
		System.out.println("this is a default constroctur");
		i=5;
		s="Default";
	}
	
    public MicrocareExample(int num,String val) {
		i=num;
		s=val;
	}
	
	public void print() {
		System.out.println("======="+i+"====="+s);
		check();
	}
	
	public static void check() {
		System.out.println(l);
		
	}

}
