package javaprojects;

class counter {
	int count=10;
	public synchronized void increment() {
		count=0;
		for(int i=1;i<=10;i++)
		count =count+5;
		System.out.println(count);
	}
	public int getcount() {
		return count;
	}
}
class counterThread  {
	public static void main (String []args)throws InterruptedException{
	counterThread c= new counterThread();
	Thread t1=new Thread() {
		public void run() {
			c.increment();
		}
	};
	Thread t2=new Thread() {
		public void run() {
			c.increment();
		}
	};
	Thread t3=new Thread() {
		public void run() {
			c.increment();
		}
	};
	t1.start();
	t2.start();
	t3.start();
	
	
 }

	protected void increment() {
		// TODO Auto-generated method stub
		
	}
}
