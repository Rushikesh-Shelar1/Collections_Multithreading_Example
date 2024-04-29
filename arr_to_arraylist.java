package javaprojects;

import java.util.ArrayList;

public class arr_to_arraylist {

	public static void main(String[] args) {
		int arr[]= {3,6,78,98,54};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		al.add(100);
		System.out.println(al);
	}
}
