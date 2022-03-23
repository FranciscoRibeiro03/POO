package aula03;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double first = Util.getDouble("Introduza um número inteiro: ", sc);
		double max = first;
		double min = first;
		double sum = first;
		int count = 1;

		double temp;

		do {
			temp = Util.getDouble("Introduza um número inteiro: ", sc);

			if (temp > max) max = temp;
			else if (temp < min) min = temp;

			sum += temp;
			count++;
		} while (first != temp);

		double media = sum / count;

		System.out.println(String.format("Máximo: %.2f", max));
		System.out.println(String.format("Mínimo: %.2f", min));
		System.out.println(String.format("Média: %.2f", media));
		System.out.println(String.format("Número total de elementos lidos: %d", count));
		sc.close();
	}
}
