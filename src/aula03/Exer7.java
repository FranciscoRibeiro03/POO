package aula03;

import java.util.Scanner;
import java.util.Random;

public class Exer7 {
	public static void main(String[] args) {
		int n, attempts = 0, randomNumber;

		Scanner sc = new Scanner(System.in);
		randomNumber = new Random().nextInt(100) + 1;

		do {
			n = Util.getInt("Introduza um número: ", sc, 0, 100);
			attempts++;

			if (n > randomNumber)
				System.out.println("O número secreto é menor do que o número introduzido!");
			else
				System.out.println("O número secreto é maior do que o número introduzido!");
		} while (n != randomNumber);

		System.out.println("O número secreto é " + randomNumber + "!");
		System.out.println("Número de tentativas: " + attempts);

		// Código do pretende continuar, deveras confuso oq é suposto fazer aqui
		sc.close();
	}
}
