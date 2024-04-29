package javaprojects;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st =new Stack<String>();
		st.add("Amol");
		st.add("Rushikesh");
		st.add("Sunil");
		st.add("Tushar");
		
		System.out.println(st);
		st.push("Piyush");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
	}

}
