package javaprojects;

import java.util.ArrayList;

class shop{
	String location;
	int number;
	int size_shop;
	int agreement_period;
	
	public shop(String location, int number, int size_shop, int agreement_period) {
		super();
		this.location = location;
		this.number = number;
		this.size_shop = size_shop;
		this.agreement_period = agreement_period;
	}
}
public class arraylist_shop_rent {

	public static void main(String[] args) {
	shop s1=new shop("pune",23,1050,5);
//	shop s2=new shop("mumbai",53,879,1);
//	shop s3=new shop("nashik",48,1200,1);
//	shop s4=new shop("north_mumbai",58,950,5);
//	shop s5=new shop("hydrabad",19,2000,5);
	
	ArrayList<shop>  list1=new ArrayList<shop>();
	list1.add(s1);
//	list1.add(s2);
//	list1.add(s3);
//	list1.add(s4);
//	list1.add(s5);
	for(shop o:list1) {
		if(o.agreement_period<=1&&o.size_shop<=500) {
		System.out.println(" rent= 20000");
		}
		else if((o.agreement_period<=1)&&(o.size_shop>500&&o.size_shop<=1000))
			System.out.println(" rent= 50000"+" in the "+o.location+" city "+"with agreement of "+o.agreement_period+" years, "+o.size_shop+" sqfeet");
		else if((o.agreement_period<=1)&&(o.size_shop>1000))
			System.out.println(" rent= 80000"+" in the "+o.location+" city "+"with agreement of "+o.agreement_period+" years, "+o.size_shop+" sqfeet");
		else if(o.agreement_period<=5&&o.size_shop<=500)
			System.out.println(" rent= 15000"+" in the "+o.location+" city "+"with agreement of "+o.agreement_period+" years, "+o.size_shop+" sqfeet");
		else if((o.agreement_period<=5)&&(o.size_shop>500&&o.size_shop<=1000))
			System.out.println(" rent= 40000"+" in the "+o.location+" city "+"with agreement of "+o.agreement_period+" years, "+o.size_shop+" sqfeet");
		else if((o.agreement_period<=5)&&(o.size_shop>1000))
			System.out.println(" rent= 75000"+" in the "+o.location+" city "+"with agreement of "+o.agreement_period+" years, "+o.size_shop+" sqfeet");
		
	}

	}

}
