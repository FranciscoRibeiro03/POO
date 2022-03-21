package aula03;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		double gradeT, gradeP, finalGrade;
		Scanner sc = new Scanner(System.in);

		gradeP = Math.round(Util.getDouble("Indique a nota prática: ", sc, 0, 20) * 10) / 10.0;
		gradeT = Math.round(Util.getDouble("Indique a nota teórica: ", sc, 0, 20) * 10) / 10.0;

		if (gradeP < 7 || gradeT < 7) {
			System.out.println("66");
		} else {
			finalGrade = Math.round(0.4 * gradeT + 0.6 * gradeP);
			System.out.println("A nota final é: " + finalGrade);
		}

		sc.close();
	}
}
