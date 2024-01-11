//Objective 1 - Frame the class & main method; define imports (no math imports!)
import java.util.Scanner;

public class Calculator {
	public static double addNums(double num1, double num2){
		return num1 + num2;
	}


	public static void main(String[] args){
	
	/*Objective 2 - Write variables for inputs
*
*	first numerical input
*	second numerical input
*	math operation
*	exit condition
*
*/
	double firstNum;
	double secondNum;
	double result;

	char mathOp;
	String exitCondition = "";

	Scanner scnr = new Scanner(System.in);

//Objective 3 - Set up a while loop to continue until exit condition equals 'Q'
	while (!exitCondition.equals("Q")){
		
		//Objective 4 - Prompt user for first input
		System.out.println("Enter the first number: ");
		firstNum = scnr.nextDouble();

		//Objective 5 - Prompt user for math operation
		System.out.println("Enter a math operation:		*		/		+		-		^		%:");
		mathOp = scnr.next().charAt(0);

		//Objective 6 - Prompt user for second input
		System.out.println("Enter the second number: ");
		secondNum = scnr.nextDouble();

		//Objective 7 - Define method stubs
		result = addNums(firstNum, secondNum);
		System.out.println("Your number is " + result);
		System.out.println("Press 'Q' to exit: ");

		exitCondition = scnr.next();


		//Objective 8 - Call the appropriate method for the given math operation


		//Objective 9 - Complete the method stubs


		//Objective 10 - Display the result of the math operation


		//Objective 11 - Prompt the user to continue


		//Objective 12 - Clear all variables & continue loop

	}
	




	}

}



