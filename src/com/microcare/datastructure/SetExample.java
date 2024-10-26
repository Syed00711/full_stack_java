package com.microcare.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<>();
		s1.add(5);
		s1.add(7);
		s1.add(5);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		Set<Integer> s2=new LinkedHashSet<>();
		s2.add(7);
		s2.add(11);
		s2.add(5);
		s2.add(11);
		System.out.println(s2);
		s1.addAll(s2);
		
		System.out.println(s1);
		
		SortedSet<Integer> s3 =new TreeSet<>();
		s3.add(76);
		s3.add(34);
		s3.add(0);
		s3.add(11);
		
		System.out.println(s3);
		System.out.println(s3.first());
		System.out.println(s3.last());
		System.out.println(s3.headSet(34));
		System.out.println(s3.tailSet(11));
		Iterator<Integer> t1=s3.iterator();
		
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}
		

	}

}
