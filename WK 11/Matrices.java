import java.util.Scanner;

public class Matrices {
	public static void main(String[] args){
		final int M_I = 3;
		final int M_J = 3;

		//Objective 1: Create a Scanner object to read input
		Scanner scnr = new Scanner(System.in);

		//Objective 2: Declare two 3x3 multidimensional arrays
		int[][] arr1 = new int[M_I][M_J];
		int[][] arr2 = new int[M_I][M_J];


		//Objective 3: Populate the first array with user input
		for (int i = 0; i < M_I; ++i){
			for (int j = 0; j < M_J; ++j){
				System.out.print("Input a number to first matrix at [" + (i + 1) + "," + (j + 1) + "]: ");
				
				arr1[i][j] = scnr.nextInt();
				System.out.println();
			}
		}

		//Objective 4: Populate the second array with user input
		for (int i = 0; i < M_I; ++i){
			for (int j = 0; j < M_J; ++j){
				System.out.print("Input a number to second matrix at [" + (i + 1) + "," + (j + 1) + "]: ");
				
				arr2[i][j] = scnr.nextInt();
				System.out.println();
			}
		}

		//Objective 5: Print both arrays (I use 3 for loops to print both arrays in the same block, but there's a more simple way)
		for (int k = 0; k < 2; ++k){
			if (k == 0){
				System.out.println("\n    Array 1:");
			}
			else {
				System.out.println("\n    Array 2:");
			}
			for (int i = 0; i < M_I; ++i){
				for (int j = 0; j < M_J; ++j){
					if (k == 0){
						System.out.print(arr1[i][j] + "\t");
					}
					else {
						System.out.print(arr2[i][j] + "\t");
					}
				}
				System.out.println("\n");
			}
			System.out.println();
		}

		//Objective 6 & 7 Add/Subtract and print the results (I use 3 loops, but you can break these apart)
		for (int k = 0; k < 2; ++k){
			if (k == 0){
				System.out.println("\nArray 1 + Array 2:");
			}
			else {
				System.out.println("\nArray 1 - Array 2:");
			}

			for (int i = 0; i < M_I; ++i){
				for (int j = 0; j < M_J; ++j){
					if (k == 0){
						System.out.print(arr1[i][j] + arr2[i][j] + "\t"); // You may decide to store the sum in a new array or directly output it
					}
					else {
						System.out.print(arr1[i][j] - arr2[i][j] + "\t"); // You may decide to store the sum in a new array or directly output it
					}
				}
				System.out.println("\n");
			}
			System.out.println();

		}
	}
}