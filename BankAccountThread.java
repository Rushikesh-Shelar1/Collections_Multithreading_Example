package javaprojects;
import java.util.Scanner;

class BankAccount 
{
  int balance;
  
  public BankAccount(int balance) 
  {
    this.balance = balance;
  }

  public synchronized void deposite()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Amount You want to Deposite :");
    int dp_amount=sc.nextInt();
    
    System.out.println("The New Balance is = "+(balance + dp_amount));
balance = balance+ dp_amount;
  }
  
  public synchronized void withdrawl()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Amount You want to withdrwal :");
    int wd_amount=sc.nextInt();
    
    System.out.println("The New Balance is = "+(balance - wd_amount));
  }
}
  
public class BankAccountThread {

	public static void main(String[] args)throws InterruptedException {
		BankAccount b = new BankAccount(10000);
	    Thread t1 = new Thread()
	        {
	          public void run()
	          {
	            b.deposite();
	          }
	        };
	        
	        Thread t2 = new Thread()
	        {
	          public void run()
	          {
	            b.withdrawl();
	          }
	        };
	        
	        
	        Thread t3 = new Thread()
	        {
	          public void run()
	          {
	            b.deposite();
	          }
	        };
	        
	        Thread t4 = new Thread()
	        {
	          public void run()
	          {
	            b.withdrawl();
	          }
	        };
	        
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	        
	        t1.join();
	        t2.join();
	        t3.join();
	        t4.join();
	    
	    
	}

}
