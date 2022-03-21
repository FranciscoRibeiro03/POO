package aula03;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		double first, sum = 0, max, min, temp, media;
		int index = 1;

		Scanner sc = new Scanner(System.in);

		first = Util.getDouble("Introduza um número inteiro: ", sc);
		max = first;
		min = first;
		sum += first;

		do {
			temp = Util.getDouble("Introduza um número inteiro: ", sc);

			if (temp > max)
				max = temp;
			if (temp < min)
				min = temp;
			sum += temp;

			index++;
		} while (first != temp);

		media = sum / index;

		System.out.printf("Máximo: %.2f\nMínimo: %.2f\nMédia: %.2f\nNúmero de elementos: %d\n", max, min, media, index);
		sc.close();
	}
}
