package advance;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<>();
		s1.push(5);
		s1.push(6);
		s1.push(9);
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.indexOf(6));
	System.out.println(s1.search(6));
		

	}

}
