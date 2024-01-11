//Objective 1 - Frame the class & main method; define imports (no math imports!)
import java.util.Scanner;

public class CalculatorSoln {
	/* Objective 7 start

	public static double add(double num1, double num2){
		System.out.println("add method needs implemented!");
		return 0.0;
	}
	public static double subtract(double num1, double num2){
		System.out.println("subtract method needs implemented!");
		return 0.0;
	}
	public static double multiply(double num1, double num2){
		System.out.println("Mmultiply method needs implemented!");
		return 0.0;
	}
	public static double divide(double num1, double num2){
		System.out.println("divide method needs implemented!");
		return 0.0;
	}
	public static double modulo(double num1, double num2){
		System.out.println("modulo method needs implemented!");
		return 0.0;
	}
	public static double exponentiate(double num1, double num2){
		System.out.println("exponentiate method needs implemented!");
		return 0.0;
	}

	//Objective 7 end */

	// Objective 9 start

	public static double add(double num1, double num2){
		double result = 0.0;
		
		result = num1 + num2;
		return result;
	}
	public static double subtract(double num1, double num2){
		double result = 0.0;
		
		result = num1 - num2;
		return result;
	}
	public static double multiply(double num1, double num2){
		double result = 0.0;
		
		result = num1 * num2;
		return result;
	}
	public static double divide(double num1, double num2){
		double result = 0.0;

		if (num2 == 0.0){
			System.out.println("Cannot divide by 0!");
			return 0.0;
		}
		
		result = num1 / num2;
		return result;
	}
	public static double modulo(double num1, double num2){
		double result = 0.0;

		if (num2 == 0.0){
			System.out.println("Cannot divide by 0!");
			return 0.0;
		}
		
		result = num1 % num2;
		return result;
	}
	public static double exponentiate(double num1, double num2){
		double result = 0.0;
		
		if (num2 == 0.0){
			return 1;
		}

		else if (num2 < 0.0){
			System.out.println("FIXME: ~~Cannot support negative exponents!~~");
		}

		for (int i = 0; i < (int)num2; ++i){
			result = result * result;
		}

		return result;
	}

	//Objective 9 end */

	public static void main(String[] args) {
	

	/*Objective 2 - Write variables for inputs
	*	
	*	Scanner
	*	first numerical input
	*	second numerical input
	*	operation results
	*	math operation
	*	exit condition
	*
	*/

	Scanner scnr = new Scanner(System.in);

	double firstNum = 0.0;
	double secondNum = 0.0;
	double result = 0.0;

	char mathOp = ' ';
	String exitCondition = " ";


	//Objective 3 - Set up a while loop to continue until exit condition equals 'Q'
		while (exitCondition.toUpperCase().charAt(0) != 'Q'){
			//Objective 4 - Prompt user for first input
			System.out.print("Enter the first number: ");
			firstNum = scnr.nextDouble();
			System.out.println();

			//Objective 5 - Prompt user for math operation
			System.out.print("Enter an operation (  +   -   /   *   ^   %  ): ");
			mathOp = scnr.next().charAt(0);
			System.out.println();

			//Objective 6 - Prompt user for second input
			System.out.print("Enter the second number: ");
			secondNum = scnr.nextDouble();
			System.out.println();


			//Objective 7 - Define method stubs


			//Objective 8 - Call the appropriate method for the given math operation
			switch (mathOp){
				case '+':
					result = add(firstNum, secondNum);
					break;
					
				case '-':
					result = subtract(firstNum, secondNum);
					break;

				case '/':
					result = divide(firstNum, secondNum);
					break;

				case '*':
					result = multiply(firstNum, secondNum);
					break;

				case '^':
					result = exponentiate(firstNum, secondNum);
					break;

				case '%':
					result = modulo(firstNum, secondNum);
					break;

				default:
					System.out.println("Operation not supported!");
			}

			//Objective 9 - Complete the method stubs


			//Objective 10 - Display the result of the math operation

			System.out.println(firstNum + " " + mathOp + " " + secondNum + " = " + result);


			//Objective 11 - Prompt the user to continue
			System.out.println("\nPress 'Q' to quit or any key to continue");
			exitCondition = scnr.next();


			//Objective 12 - Clear all variables & continue loop
			firstNum = 0.0;
			secondNum = 0.0;
			result = 0.0;

			//Afterthought - How can we make this program more efficient?
		}
	}
}