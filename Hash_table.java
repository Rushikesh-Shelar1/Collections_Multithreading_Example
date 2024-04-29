package javaprojects;

import java.util.HashSet;
import java.util.Hashtable;

public class Hash_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> a1 = new Hashtable<Integer,String>();// Hashtable does not take null values and null key,does not follows insertion order but gives output in descending order , can duplicate values
		a1.put(5,"India");
		a1.put(4,"Australia");
		a1.put(6,"India");
		//a1.put(2,null);
		a1.put(3,"nepal");
		System.out.println(a1);
	}

}
