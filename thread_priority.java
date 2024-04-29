package javaprojects;

public class thread_priority implements Runnable {
	
	public void run() {
		System.out.println("thread has been created and working! "+Thread.currentThread());
	}

	public static void main(String[] args) {
	Runnable r1=new thread_priority ();
	Thread t2=new Thread(r1,"hello");
	t2.setPriority(8);
	t2.start();
	
	Runnable r2=new thread_priority ();
	Thread t3=new Thread(r2,"cyber");
	t3.setPriority(7);
	t3.start();
	
	
	Runnable r3=new thread_priority ();
	Thread t4=new Thread(r3,"success");
	t4.setPriority(2);
	t4.start();
	

	System.out.println("thread name: "+t2.getName());
	t2.setName("pune");
	t2.setPriority(4);
	System.out.println(t2.getName()+" "+t2.getPriority());
	
	
	}

}
