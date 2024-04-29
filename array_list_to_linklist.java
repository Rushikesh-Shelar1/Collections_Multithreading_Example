package javaprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class array_list_to_linklist {

	public static void main(String[] args) {
		ArrayList<String> car=new ArrayList<String>();
		
		car.add("tata nexon");
		car.add("mahindra thar");
		car.add("toyota");
		car.add("tata nano");
		car.add("maruti alto");
		car.add("maruti baleno");
		System.out.println(car);
		
		Collections.sort(car);
		System.out.println(car);
		LinkedList<String> carlink=new LinkedList<String>(car);
		
		carlink.add("BMW S 430");
		carlink.add("mercedes g 200");
		System.out.println(carlink);

	}

}
