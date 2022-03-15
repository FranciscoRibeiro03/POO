package aula02;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		double montante, taxa, numMonths = 3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o montante investido: ");
		montante = sc.nextDouble();
		System.out.print("Insira a taxa de juro mensal: ");
		taxa = sc.nextDouble();

		for (int i = 1; i <= numMonths; i++) {
			montante += montante * (taxa / 100);
		}

		System.out.println("O montante final é " + montante);
		sc.close();
	}
}
