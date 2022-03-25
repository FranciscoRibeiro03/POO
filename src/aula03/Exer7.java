package aula03;

import java.util.Scanner;
import java.util.Random;

public class Exer7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;

		do {
			game(sc);
			answer = Util.getString("Deseja continuar? Escreva (S)im para continuar, ou outra coisa para sair: ", sc).toLowerCase();
		} while (answer.equals("s") || answer.equals("sim"));

		sc.close();
	}

	public static void game(Scanner sc) {
		int attempts = 0, guess;
		int randomNumber = new Random().nextInt(100) + 1;

		do {
			guess = Util.getInt("Introduza um número: ", sc, 0, 100);
			attempts++;

			if (guess > randomNumber) System.out.println("O número secreto é menor do que o número introduzido!");
			else if (guess < randomNumber) System.out.println("O número secreto é maior do que o número introduzido!");
		} while (guess != randomNumber);

		System.out.print('\n');
		System.out.println("O número secreto era " + randomNumber + "!");
		System.out.println("Tentativas: " + attempts);
	}
}
