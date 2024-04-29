package javaprojects;

import java.util.ArrayList;

class products{
	int p_id;
	String p_name;
	int p_price;
	String p_ship_add;
	int p_time_of_delivery;
	public products(int p_id, String p_name, int p_price, String p_ship_add, int p_time_of_delivery) {
		
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_ship_add = p_ship_add;
		this.p_time_of_delivery = p_time_of_delivery;
	}
}
public class arraylist_objects {

	public static void main(String[] args) {
		products p1=new products(101,"Iphone",156513,"pune",8);
		products p2=new products(102,"Samsung",846513,"mumbai",7);
		products p3=new products(103,"one plus",456513,"satara",10);
		products p4=new products(104,"vivo",856513,"dhule",6);
		products p5=new products(105,"nokia",796513,"nashik",4);
		
		ArrayList<products>  list=new ArrayList<products>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		for(products p:list) {
			System.out.println("products description");
			System.out.println(p.p_id+" "+p.p_name+" "+p.p_price);
			System.out.println(p.p_ship_add+" "+p.p_time_of_delivery);
		}
		
	}

}
