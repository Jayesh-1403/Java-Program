package ExceptionHandling;

public class Student {

	static void findByRollNumber(int rollNumber) throws StudentNotFoundException {
	if (rollNumber>=1 && rollNumber<=20)
		System.out.println("Student found");
	else 
		throw new StudentNotFoundException("Student not found : "+rollNumber);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	findByRollNumber(19);
	}catch (StudentNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
System.out.println("rest of code....");
}
}
