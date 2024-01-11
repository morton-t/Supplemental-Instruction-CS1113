import java.util.Scanner;
import java.util.Random;

public class RandomNums {

	public static void main(String[] args){

		// 1. Create a Scanner object for user input
		Scanner scnr = new Scanner(System.in);	

		// 2. Have the scanner take an input and store it as a long
		System.out.print("\nPlease enter a seed number: ");
		long randSeed = scnr.nextLong();		

		// 3. Create a Random object with the given long as a seed
		Random rGen = new Random(randSeed);		

		// 4. Generate a random integer between 65 and 122 inclusive
		int randomNumber = rGen.nextInt(58) + 65;

		// 5. Print the random number, the number divided by 13, and the number as a character
		System.out.println("\n\nYour random number is: " + randomNumber);
		System.out.println("Your random number divided by 13 is: " + (double) randomNumber / 13);
		System.out.println("Your random number as an ASCII representation is the character: \'" + (char) randomNumber + "\'");
	}
}