package aula04;

import java.util.Scanner;

public class Util {

	public static String getString(String message, Scanner sc) {
		System.out.print(message);
		return sc.nextLine();
	}

	public static double getDouble(String message, Scanner sc, double min, double max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextDouble()) {
				double value = sc.nextDouble();

				if (value >= min && value <= max)
					return value;
				else if (min != Double.MIN_VALUE && max != Double.MAX_VALUE)
					System.out.println("Valor inválido! Introduza um valor entre " + min + " e " + max + ".");
				else if (min != Double.MIN_VALUE)
					System.out.println("Valor inválido! Introduza um valor superior a " + min + ".");
				else
					System.out.println("Valor inválido!");

			} else {
				System.out.println("Introduza um número válido!");
				sc.next();
			}
		}
	}

	public static double getDouble(String message, Scanner sc, double min) {
		return getDouble(message, sc, min, Double.MAX_VALUE);
	}

	public static double getDouble(String message, Scanner sc) {
		return getDouble(message, sc, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	public static int getInt(String message, Scanner sc, int min, int max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextInt()) {
				int value = sc.nextInt();

				if (value >= min && value <= max)
					return value;
				else if (min != Integer.MIN_VALUE && max != Integer.MAX_VALUE)
					System.out.println("Valor inválido! Introduza um valor entre " + min + " e " + max + ".");
				else if (min != Integer.MIN_VALUE)
					System.out.println("Valor inválido! Introduza um valor superior a " + min + ".");
				else
					System.out.println("Valor inválido!");

			} else {
				System.out.println("Introduza um número válido!");
				sc.next();
			}
		}
	}

	public static int getInt(String message, Scanner sc, int min) {
		return getInt(message, sc, min, Integer.MAX_VALUE);
	}

	public static int getInt(String message, Scanner sc) {
		return getInt(message, sc, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

}