package loopingex;

import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter the vaues on n: ");
int n=sc.nextInt();
float i,sum;
sum=0;
for(i=1;i<=n;i++) {
System.out.println((int)i+" / "+(int)i*(int)i);
if (i<n)
{
	System.out.println(" + ");
}
	}
	System.out.println(" * "+sum);


	}}



