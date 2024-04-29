package javaprojects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Bus1 implements Comparable<Bus1>
{
	int bus_id;
	String bus_name;
	int bus_fare;
	String bus_form;
	String bus_to;
	public Bus1(int bus_id, String bus_name, int bus_fare, String bus_form, String bus_to) {
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.bus_fare = bus_fare;
		this.bus_form = bus_form;
		this.bus_to = bus_to;
	}
	/*
	
	public int compareTo(Bus1 b) {
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
	*/
	public int compareTo(Bus1 b) {
		return bus_name.compareTo(b.bus_name);
	}
	
}
public class Tree_set_using_comparable_bus_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus1 b1 =new Bus1(1001,"Lal pari",150,"pune","satara");
		Bus1 b2 =new Bus1(2002,"Primo plus",1000,"pune","Amravati");
		Bus1 b3 =new Bus1(3003,"Shiv shahi",4500,"pune","nagpur");
		Bus1 b4 =new Bus1(4004,"Maratvada travel",780,"pune","latur");
		Bus1 b5 =new Bus1(5005,"Shevneri",450,"pune","nagar");
		
		TreeSet<Bus1> set =new TreeSet<Bus1>( );
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b3);
		
		Iterator<Bus1> itr = set.iterator();
		while(itr.hasNext()) {
			Bus1 b=itr.next();
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
			
			
			
		}
		
	}

}
