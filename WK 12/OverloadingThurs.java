//Objective 1 - Write the program class & main method structure
public class OverloadingThurs{
		//Objective 5 start - Write an overloaded method for each data type from Objective 2 
		// that contains a print statement that outputs:
		// “Input type: " + [DATATYPE] "\n Value: + [ARGVALUE] + "\n"
		public static void method(double number){
			System.out.println(number);
			return;
		}

	public static void main(String[] args){






		//Objective 6 - Write an overloaded method printInput() that multiplies 
		// the int and double from Objective 2 and returns the result



//Objective 2 - Declare and initialize a variable of each 
//type with data of your choice: char, int, double, boolean, String 
	int numVariable = 0;
	char charVariable = 'a';
	double doubleVariable = 0.0;
	boolean isWhite = true;
	String stringVariable = "a";


//Objective 3 start - Write a for loop to iterate 5 times
	for (int i = 0; i < 5; i++) {
		//Objective 4 - Write an if statement using the for loop variable 
		//to call each overloaded method once

		if (i == 0) {
			method(numVariable);
		}
		else if (i == 1) {

		}
		else if (i == 2) {

		}
		else if (i == 3) {

		}
		else {

		}
	}




//Objective 7 - Outside the for loop & if statement, write a print statement 
		// that calls the overloaded method printInput() from Objective 6 and 
		// prints its return value to 3 decimal places

	}

}