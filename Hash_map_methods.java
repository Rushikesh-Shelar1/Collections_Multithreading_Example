package javaprojects;

import java.util.HashMap;

public class Hash_map_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(1,"Fruits");
		map.put(2,"Vegetables");
		map.put(3,"Groceries");
		map.put(4,"medicines");
		map.put(5,"Household");
		map.put(null,"Kichenary");
		
		
		System.out.println(map);
		HashMap map2 =new HashMap();
		map2.put("pune", 4515351);
		map2.put("sjdfhk", 665451);
		map2.put("rtyjkdg", 6825351);
		map2.put("uyugj", 7896551);
		map2.put("eroodf", 47965351);
		
		System.out.println(map2);
		
		map.putAll(map2);
		
		System.out.println(map);
		
		map2.putIfAbsent("satara",568845);
		System.out.println(map2);
		
		map.remove(1);
		System.out.println(map);
		
		map2.replace("satara",415107);
		System.out.println(map2);
		
	}

}
