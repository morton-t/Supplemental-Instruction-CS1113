import java.util.Scanner;


public class Arrays {
	public static void main(String[] args){

	//Objective 1 - Declare a constant int with the number 15
	final int ARR_SIZE = 15;

	//Objective 2 - Create an int array of size ARR_SIZE
	int[] myArr = new int[ARR_SIZE];


	//Objective 3 - Create a scanner to read user input
	Scanner scnr = new Scanner(System.in);

	//Objective 4 - Read in 10 ints and store them in our array
	for(int i = 0; i < 10; ++i){
		myArr[i] = scnr.nextInt();
	}

	//Objective 5 - Declare a variable to store the smallest int from our input
	int smallestNum = myArr[0];

	//Objective 6 - Use a loop to iterate through our array and store the smallest number
	for (int i = 0; i < 10; ++i){
		if (myArr[i] < smallestNum){
			smallestNum = myArr[i];
		}
	}

	System.out.println("Smallest number: " + smallestNum);

	//Objective 7 - Create a variable for the second-smallest number
	int secondSmallest = myArr[0];

	


	//Objective 8 - Find the max-number, then reduce the number until we are just above our min number
	for (int i = 0; i < 10; ++i){
		if (myArr[i] > secondSmallest){
			secondSmallest = myArr[i];
		}
	}


	//Objective 9 - Save the second-smallest number
	for (int i = 0; i < 10; ++i){
		if (myArr[i] < secondSmallest && myArr[i] > smallestNum){
			secondSmallest = myArr[i];
		}
	}


	//Objective 10 - Print the smallest & second-smallest number
	System.out.println("Second smallest number: " + secondSmallest);
	}
}