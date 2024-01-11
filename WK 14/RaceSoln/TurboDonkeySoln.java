//Objective 10 - Copy Car.java and rename as TurboDonkey.java

//Objective 10a - change speed to random.nextInt() %7 + 10

//Objective 10b - add 1 to turbo when subtracting milesTilNextLap if turbo >= 1

import java.util.Random;


public class TurboDonkeySoln {
	Random r = new Random();

	int milesPerHour = r.nextInt() % 7 + 10;
	int lapsRemaining = 3;
	int milesTilNextLap = 30;

	public int drive(int turbo){
		if (turbo >= 1){
			milesTilNextLap -= (milesPerHour + turbo + 1);
		}
		else {
			milesTilNextLap -= (milesPerHour + turbo);
		}

		if (milesTilNextLap <= 0){
			lapsRemaining -= 1;
			milesTilNextLap += 30;
		}

		return lapsRemaining;
	}
}