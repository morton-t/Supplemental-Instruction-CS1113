

//Objective 1 - Write the program class & main method structure
public class Overloading {

	//Objective 5 start - Write an overloaded method for each data type from Objective 2 
	//that contains a print statement that outputs “Input type: " + [DATATYPE] "\n Value: + [ARGVALUE] + "\n"
	public static void datatypeInfo(boolean inputBoolean){
		System.out.println("Input type: boolean");
		System.out.println("Value: " + inputBoolean);
	}

	public static void datatypeInfo(String inputString){
		System.out.println("Input type: String");
		System.out.println("Value: " + inputString);
	}

	public static void datatypeInfo(double inputDouble){
		System.out.println("Input type: double");
		System.out.println("Value: " + inputDouble);
	}

	public static void datatypeInfo(char inputChar){
		System.out.println("Input type: char");
		System.out.println("Value: " + inputChar);
	}

	public static void datatypeInfo(int inputInt){
		System.out.println("Input type: int");
		System.out.println("Value: " + inputInt);
	}
		//Objective 5 end


	//Objective 6 - Write an overloaded method printInput() that multiplies the int and double from Objective 2 and returns the result
	public static double datatypeInfo(int inputInt, double inputDouble){
		return inputInt * inputDouble;
	}

	public static void main(String[] args){ //Also Objective 1


		//Objective 2 - Declare and initialize a variable of each given type with data of your choice: char, int, double, boolean, String 
		int myInt = 7;
		char myChar = 'a';
		double myDouble = 1.1;
		boolean myBoolean = false;
		String myString = "Hello";

		//Objective 3 start - Write a for loop to iterate 5 times
		for (int i = 0; i < 5; ++i){
			
		//Objective 4 - Write an if statement using the for loop variable to call each overloaded method once
			if (i > 3){
				datatypeInfo(myInt);
			}
			else if (i > 2){
				datatypeInfo(myChar);
			}
			else if (i > 1){
				datatypeInfo(myDouble);
			}
			else if (i > 0){
				datatypeInfo(myBoolean);
			}
			else {
				datatypeInfo(myString);
			}
			System.out.println();
		}
			//Objective 3 end

		//Objective 7 - Outside the for loop & if statement, write a print statement 
		//that calls the overloaded method printInput() from Objective 6 and prints its return value to 3 decimal places
		System.out.printf("The product of " + myInt + " and " + myDouble + " is: %.3f", datatypeInfo(myInt, myDouble));
	}
}