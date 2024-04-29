package javaprojects;

public class join_method_thread1 extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(char i='A';i<='E';i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		join_method_thread1 t1=new join_method_thread1();
		join_method_thread1 t2=new join_method_thread1();
		join_method_thread1 t3=new join_method_thread1();
		
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}

}
