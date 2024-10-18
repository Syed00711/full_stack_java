package com.microcare.basicjava;

public  class ChildExample extends ParentExample{
	
	int c=11;
	int d=15;
	
	public void check() {
		System.out.println("child");
	}
	
	public void child() {
		System.out.println("child");
	}
	
	public void child(int i) {
		System.out.println(i);
	}
	
    public void child(String s) {
		System.out.println(s);
	}

	@Override
	public void absCheck() {
		// TODO Auto-generated method stub
		
	}


}
