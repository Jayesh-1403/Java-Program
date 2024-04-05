package loopingex;

import java.util.Scanner;

public class series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n :");
 int n = sc.nextInt();
 int i, sum, j;
 sum=0;
 for(i=1;i<=n;i++)
 {
	 int fact = 1;
	 for(j=n;j>=1;j--)
	 {
		 fact=fact*j;
	 }
	 sum=sum+i/fact;
	 
	 
 }
 System.out.println(" = "+sum);
	}

}
