package advance;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<>();
		PriorityQueue<Integer> q2=new PriorityQueue<>();
		q1.offer(4);
		q1.offer(5);
		q1.offer(6);
		q1.offer(7);
		q1.offer(8);
		
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1);
		
		Deque<Integer> d1=new ArrayDeque<>();
		d1.offer(5);
		d1.offer(11);
		System.out.println(d1);
		d1.offerFirst(99);
		d1.offerLast(111);
		System.out.println(d1);
		System.out.println(d1.pollFirst());
		System.out.println(d1.pollLast());
		
		
	}

}
