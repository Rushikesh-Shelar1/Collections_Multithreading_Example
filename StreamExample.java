package javaprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(54);
		al.add(22);
		al.add(18);
		al.add(4);
		System.out.println(al);
		
		//List<Integer> square = al.stream().map(x->x*x).collect(Collectors.toList());
		
		List<Integer> square2 = al.stream().filter(x->x%2==0).map(x->x*x).sorted().collect(Collectors.toList());  // we can sort it by using method in stream
		System.out.println(square2);
		int add =al.stream().map(x->x).reduce(1,(sum,x)->x*sum);
		System.out.println(add);
		
//		System.out.println(square2);
//		
//		List<String> s_list = new ArrayList<String>();
//		s_list.add("Sunil");
//		s_list.add("Tushar");
//		s_list.add("Sidharth");
//		s_list.add("Gaurav");
//		s_list.add("Parikshit");
//		
//		List<String> sameLetter = s_list.stream().filter(str->str.startsWith("S")).map(x->x).collect(Collectors.toList());
//		System.out.println(sameLetter);

	}

}
