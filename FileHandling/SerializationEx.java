package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student student = new Student(101, "Reena");
		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\pqr.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.flush();
		System.out.println("converted to byte stream");
	}

}
