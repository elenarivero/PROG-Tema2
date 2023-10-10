package pruebas;

import java.util.Scanner;

public class SwitchMes {

	public static void main(String[] args) {
		int mes;
		int dias;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número del mes");
		mes = sc.nextInt();

		dias = switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			// 31 días
			yield 31;
		}
		case 2 -> {
			// 28 días
			yield 28;
		}
		case 4, 6, 9, 11 -> {
			// 30 días
			yield 30;
		}
		default -> {
			System.out.println("Valor no válido");
			yield 0;
		}
		};

	}

}
