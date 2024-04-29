package javaprojects;

import java.util.Iterator;
import java.util.LinkedList;

public class link_list {

	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("India");
		link.add("Australia");
		link.add("Srilanka");
		link.add("Canada");
		link.offer("Nepal");
		
		
		//link.addFirst("Bhutan");
		//link.addLast("USA");
		link.offerFirst("Maynmar");
		link.offerFirst("England");
		
		System.out.println(link.get(4));
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.peek());
		
		System.out.println(link.poll());
		System.out.println(link);
		
		System.out.println(link.pop());
		link.push("England");
		System.out.println(link);
//		Iterator<String> itr=link.descendingIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
	}

}
