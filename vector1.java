package javaprojects;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vc=new Vector<Integer>();
		vc.add(101);
		vc.add(202);
		vc.add(303);
		vc.add(404);
		vc.add(505);
		
		System.out.println(vc);
		vc.add(606);
		System.out.println(vc);
		vc.remove(3);
		System.out.println(vc);
	}

}
