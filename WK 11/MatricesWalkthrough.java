import java.util.Scanner;




public class MatricesWalkthrough{

	public static void fillArrays(int[][] inputArr, Scanner scnr){
		System.out.println("Input some numbers: ");
		for (int i = 0; i < inputArr.length; ++i){
			for (int j = 0; j < inputArr[i].length; ++j){
				inputArr[i][j] = scnr.nextInt();
			}
		}
	}
	
	public static void printArrays(int[][] inputArr){
		System.out.println();
		for (int i = 0; i < inputArr.length; ++i){
			for (int j = 0; j < inputArr[i].length; ++j){
				System.out.print(inputArr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] addArrays(int[][] arr1, int[][] arr2){
		int[][] sum = new int[3][3];
		for (int i = 0; i < sum.length; ++i){
			for (int j = 0; j < sum[i].length; ++j){
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args){
		final int ELEMSIZE = 3;
		int[][] something1 = new int[ELEMSIZE][ELEMSIZE];
		int[][] something2 = new int[ELEMSIZE][ELEMSIZE];

		int[][] result = new int[ELEMSIZE][ELEMSIZE];

		Scanner scnr = new Scanner(System.in);

		fillArrays(something1, scnr);
		System.out.println("Array 1");
		printArrays(something1);

		fillArrays(something2, scnr);
		System.out.println("Array 2");
		printArrays(something2);

		result = addArrays(something1, something2);
		System.out.println("Sum");
		printArrays(result);
	}
}



