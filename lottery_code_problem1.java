package javaprojects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lottery_code_problem1 {
	public void lotterygame() {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the 7 digits alphanumeric lottery code ");
        String sentence=sc.nextLine();
        int len= 0;
        String temp=" ";
        int temp1=0;
        String[] strArray = null;
        //String[] strArray1 = null;
        strArray = sentence.split(" ");
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i< strArray.length; i++){
            System.out.print(" "+strArray[i]);
            len++;
        }
        
		for(int i=0;i< strArray.length;i++) {
			temp=strArray[i];
			String result=temp.replaceAll("[^\\d]+", "");
			int a=Integer.parseInt(result);
			list.add(a);
		}
		Object objects[]=list.toArray();
//		for(Object obj:objects) {
//			System.out.print(obj+" ");
//		}
		for(int k=0;k<objects.length;k++) {
			for(int j=k+1;j<objects.length;j++){
				int y=(int) objects[k];
				int z= (int) objects[j];
                if(y>z)
                {  
                   temp1=(int) objects[k];
                   objects[k]=objects[j];
                   objects[j]=temp1;

                }
            }
		}
		System.out.println(" ");
		for(Object obj:objects) {
			System.out.print(obj+" ");
		}
		System.out.println(" ");
		System.out.println("third shortest no is "+objects[2]);
		String s=Integer.toString((int) objects[2]);
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i].contains(s) ) {
				System.out.println(strArray[i]);
				
			}
		}

		
	}

	public static void main(String[] args) {
		 
	        lottery_code_problem1 sd=new lottery_code_problem1();
	        sd.lotterygame();
	}

}
