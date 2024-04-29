package javaprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Bus4
{
	int bus_id;
	String bus_name;
	int bus_fare;
	String bus_form;
	String bus_to;
	public Bus4(int bus_id, String bus_name, int bus_fare, String bus_form, String bus_to) {
		super();
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.bus_fare = bus_fare;
		this.bus_form = bus_form;
		this.bus_to = bus_to;
	}
	
}
class rateComparator1 implements Comparator<Bus4>{
	public int compare(Bus4 b1,Bus4 b2) {
		if(b1.bus_fare>b2.bus_fare) {
			return 1;
		}
		else if(b1.bus_fare<b2.bus_fare) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class array_list_comparator_example_bus {

	public static void main(String[] args) {
		Bus4 b1 =new Bus4(1001,"Lal pari",150,"pune","satara");
		Bus4 b2 =new Bus4(2002,"Primo plus",1000,"pune","Amravati");
		Bus4 b3 =new Bus4(3003,"Shiv shahi",4500,"pune","nagpur");
		Bus4 b4 =new Bus4(4004,"Maratvada travel",780,"pune","latur");
		Bus4 b5 =new Bus4(5005,"Shevneri",450,"pune","nagar");
		
		ArrayList<Bus4> set =new ArrayList<Bus4>( );
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b3);
		Collections.sort(set,new rateComparator1());
		
		Iterator<Bus4> itr = set.iterator();
		while(itr.hasNext()) {
			Bus4 b=itr.next();
			
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
			System.out.println(" ");
			
		}
		
		

	}

}
