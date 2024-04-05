package loopingex;

import java.util.Scanner;

public class SeriesSquare5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the vaues on n: ");
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.print(" " +i*i);
		}
	}

}
