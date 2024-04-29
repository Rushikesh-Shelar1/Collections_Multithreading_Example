package javaprojects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class flight{
	String f_name;
	String f_departure;
	String f_arrival;
	int f_fare;
	public flight(String name, String f_departure, String f_arrival, int f_fare) {
	
		this.f_name = name;
		this.f_departure = f_departure;
		this.f_arrival = f_arrival;
		this.f_fare = f_fare;
	}
	
}
public class linked_hash_map_flight {

	public static void main(String[] args) {
		flight fly1=new flight("Indigo","pune","bengaluru",4500);
		flight fly2=new flight("Spicejet","pune","nagpur",4250);
		flight fly3=new flight("Vistara","pune","Delhi",7700);
		flight fly4=new flight("Akasa","pune","mumbai",8000);
		flight fly5=new flight("Air India","pune","Chennai",10000);
		
		HashMap<String,flight>map=new HashMap<String,flight>();
		map.put("sewt868", fly1);
		map.put("gdh458", fly2);
		map.put("fgmn868", fly3);
		map.put("rtjb458", fly4);
		map.put("thkjt1068", fly5);
		
		Set<Map.Entry<String,flight>> set = map.entrySet();
		for(Map.Entry<String, flight> m: set)
		{	
			System.out.println("flight details");
			System.out.println(m.getKey());
			flight f=m.getValue();
			System.out.println(f.f_name);
			System.out.println(f.f_arrival+" to "+f.f_departure);
			System.out.println("fare = "+f.f_fare);
			System.out.println(" ");
		}

		
	}

}
