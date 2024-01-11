//Objective 1 - write a main method & create an object of type 'Car' and
//	another object of type 'TurboDonkey'

import java.util.Random;

public class RaceSoln {
	public static void main(String[] args){
		CarSoln myCar = new CarSoln();
		TurboDonkeySoln myDonkey = new TurboDonkeySoln();

		//Objective 2 - create a random object
		Random r = new Random();

		//Objective 3 - Write a for loop that runs indefinitely and...
		while (true){
			//3a ...contains an if block checking car.drive(random.nextInt() % 1)
			if (myCar.drive(r.nextInt() % 2) == 0){
				System.out.println("Car won!");
				break;
			}
			//3b ...contains an if block checking turbodonkey.drive(Math.random % 1)
			else if (myDonkey.drive(r.nextInt() % 2) == 0){
				System.out.println("Donkey won!");
				break;
			}
			//3c otherwise continues
			else {
				continue;
			}
			
		}
	}
}
