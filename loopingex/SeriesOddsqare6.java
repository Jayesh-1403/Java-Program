package loopingex;

import java.util.Scanner;

public class SeriesOddsqare6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the vaues on n: ");
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		int i,sum;
		sum=0;
		for (i=1;i<=n;i++) 
		i =i+2;
		{
			System.out.println(" " +i*i);
		}
			
	}

}
