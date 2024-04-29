package javaprojects;


 class BankAccount2 
{
	int balance=20000;
	int amount;
	
	public synchronized void withdrawl(int amount)
	{
		
		System.out.println("Withdraw your Amount here:");
		if(balance < amount)
		{
			System.out.println("Insufficient funds,plz Deposite");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//balance -= amount;
		//System.out.println("New Balance = "+balance);
		System.out.println("Amount After Withdrow ="+(balance-amount));
		System.out.println("Thanks for withdrawing");
	}
	
	public synchronized void deposite(int amount)
	{
		/*
		System.out.println("Deposite here :");
		balance += amount;
		
		System.out.println("The New Balance = "+balance);
		notify();
		*/
		System.out.println("Total balance = "+balance);
		System.out.println("Amount After Deposit ="+ (balance+amount));
		notify();
	}
	
	
}
public class BankAccountThread2 {

	public static void main(String[] args) throws InterruptedException {
		BankAccount2 c = new BankAccount2();
		Thread t1 = new Thread() {
			public void run()
			{
				c.withdrawl(150000);
			}
		};
		
		Thread t2 = new Thread() {
			public void run()
			{
				c.deposite(100000);
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
