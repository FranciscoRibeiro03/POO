package aula03;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		final int months = 12;
		double montante, taxa;

		Scanner sc = new Scanner(System.in);

		do {

			montante = Util.getDouble("Montante inicial: ", sc, 0);

			if (montante % 1000 != 0) System.out.println("Indique um valor múltiplo de 1000!");

		} while (montante % 1000 != 0);

		taxa = Util.getDouble("Indique a taxa de juro mensal (%): ", sc, 0, 5);

		for (int i = 1; i <= months; i++) {
			montante += montante * (taxa / 100);
			System.out.printf("Balanço no final do mês %02d (EUR): %.2f\n", i, montante);
		}
		
		sc.close();
	}
}
