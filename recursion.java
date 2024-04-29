package javaprojects;

public class recursion {
	static int fact=1;
	public static void slogan(int i)
	{
		if(i<=5) {
		System.out.println("I am Rushikesh");
		i++;
		slogan(i);
		}
	}
	public static void factorial(int j) {
		if(j<=5) {
			
		fact=fact*j;
		System.out.println(fact);
		j++;
		factorial(j);
		}
	}
	public static void main(String[] args) {
		slogan(1);
		factorial(1);
		

	}

}
