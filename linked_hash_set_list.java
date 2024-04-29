package javaprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class linked_hash_set_list {

	public static void main(String[] args) {
		LinkedHashSet<String> a1 = new LinkedHashSet<String>();// LinkedHash does not take duplicate values but follows insertion order
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

	}

}
