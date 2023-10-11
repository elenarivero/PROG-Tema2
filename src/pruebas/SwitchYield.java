package pruebas;

public class SwitchYield {

	public static void main(String[] args) {
		int a = 1;
		int valor = 0;

		valor = switch (a + 1) {
		case 1 -> {yield 1;}
		case 2 -> {yield (a=a+1);}
		default -> 0;
		};

		System.out.println("Valor: " + valor);
		System.out.println("a: " + a);
	}

}
