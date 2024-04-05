package loopingex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int n = sc.nextInt();

		float i, sum = 0;
		for (i = 1; i <= 10; i++)
			sum = sum + (1 / i);
		System.out.println("1/" + (int) i);
		if (i < n)
			System.out.println(" + ");

		System.out.println(" = " + sum);
	}
}
