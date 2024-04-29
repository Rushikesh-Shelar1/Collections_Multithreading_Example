package javaprojects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Fruits");
		map.put(2,"Vegetables");
		map.put(3,"Groceries");
		map.put(4,"medicines");
		map.put(5,"Household");
		map.put(null,"Kichenary");
		
		
		System.out.println(map);
		
		// we cannot directly iterate map entry , we need to convert map into set to iterate
		
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
