import java.util.Scanner;

public class Calc{

	public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);


	//Objective 1 - Maintain a userInput field & a results field
	double userInput = 0;
	double result = 0;
	char exit = '!';

	//Objective 2 - Run until an exit condition has been given

		while(exit != '?'){

			//Objective 3 - use local variables to store temporary operations and math operators
			double tempInput = 0.0;



			//Objective 6 - Conditional variables declared within scope of the conditional operation
			char mathOp = ' ';
			
			
			//Prompt first number input if not already present
			if (userInput == 0){
				System.out.print("\nPlease enter the first number: ");
				userInput = scnr.nextDouble();
			}
			//Otherwise print current stored number
			else{
				System.out.println("\nCurrent number: " + userInput);
			}
			


			//Prompt for operator
			System.out.print("\nInput an operation:\t'+' \t'-' \t'/' \t'*'\t: ");
			mathOp = scnr.next().charAt(0);



			//Prompt second number
			System.out.print("\nPlease enter the second number: ");
			tempInput = scnr.nextDouble();



			//Objective 5 (part a) -- Print after each operation						///////////////
			System.out.print("\n" + userInput + " " + mathOp + " " + tempInput + " = ");



			//Objective 4 - Reuse user input when calculating the total
			if (mathOp == '+'){
				userInput += tempInput;
			}
				
			else if (mathOp == '-'){
				userInput -= tempInput;
			}

			else if (mathOp == '*'){
				userInput *= tempInput;
			}
				
			else if (mathOp == '/'){
				userInput /= tempInput;
			}

			else {
				System.out.print("\nInvalid operator! Exiting program!");
				return;
			}
			//End objective 4



			//Objective 5 (part b) - Print after each operation						///////////////
			System.out.print(userInput);


			//Objective 2 - update exit condition
			System.out.print("\nInput '?' to exit or ! to continue: ");
			exit = scnr.next().charAt(0);
		}

	}
}