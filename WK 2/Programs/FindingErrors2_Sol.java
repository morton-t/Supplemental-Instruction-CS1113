public static void main(Strings[] arg){
	int catsAwesomeness = 10;
	int dogsAwesomeness = catsAwesomeness * 3 / 2;

	System.out.println("OK dogs are as awesome as cats.");
	System.out.println("I'll them both an average of: " + (dogsAwesomeness + catsAwesomeness) / 3);


//Syntax errors:
//line 0 - We're missing the class!
//line 1 - 'Strings[] arg' should read 'String[] args'

//logic errors:
//line 3 - integer division truncates! We can't get a correct answer for division with an integer here
//line 6 - We're taking an average, but we divide the sum of two things by 3!

//runtime errors:
//we have none, but if we asked a user to input a number for dogsAwesomeness, they could break the program by entering a decimal number