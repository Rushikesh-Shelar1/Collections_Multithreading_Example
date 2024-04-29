package javaprojects;
import java.util.Scanner;

class CustomException extends Exception {
	   public CustomException(String msg){
	       super(msg);
	   }
	}
public class treasure_hunt_example  {
	 public void  findTreasure(String str) {
		int Y=0;
		int X=0;
		
		for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            
			if(ch=='N') {
				
				Y++;
			}
			else if(ch=='S') {
				Y--;
			}
			else if(ch=='E') {
				X++;
			}
			else if(ch=='W') {
				X--;
			}
		 
	}
		System.out.println("  X & Y cordinate:=  "+X+","+Y);
		
		
}
	 
	 public void JUST(String str) throws CustomException {
         if(str.length()>15) {
                 throw new CustomException("Kindly have maximum 15 directions");
             } else {
                 System.out.println("you are good to go");
             }

     }


	public static void main(String[] args) throws CustomException {
		try {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("enter the string ");
	        String str=sc.nextLine();
	        
	        treasure_hunt_example t =new treasure_hunt_example();
	        t.JUST(str);
	        t.findTreasure(str);
		}
	       
	        
	        catch (CustomException exp){
	            System.out.println(exp);
	        }
	        
	        
	        
	}
}