package javaprojects;
import java.util.Scanner;
public class practise1_discount_items {
	public void  customerDiscount() {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("enter first your name and items to be purched ");
	        String sentence=sc.nextLine();
	        int count;
	        int mount=0;
	        String temp=" ";
	        String[] strArray = null;
	        strArray = sentence.split(" ");
	        System.out.println(strArray.length);
	        
	        for (int i = 1; i< strArray.length; i++){
	        	String temp2=strArray[0];
	        	temp=strArray[i];
	        	count=0;
	        	for(int j=0;j<temp2.length();j++) {
	        		
	        		char ch = temp.charAt(j);
	        		char ch2=temp2.charAt(j);
	        		if (ch==ch2)	{
	        			count++;
	        		}
	        	}
	        	if(count==temp2.length()) {
	        		mount++;
	        	}
	        	
	        }
	        
	        System.out.println("you are eligible for discount on "+mount+" items");
	}
	public static void main(String[] args) {
		practise1_discount_items c1 =new practise1_discount_items();
		c1.customerDiscount();

	}

}
