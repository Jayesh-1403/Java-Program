package Arrayex;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(a[i][j] + " ");

			System.out.println();
			int rowsize, columnsize;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter rowsize and colunmsize : ");
			rowsize = sc.nextInt();
			columnsize = sc.nextInt();

			int b[][] = new int[rowsize][columnsize];

			System.out.println(" Enter array elements : ");
			for ( i = 0; i < rowsize; i++) {
				for (int j = 0; j < columnsize; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			System.out.println("Array : ");
			for ( i = 0; i < rowsize; i++) {
				for (int j = 0; j < columnsize; j++) {
					System.out.print(b[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

}
