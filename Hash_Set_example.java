package javaprojects;

import java.util.HashSet;
import java.util.Iterator;

class Bus
{
	int bus_id;
	String bus_name;
	int bus_fare;
	String bus_form;
	String bus_to;
	public Bus(int bus_id, String bus_name, int bus_fare, String bus_form, String bus_to) {
		super();
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.bus_fare = bus_fare;
		this.bus_form = bus_form;
		this.bus_to = bus_to;
	}
	
}
public class Hash_Set_example {

	public static void main(String[] args) {
		Bus b1 =new Bus(1001,"Lal pari",150,"pune","satara");
		Bus b2 =new Bus(2002,"Primo plus",1000,"pune","Amravati");
		Bus b3 =new Bus(3003,"Shiv shahi",4500,"pune","nagpur");
		Bus b4 =new Bus(4004,"Maratvada travel",780,"pune","latur");
		Bus b5 =new Bus(5005,"Shevneri",450,"pune","nagar");
		
		HashSet<Bus> set =new HashSet<Bus>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b3);
		/*
		for(Bus b:set)
		{
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
		}
		*/
		Iterator<Bus> itr = set.iterator();
		while(itr.hasNext()) {
			Bus b=itr.next();
			if(b.bus_name.equals("Lal pari")) {
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
			
			}
			
		}
		
	}

}
