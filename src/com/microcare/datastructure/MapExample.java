package com.microcare.datastructure;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		Map<Integer,String> m2=new Hashtable<>();
		
		m1.put(1, "ONE");
		m1.put(2, "Two");
		m1.put(3, "Three");
		//m1.put(2, "Three");
		m1.merge(4, "four", (v1,v2) -> (v1+"+"+v2));
		System.out.println(
				m1.compute(5, (k,v) -> (k*k)+"")
						);
		System.out.println(m1);
		
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.get(3));
		System.out.println(m1.containsKey(1));
		System.out.println(m1.containsValue("ONE"));
		System.out.println(m1.getOrDefault(4, "CHECK"));
		
		SortedMap<Integer,String> m3 =new TreeMap<>();
		
		m3.put(65, "sixtyfive");
		m3.put(32, "thirtytwo");
		m3.put(1, "one");
		
		System.out.println(m3);
		
	}

}
