package javaprojects;

import java.util.ArrayList;

class student{
	
	int student_id;
	String student_name;
	double student_per;
	public student(int student_id, String student_name, double student_per) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_per = student_per;
	}
	
	}

public class array_list_student {

	public static void main(String[] args) {
		student st1=new student(45,"rushi",86.36);
		ArrayList<student>  list2=new ArrayList<student>();
		list2.add(st1);
		for(student k:list2) {
			if(k.student_per>=35) {
				System.out.println("student name: "+k.student_name+" student id: "+k.student_id+" he is passed with "+k.student_per+" percentage");
			}
			else
				System.out.println("student name: "+k.student_name+" student id: "+k.student_id+" he is failed with "+k.student_per+" percentage");
		}
	}

}
