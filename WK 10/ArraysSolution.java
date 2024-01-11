import java.util.Scanner;


public class ArraysSolution{
	public static void main(String[] args){
	
		//Objective 1 - Declare a constant int with the number 15
		final int ARR_SIZE = 15;
	
		//Objective 2 - Create an array of size ARR_SIZE
		int arr[] = new int[ARR_SIZE];

		//Objective 3 - Create a scanner to read user input
		Scanner scnr = new Scanner(System.in);

		//Objective 4 - Read in 10 ints and store them in our array
		int numElements = 10;
		System.out.print("\nPlease enter " + numElements + " numbers: ");
		for (int i = 0; i < numElements; ++i){
			arr[i] = scnr.nextInt();
		}

		//Objective 5 - Declare a variable to store the smallest number from our input
		int smallest = arr[0];

		//Objective 6 - Use a loop to iterate through our array and store the smallest number
		for (int i = 1; i < numElements; ++i){
			if (arr[i] < smallest){
				smallest = arr[i];
			}
		}

		//Objective 7 - Create a variable for the second-smallest number
		int secondSmallest = smallest;

		//Objective 8 - Find the max-number, then reduce the number until we are just above our min number
		for (int i = 0; i < numElements; ++i){
			if (secondSmallest < arr[i]){
				secondSmallest = arr[i];		//secondSmallest is now the largest element in the array
			}
		}

		//Objective 9 - Save the second-smallest number
		for (int i = 0; i < numElements; ++i){
			if (arr[i] < secondSmallest && arr[i] > smallest){		//if our element is smaller than our current number 
				secondSmallest = arr[i];							//but bigger than the smallest, save it
			}
		}

		//Objective 10 - Print the smallest & second-smallest number
		System.out.println("\n\nThe smallest number in our array is: " + smallest +
						 "\nThe second-smallest number is: " + secondSmallest);


	}
}