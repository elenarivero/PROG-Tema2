package pruebas;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		while(true) {
			numero = sc.nextInt();
			if(numero < 0) {
				break;
			}
		}

	}

}
