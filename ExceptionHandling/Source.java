package ExceptionHandling;

import java.util.Scanner;

public class Source {
	
		static void checkAge(int age) {
			if(age>=15) {
				System.out.println("valid");
				
			}
			else {
				throw new ArithmeticException("invalid");
			}
		}
		public static void main(String [] args) {
			Scanner sc = new Scanner (System.in);
			int a=sc.nextInt();
			Source obj = new Source();
			
			try {
				obj.checkAge(a);
			}catch (MyException e) {
				e.printStackTrace();
			}
			System.out.println("rest of code...");
		}
}

	


