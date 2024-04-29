package javaprojects;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {

	public static void main(String[] args) {
		//program 1 
				ArrayList<Integer> list=new ArrayList<Integer>();	//list object 
				//System.out.println(list);							//list.hashCode()-1   list-[]
				
				list.add(100);
				list.add(null);
				list.add(500);
				list.add(10);
				list.add(null);
				list.add(500);
				list.add(1000);
				list.add(null);
				list.add(500);
				
				System.out.println(list); //it will follow the insertion order 	
				
				//program 2
				ArrayList<String> city1=new ArrayList<String>();
				city1.add("Mumbai");
				city1.add("pune");
				city1.add("nashik");
				
				System.out.println(city1);
				
				ArrayList<String> city2=new ArrayList<String>(); 
				city1.add("ayodhya");
				
				city1.add("varanasi");
				
				System.out.println(city2);
				city1.set(2, "Vrindavan");//to change the data or@ update karata hai 
				
				city1.addAll(city2);
				
				System.out.println(city1);
				
				System.out.println(city1.get(3)); //for specific data
				
				city1.remove(2); //it will remove the specific data remove() if their will be two values then it will delete first value or accurance
				city1.removeAll(city2);
				
				System.out.println(city1);
				
				System.out.println(city1.contains("Pune"));
			//	city1.clear();
			//	System.out.println(city1.isEmpty());
				
			//	city1.clear();	//clear method will remove ALL the data
			//	System.out.println(city1);
			//	System.out.println(city2);
			//	city1.retainAll(city2);
			//	System.out.println(city1);
				/*//for each loop
				System.out.println(city1.size());
				for(String c :city1) {
					System.out.println(c);
				}
				*/
				
				Iterator<String> itr=city1.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				

	}

}
