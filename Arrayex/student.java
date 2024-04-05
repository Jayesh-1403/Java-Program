package Arrayex;

import java.util.Scanner;

import ExceptionHandling.Student;

public class student {

	// TODO Auto-generated method stub
	int rollNumber;
	String name;
	float java, cpp, python;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();

		System.out.println("Enter marks of java,c++,python : ");
		java = sc.nextInt();
		cpp = sc.nextInt();
		python = sc.nextInt();
	}
	public void calcute(){
		/*
		 * Local variable
		 */
		float total,percent = 0;
		
		total = java+cpp+python;
		System.out.println("Student Rollnumber : "+rollNumber);
		System.out.println("Student Name : "+name);
		System.out.println(" Total : "+total);
		System.out.println(" Percent : "+percent);
	}
	public static void main(String[] args) {
		Student student1 = new Student();//object creation
		
	}
}
