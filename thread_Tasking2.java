package javaprojects;

public class thread_Tasking2 extends Thread {
	
	public static void prime_no()
	  {
		 System.out.println("prime no.s 1-100 are ");
         int m, mount,s,i;
         for(s=1;s<=100;s++) {
             m=s;
             mount=0;
             for (i = 1; i <=m; i++) {
                 if (m % i == 0) {
                     mount++;
             }
         }
         if (mount == 2) {
             System.out.println( m+" ,");
         }
     }
	  }
	  
	  public static void prime_palindrome()
	  {
	    System.out.println("This is a prime_palindrone no.");
	  }
	  
	  public static void pale_no()
	  {
         int previous=0;
         int current=1;
         int sum1=0;
         System.out.println("pale no are: ");
         for (int i=0;i<=15;i++) {
        	 sum1 =current*2+previous;
        	 previous=current;
        	 current=sum1;
        	
        	 System.out.print(sum1+",");
         }
         
         
	  }
	  public void run()
	  {
	    if(Thread.currentThread().getName().equals("prime_no"))
	    {
	    	prime_no();
	    }
	    else if(Thread.currentThread().getName().equals("prime_palindrome"))
	    {
	    	prime_palindrome();
	    }
	    else
	    {
	    	pale_no();    
	    }
	    
	  }

	public static void main(String[] args) {

	    thread_Tasking2 t1 = new thread_Tasking2();
	    thread_Tasking2 t2 = new thread_Tasking2();
	    thread_Tasking2 t3 = new thread_Tasking2();
	    
	    t1.setName("prime_no");
	    t2.setName("prime_palindrome");
	    t3.setName("pale_no");
	    
	    t1.start();
	    t2.start();
	    t3.start();

	}

}
