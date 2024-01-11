//Objective 4 - Define a car object


import java.util.Random;

public class CarSoln {
	//Objective 5 - create a random object
	Random r = new Random();

	//Objectives 6, 7, 8 - set the values of the given ints
	int milesPerHour = r.nextInt() % 10 + 10;
	int lapsRemaining = 3;
	int milesTilNextLap = 30;

	//Objective 9 - Define a drive method

	public int drive(int turbo){ //Objective 9a - that takes int turbo as a parameter
		
		//Objective 9b - subtracts MPH + turbo from milesTilNextLap
		milesTilNextLap -= (milesPerHour + turbo);

		//Objective 9c - check if milesTilNextLap <= 0
		//	subtract a lap, add 30 miles to milesTilNextLap
		if (milesTilNextLap <= 0){
			lapsRemaining -= 1;
			milesTilNextLap += 30;
		}

		//Objective 9d - return lapsRemaining
		return lapsRemaining;
	}
}