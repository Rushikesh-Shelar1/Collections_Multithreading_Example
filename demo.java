package javaprojects;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("enter the sentence ");
	        String sentence=sc.nextLine();
	        String[] strArray = null;
	        String str1=" ";
	        int r=0;
	        strArray  = sentence.split(" ");
	        for (int i = 0; i< strArray.length; i++){
	            System.out.print(strArray[i]+" ");
	        }
	        String[] strArray1= new String[strArray.length];
	        for(int i=0;i<strArray.length;i++){
	                StringBuffer sb =new StringBuffer(strArray[i]);
	                sb.reverse();
	                str1 =sb.toString();
	                strArray1[r]=str1;
	                r++;
	        }
	        System.out.println(" ");
	        System.out.println("reverse of the words in the sentence as follows......");
	        for (int i = 0; i<strArray1.length; i++) {

	            System.out.print(strArray1[i]+" ");
	        }

	}

}
