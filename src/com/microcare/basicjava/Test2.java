package com.microcare.basicjava;

import java.time.LocalDate;

public class Test2 {

	public static void main(String[] args) {
	
	
		Student s1=new Student();
		
		s1.setStudentId(452345);
		s1.setStudentName("Amit");
		s1.setCity("Kurnool");
		s1.setDob(LocalDate.of(1995, 11, 23));
		s1.setSection("A");
System.out.println(s1);
Student s2=new Student();

s2.setStudentId(3423);
s2.setStudentName("Amar");
s2.setCity("Hyderabad");
s2.setDob(LocalDate.of(1996, 11, 23));
s2.setSection("B");
	}

}
