package ExceptionHandling;

public class ThrowsEx {

	static void checkAge(int age) {
		if(age>=18) {
			System.out.println("Welcoe to vote");
			
		}
		else {
			throw new ArithmeticException("Age is not valid");
		}
	}
	public static void main(String [] args) {
		try {
			checkAge(20);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("rest of code...");
	}
}
