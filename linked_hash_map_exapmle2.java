package javaprojects;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class customer{
	String cust_id;
	String cust_name;
	String cust_address;
	String phone_no;
	public customer(String cust_id, String cust_name, String cust_address, String phone_no) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.phone_no = phone_no;
	}
	
}
class flight1{
	String f_name;
	String f_departure;
	String f_arrival;
	int f_fare;
	public flight1(String name, String f_departure, String f_arrival, int f_fare) {
	
		this.f_name = name;
		this.f_departure = f_departure;
		this.f_arrival = f_arrival;
		this.f_fare = f_fare;
	}
	
}
public class linked_hash_map_exapmle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flight1 fly1=new flight1("Indigo","pune","bengaluru",4500);
		flight1 fly2=new flight1("Spicejet","pune","nagpur",4250);
		flight1 fly3=new flight1("Vistara","pune","Delhi",7700);

		
		customer cus1=new customer("GD455K","Rushi","Pune","+91 85xxxxxxx86");
		customer cus2=new customer("DFH55Y","Amol","Nashik","+91 96xxxxxxx74");
		customer cus3=new customer("YTY55K","piyush","Satara","+91 75xxxxxxx26");
		customer cus4=new customer("UIO58P","sunil","Nanded","+91 45xxxxxxx89");
		customer cus5=new customer("IF455O","tushar","Delhi","+91 85xxxxxxx85");
		customer cus6=new customer("HJFH85I","Rahul","mumbai","+91 85xxxxxxx57");
		
		
		LinkedHashMap<customer,flight1>map=new LinkedHashMap<customer,flight1>();//LinkedHashMap follows insertion order
		map.put(cus1, fly1);
		map.put(cus2, fly3);
		map.put(cus3, fly2);
		map.put(cus4, fly1);
		map.put(cus5, fly3);
		map.put(cus6, fly1);
		
		Set<Map.Entry<customer,flight1>> set = map.entrySet();
		for(Map.Entry<customer, flight1> m: set)
		{	
			
			System.out.println("flight booking conformation");
			customer c=m.getKey();
			System.out.println(c.cust_id+" "+c.cust_name);
			System.out.println(c.cust_address+" "+c.phone_no);
			
			
			System.out.println("flight details");
			flight1 f=m.getValue();
			System.out.println(f.f_name);
			System.out.println(f.f_arrival+" to "+f.f_departure);
			System.out.println("fare = "+f.f_fare);
			System.out.println(" ");
		}
	}

}
