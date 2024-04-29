package javaprojects;

public class thread_sleeping1 {

	public static void main(String[] args) {
			System.out.println("before sleeping of the main thread");
			String str[]= {"hello","all","welcome","to","the","world","of","sleeping"};
			for(int i=0;i<str.length;i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					 
					e.printStackTrace();
				}
				System.out.print(str[i]+" ");
			}  
			System.out.println("good morning thread");
			
	}

}
