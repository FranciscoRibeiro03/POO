package aula03;

import java.util.Random;

public class Exer8 {
	public static void main(String[] args) {
		final int students = 16;
		double[][] grades = new double[students][3];

		System.out.printf("%6s %6s %6s\n", "NotaT", "NotaP", "Pauta");

		for (int i = 0; i < students; i++) {
			double gradeT, gradeP, finalGrade;

			gradeT = Math.round(new Random().nextDouble() * 20 * 10) / 10.0;
			gradeP = Math.round(new Random().nextDouble() * 20 * 10) / 10.0;

			if (gradeP < 7 || gradeT < 7)
				finalGrade = 66;
			else
				finalGrade = Math.round(0.4 * gradeT + 0.6 * gradeP);

			grades[i][0] = gradeT;
			grades[i][1] = gradeP;
			grades[i][2] = (int) finalGrade;

			System.out.printf("%6.1f %6.1f %6.0f\n", gradeT, gradeP, finalGrade);
		}
	}
}
