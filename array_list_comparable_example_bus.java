package javaprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class Bus3 implements Comparable<Bus3>
{
	int bus_id;
	String bus_name;
	int bus_fare;
	String bus_form;
	String bus_to;
	public Bus3(int bus_id, String bus_name, int bus_fare, String bus_form, String bus_to) {
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.bus_fare = bus_fare;
		this.bus_form = bus_form;
		this.bus_to = bus_to;
	}
	
	
	public int compareTo(Bus3 b) {
		if(bus_fare>b.bus_fare) {
			return 1;
		}
		else if(bus_fare<b.bus_fare) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	/*
	public int compareTo(Bus3 b) {
		return bus_name.compareTo(b.bus_name);
	}
	*/
}
public class array_list_comparable_example_bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus3 b1 =new Bus3(1001,"Lal pari",150,"pune","satara");
		Bus3 b2 =new Bus3(2002,"Primo plus",1000,"pune","Amravati");
		Bus3 b3 =new Bus3(3003,"Shiv shahi",4500,"pune","nagpur");
		Bus3 b4 =new Bus3(4004,"Maratvada travel",780,"pune","latur");
		Bus3 b5 =new Bus3(5005,"Shevneri",450,"pune","nagar");
		
		ArrayList<Bus3> set =new ArrayList<Bus3>( );
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b3);
		Collections.sort(set);
		Iterator<Bus3> itr = set.iterator();
		while(itr.hasNext()) {
			Bus3 b=itr.next();
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
			System.out.println(" ");
			
			
			
		}
		
	}

}
