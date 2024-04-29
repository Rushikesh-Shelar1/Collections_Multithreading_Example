package javaprojects;
class DeadLockExm 
{
	String city ="Pune";
	String state ="Maharastra";
	String country ="India";
	
	public void display()
	{
		synchronized(city)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("This is pune City");
		}
		
		synchronized(state)
		{
			System.out.println("This is Maharastra State");
		}
		
		synchronized(country)
		{
			System.out.println("Athiti Devo Bhav!");
		}
	}
	
	public void info()
	{
		synchronized(city)
		{
			System.out.println("This is pune City");
		}
		
		synchronized(state)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("This is Maharastra State");
		}
		
		synchronized(city)
		{
			System.out.println("This is pune City");
		}
		
	}
}


public class DeadLockThread {

	public static void main(String[] args) {
		DeadLockExm dc = new DeadLockExm();
		Thread t1 = new Thread() {
			public void run() 
			{
				dc.display();
				dc.display();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() 
			{
				dc.info();
				dc.display();
			}
		};
		
		t1.start();
		t2.start();

	}

}
