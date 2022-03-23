package aula03;

import java.util.Scanner;
import java.util.Random;

public class Exer7 {

	public static void main(String[] args) {
		int randomNumber = new Random().nextInt(100) + 1;
		
		Scanner sc = new Scanner(System.in);

		int attempts = 0;
		String answer;

		do {

			int guess = Util.getInt("Introduza um número entre 0 e 100: ", sc, 0, 100);
			attempts++;

			if (guess == randomNumber) break;
			else if (guess > randomNumber) System.out.println("O número secreto é menor do que o número introduzido!");
			else System.out.println("O número secreto é maior do que o número introduzido!");

			answer = Util.getString("Deseja continuar? Escreva (S)im para continuar, ou outra coisa para sair: ", sc).toLowerCase();

		} while (answer.equals("s") || answer.equals("sim"));

		System.out.println("O número secreto era " + randomNumber + "!");
		System.out.println("Tentativas: " + attempts);

		sc.close();
	}
}
