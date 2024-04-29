package javaprojects;

import java.util.ArrayList;

public class arraylist_to_array {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(500);
		list.add(500);
		list.add(500);
		System.out.println(list);
		/*
		 int c[] =new int[list.size()];
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			c[i]=list.get(i);
		}
		
//		
//		 for (int i=0;i<c.length;i++){
//	            System.out.print(c[i]+" ");
//	        }
		
		for(int num:c) {
			System.out.print(num+" ");
		}
		*/
		Object objects[]=list.toArray();
		for(Object obj:objects) {
			System.out.print(obj+" ");
		}

	}

}
