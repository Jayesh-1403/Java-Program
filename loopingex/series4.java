package loopingex;

import java.util.Scanner;

public class series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the vaues on n: ");
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		int i,sum;
		sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+(i*(i+1));
			System.out.print(i+"*"+(i+1));
			if(i<n){
				System.out.print(" + ");
			}
			
				
			
		}System.out.print(" = "+sum);
		
	}

}
