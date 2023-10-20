package pruebas;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(1,30);
		
		System.out.println(number);
	}

}
