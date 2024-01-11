public class FindingErrors{
	public satic void main(String[] args) {

		int catsAwesomeness = 10;
		int dogsAwesomeness = 9;

		println("On a scale of 1-10, cats are a: " + catsAwesomeness);
		println("On a scale of 1-10, dogs are a: dogsAwesomeness");
	}
}


//Syntax errors:
//line 1 - class names must always match the filename. Change FindingErrors to FindingErrors1
//line 2 - the main method should say 'static' not 'satic'
//lines 7 and 8 - the print statement should read 'System.out.println' instead of 'println'

//Logic errors: 
//line 8 - dogsAwesomeness is part of the string when we meant it to display the integer value