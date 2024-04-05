package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Student
{
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
			this.rollNo=rollNo;
			this.name=name;
			this.age=age;
			
			
		}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

}
public class studentData {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<>();
		Student s1 = new Student(1, "Ash", 20);
		Student s2 = new Student(2, "gwen", 21);
		Student s3 = new Student(3, "kevin", 19);
		Student s4 = new Student(4, "steve", 20);
		Student s5 = new Student(5, "jobs", 23);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}


