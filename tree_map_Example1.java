package javaprojects;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class tree_map_Example1 {

	public static void main(String[] args) {
		
		//in Tree_map it will sort only according to key value
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(5,"Fruits");
		map.put(2,"Vegetables");
		map.put(3,"Groceries");
		map.put(6,"medicines");
		map.put(1,"Household");
		map.put(4,"Kichenary");
		
		System.out.println(map);
		System.out.println(map.descendingKeySet());
		System.out.println(map.headMap(4,true));
		System.out.println(map.tailMap(2,false));
		System.out.println(map.subMap(2, 5));

		/*
		Set<Integer> set1=map.keySet();
		for(Integer k:set1)
		{
			System.out.println(k);
		}
  
		 */
		
		/*
		Set<Map.Entry<Integer, String>> set1 =map.entrySet();
		
		for(Map.Entry<Integer, String> m:set1) 
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		*/
		
		Set<Map.Entry<Integer, String>> set1 =map.entrySet();
		
		Iterator<Map.Entry<Integer,String>> itr=set1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}

