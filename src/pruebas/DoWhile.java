package pruebas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		char valor;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca S o N");
			valor = sc.nextLine().charAt(0);
		} while(valor != 'S' && valor != 'N');

		System.out.println("VALOR CORRECTO");
		
		sc.close();
	}

}
