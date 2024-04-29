package javaprojects;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<Integer>();
		que.add(202);
		que.offer(101);
		que.add(404);
		que.offer(303);
		que.offer(505);
		
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que.element());
		System.out.println(que);
		

	}

}
