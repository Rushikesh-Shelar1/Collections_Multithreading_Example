package javaprojects;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Bus2
{
	int bus_id;
	String bus_name;
	int bus_fare;
	String bus_form;
	String bus_to;
	public Bus2(int bus_id, String bus_name, int bus_fare, String bus_form, String bus_to) {
		super();
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.bus_fare = bus_fare;
		this.bus_form = bus_form;
		this.bus_to = bus_to;
	}
	
}
class rateComparator implements Comparator<Bus2>{
	public int compare(Bus2 b1,Bus2 b2) {
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
class nameComparator implements Comparator<Bus2>
{
	public int compare(Bus2 b3,Bus2 b4) {
		return b3.bus_name.compareTo(b4.bus_name);
	}
}


public class Tree_set_using_comparator_example_bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus2 b1 =new Bus2(1001,"Lal pari",150,"pune","satara");
		Bus2 b2 =new Bus2(2002,"Primo plus",1000,"pune","Amravati");
		Bus2 b3 =new Bus2(3003,"Shiv shahi",4500,"pune","nagpur");
		Bus2 b4 =new Bus2(4004,"Maratvada travel",780,"pune","latur");
		Bus2 b5 =new Bus2(5005,"Shevneri",450,"pune","nagar");
		
		TreeSet<Bus2> set =new TreeSet<Bus2>(new rateComparator() );
		TreeSet<Bus2> set1 =new TreeSet<Bus2>(new nameComparator() );
		
		set1.add(b1);
		set1.add(b2);
		set1.add(b3);
		set1.add(b4);
		set1.add(b5);
		set1.add(b3);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b3);
		
		Iterator<Bus2> itr = set.iterator();
		while(itr.hasNext()) {
			Bus2 b=itr.next();
			
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
			
		}
		System.out.println("   ");
		Iterator<Bus2> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Bus2 b=itr1.next();
			
			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_form+" to "+b.bus_to);
			System.out.println("the fare is "+b.bus_fare);
		}

	}

}
