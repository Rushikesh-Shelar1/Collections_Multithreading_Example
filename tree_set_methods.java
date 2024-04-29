package javaprojects;

import java.util.TreeSet;

public class tree_set_methods {

	public static void main(String[] args) {
		TreeSet<Integer> ts =new TreeSet<Integer>();// it does not take duplicate values and null values.... it gives data in sorted form
		ts.add(24);
		ts.add(45);
		ts.add(23);
		ts.add(14);
		ts.add(8);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.headSet(24));
		System.out.println(ts.headSet(24,true));
		System.out.println(ts.tailSet(14));
		System.out.println(ts.tailSet(14,false));
		System.out.println(ts.subSet(14, 45));
		System.out.println(ts.subSet(14,true, 45,true));
	}

}
