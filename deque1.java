package javaprojects;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque1 {

	public static void main(String[] args) {
		
		Deque<String> dq =new ArrayDeque<String>();
		dq.add("pune");
		dq.offer("Satara");
		dq.offer("Nagpur");
		dq.offer("Nashik");
		dq.offer("Mumbai");
		
		System.out.println(dq);
		dq.offerLast("Amravati");
		System.out.println(dq);
		System.out.println(dq.peekLast());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		

	}

}
