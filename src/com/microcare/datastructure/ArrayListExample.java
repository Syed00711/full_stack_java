package com.microcare.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		Collection<Integer> l2=new ArrayList<Integer>() {{
					add(10);
					add(15);
					add(20);
				}};
				
		List<Integer> l3=Arrays.asList(4,9,2,4);
		List<Double> l4=Arrays.asList(4.5,9.3,2.7,4.8);
		List<String> l5=Arrays.asList("This"," is"," a","microcare","care");
		
		l1.add(5);
		l1.add(6);
		l1.add(7);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
	
		
		l1.addAll(l2);
	System.out.println(l1);
	l2.add(99);
	System.out.println(l1.containsAll(l2));
	
	System.out.println(l2);
	l2.remove(99);
	System.out.println(l2);
	
	System.out.println(l1.removeAll(l2));
	System.out.println(l1);
	System.out.println(l1.size());
	
	System.out.println(l1.get(2));
	l1.add(10);
	l1.set(0, 11);
	System.out.println(l1);
	l1.addAll(2, l2);
	System.out.println(l1);
	l1.add(2,99);
	System.out.println(l1);
	
	//l1.clear();
	l1.add(99);
	System.out.println(l1);
	System.out.println(l1.indexOf(99));
	
	System.out.println(l1.lastIndexOf(99));
	System.out.println(l1.size()==0);
	System.out.println(l1.isEmpty());
	List<Integer> l6=l1.subList(2, 5);
	System.out.println(l6);
	
	Integer[] i= l1.toArray(new Integer[0]);
	System.out.println(i[2]);
	
    List<Integer> l7 =Arrays.asList(1,2,3,4,5);
    
    System.out.println(l7);
    List<Integer>l8 =l7.stream().
 		   map(e -> e*e).
 		   collect(Collectors.toList());
   System.out.println(l8);
   
   
   /* l7.forEach(e -> {
    	l7.set(l7.indexOf(e),e*e);
    	
    });*/
    
  /*  for(int k=0;k<l7.size();k++) {
    	l7.set(k, l7.get(k)*l7.get(k));
    }*/
    
    //System.out.println(l7);
    System.out.println(Thread.currentThread().getName());
   LinkedList<Integer> ll=new LinkedList<>();
	}

}
