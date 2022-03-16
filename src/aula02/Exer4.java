package aula02;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		double montante, taxa, numMonths = 3;
		Scanner sc = new Scanner(System.in);

		montante = getDouble("Insira o montante investido: ", sc);
		taxa = getDouble("Insira a taxa de juro mensal: ", sc);

		for (int i = 1; i <= numMonths; i++) {
			montante += montante * (taxa / 100);
		}

		System.out.println("O montante final é " + montante);
		sc.close();
	}

	public static double getDouble(String mensagem, Scanner sc) {
		double r = 0;
		while (true) {
			System.out.print(mensagem);
			if (sc.hasNextDouble()){
				r = sc.nextDouble();
				break;
			} else {
				System.out.println("Tens de introduzir um número!");
				sc.next();
			}
		}
		return r;
	}
}
