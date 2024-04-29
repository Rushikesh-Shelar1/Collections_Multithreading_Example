package javaprojects;

public class thread_sleeping2 extends Thread {
	public void run()
	{
		System.out.println("before sleeping of thread");
		String str[]= {"hello","all","welcome","to","the","world","of","sleeping"};
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+" ");
		}
	}
	public static void main(String[] args) {
		thread_sleeping2 t1=new thread_sleeping2();
		thread_sleeping2 t2=new thread_sleeping2();
		thread_sleeping2 t3=new thread_sleeping2();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
