package pruebas;

import java.util.Scanner;

public class SwitchNota {

	public static void main(String[] args) {
		int nota;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una nota:");
		nota = sc.nextInt();

		switch (nota) {
		case 1, 2, 3, 4 -> { // es suspenso
			System.out.println("Suspenso");
			System.out.println("Estudia más");
		}
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> {
			System.out.println("Sobresaliente");
			System.out.println("ENHORABUENA :)");
		}
		}

		sc.close();
	}

}
