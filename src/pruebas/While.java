package pruebas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		int numero = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		while (numero >= 0) {

			if (numero % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}// fin if

			System.out.println("Introduzca un número");
			numero = sc.nextInt();
		} // fin while

		sc.close();

	}

}
