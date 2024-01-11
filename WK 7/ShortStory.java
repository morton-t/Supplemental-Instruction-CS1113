import java.util.Scanner;

public class ShortStory{
	public static void main(String[] args){
		//1. Declare & Initialize a Scanner
		Scanner scnr = new Scanner(System.in);

		//2. Write 4 descriptive complete sentences ending in \n as Strings
		String sent1 = "I took my dog for a walk again today.\n";
		String sent2 = "My dog made another animal friend, and they kept eachother company.\n";
		String sent3 = "I always wonder if different species of animals can communicate.\n";
		String sent4 = "On the beach I found another new skateboard.\n";
		String sent5 = "I always enjoy visiting the ocean.\n";
		

		//3. Prompt a user input for a number from 1-3
		System.out.println("Please enter a number from 1 - 3: ");

		//4. Save the user input to an int
		int sentinal = scnr.nextInt();

		//5. Write a for loop to iterate a number of times equal to the given int
		for (int i = 0; i < sentinal; ++i){

			//6a. Write a for loop to compare two sentences and their chars at index i using and
			if (sent1.compareTo(sent2) < 0 && sent1.charAt(i) < sent2.charAt(i)){
				System.out.print(sent1);
			}
			//6b. compare two sentences and their chars at index i using or
			else if (sent1.compareTo(sent2) < 0 || sent1.charAt(i) < sent2.charAt(i)){
				System.out.print(sent2);
			}
			//6c. print both sentences if neither statement is true
			else{
				System.out.print(sent5);
			}

			//7. Repeat 6a - 6c for the last two sentences

			//7a. Write a for loop to compare two sentences and their chars at index i using and
			if (sent3.compareTo(sent4) < 0 && sent3.charAt(i) > sent4.charAt(i)){
				System.out.print(sent3);
			}
			//7b. compare two sentences and their chars at index i using or
			else if (sent3.compareTo(sent4) > 0 || sent3.charAt(i) < sent4.charAt(i)){
				System.out.print(sent4);
			}
			//7c. print both sentences if neither statement is true
			else{
				System.out.print(sent5);
			}

		}
	}
}