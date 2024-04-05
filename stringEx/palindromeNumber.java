//program to check whether given string is a palindrome or not?

package stringEx;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int r, sum = 0, temp;
		        Scanner sc = new Scanner(System.in);
		        int n  = sc.nextInt();
		       // int n = 454; // It is the number variable to be checked for palindrome
		        temp = n;
		        while (n > 0) {
		            r = n % 10; // Getting remainder
		            sum = (sum * 10) + r;
		            n = n / 10;
		        }
		        if (temp == sum)
		            System.out.println("palindrome number");
		        else
		            System.out.println("not palindrome");
		    }
		

	}


