package javaprojects;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class customer1 implements Comparable<customer1>{
	String cust_id;
	String cust_name;
	String cust_address;
	String phone_no;
	public customer1(String cust_id, String cust_name, String cust_address, String phone_no) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.phone_no = phone_no;
	}
	public int compareTo(customer1 c) {
		return cust_name.compareTo(c.cust_name);
	}
}
class flight3{
	String f_name;
	String f_departure;
	String f_arrival;
	int f_fare;
	public flight3(String name, String f_departure, String f_arrival, int f_fare) {
	
		this.f_name = name;
		this.f_departure = f_departure;
		this.f_arrival = f_arrival;
		this.f_fare = f_fare;
	}
	
}
public class comparable_with_TreeMap_flight_customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
				flight3 fly1=new flight3("Indigo","pune","bengaluru",4500);
				flight3 fly2=new flight3("Spicejet","pune","nagpur",4250);
				flight3 fly3=new flight3("Vistara","pune","Delhi",7700);

				
				customer1 cus1=new customer1("GD455K","Rushi","Pune","+91 85xxxxxxx86");
				customer1 cus2=new customer1("DFH55Y","Amol","Nashik","+91 96xxxxxxx74");
				customer1 cus3=new customer1("YTY55K","Piyush","Satara","+91 75xxxxxxx26");
				customer1 cus4=new customer1("UIO58P","Sunil","Nanded","+91 45xxxxxxx89");
				customer1 cus5=new customer1("IF455O","Tushar","Delhi","+91 85xxxxxxx85");
				customer1 cus6=new customer1("HJFH85I","Rahul","mumbai","+91 85xxxxxxx57");
				
				
				TreeMap<customer1,flight3>map=new TreeMap<customer1,flight3>();//LinkedHashMap follows insertion order
				map.put(cus1, fly1);
				map.put(cus2, fly3);
				map.put(cus3, fly2);
				map.put(cus4, fly1);
				map.put(cus5, fly3);
				map.put(cus6, fly1);
				
				Set<Map.Entry<customer1,flight3>> set = map.entrySet();
				for(Map.Entry<customer1, flight3> m: set)
				{	
					
					System.out.println("flight booking conformation");
					customer1 c=m.getKey();
					System.out.println(c.cust_id+" "+c.cust_name);
					System.out.println(c.cust_address+" "+c.phone_no);
					
					
					System.out.println("flight details");
					flight3 f=m.getValue();
					System.out.println(f.f_name);
					System.out.println(f.f_arrival+" to "+f.f_departure);
					System.out.println("fare = "+f.f_fare);
					System.out.println(" ");
				}

	}

}
