package pruebas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		int i = 1;
		
		while(i<=10) {
			System.out.print(i + " ");
			
			if(i%2 == 0) {
				System.out.println("Es par");
				continue;
			}
			System.out.println("Es impar");
			i++;
		}

	}

}
