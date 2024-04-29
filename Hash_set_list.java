package javaprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hash_set_list {

	public static void main(String[] args)  {
	HashSet<String> a1 = new HashSet<String>();// Hash does not take duplicate values and does not follows insertion order
	a1.add("India");
	a1.add("Australia");
	a1.add("India");
	//a1.add(null);
	a1.add("nepal");
	System.out.println(a1);
	System.out.println(a1.hashCode());
	
	ArrayList<String> list =new ArrayList<String>(a1);
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	System.out.println(1%5);
	
	}

}
