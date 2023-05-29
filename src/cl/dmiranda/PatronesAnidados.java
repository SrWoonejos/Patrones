//Desafio M2 patrones anidados
package cl.dmiranda;

import java.util.Scanner;

public class PatronesAnidados {

	public static void patron1(int size) {
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				if (x == 0 || x == size - 1) {
					System.out.print("*");
				} else {
					if (y == 0 || y == size - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void patron2(int size) {
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				if (x == 0 || x == size - 1) {
					System.out.print("*");
				} else {
					if ((x + 1) == (size - y)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void patron3(int size) {
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				if ((x + 1) == (size - y) || (x + 1) == (y + 1)) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patron4(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((j > 0 && j < size-1) || (i==0 && j == 0) || (i==size-1 && j == size-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int tamanio = 0;
		boolean esNumero = false;
		Scanner sc = new Scanner(System.in);

		while (!esNumero) {
			try {
				System.out.println("Ingrese un numero");
				tamanio = Integer.parseInt(sc.nextLine());
				esNumero = true;
			} catch (NumberFormatException e) {
				System.out.println("Error! ingrese un numero");
			}
			sc.close();
		}

		System.out.println("Patrón 1: ");
		patron1(tamanio);
		System.out.println();
		System.out.println("Patrón 2: ");
		patron2(tamanio);
		System.out.println();
		System.out.println("Patrón 3: ");
		patron3(tamanio);
		System.out.println();
		System.out.println("Patrón 4: ");
		patron4(tamanio);
	}
}
