import java.util.Random;

public class RandomEx {
	public static void main(String[] args){

		Random randomObjName = new Random(5);

		int myNum = randomObjName.nextInt(2);

		for (int i = 0; i < 5; ++i){
			myNum = randomObjName.nextInt(2);
			System.out.println(myNum);
		}

	}

}