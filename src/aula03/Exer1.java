package aula03;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double notaP = Math.round(Util.getDouble("Indique a nota prática: ", sc, 0, 20) * 10) / 10.0;
		double notaT = Math.round(Util.getDouble("Indique a nota teórica: ", sc, 0, 20) * 10) / 10.0;

		if (notaP < 7 || notaT < 7) {
			System.out.println("66");
		} else {
			double notaFinal = Math.round(0.4 * notaT + 0.6 * notaP);
			System.out.println("A nota final é: " + notaFinal);
		}

		sc.close();
	}
}
