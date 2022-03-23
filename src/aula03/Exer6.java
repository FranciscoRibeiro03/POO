package aula03;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);

		int days = 31;

		int month = Util.getInt("Mês: ", sc, 0, 12);
		int year = Util.getInt("Ano: ", sc, 0);

		if (month == 2) {

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				days = 29;

			else days = 28;

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}

		System.out.println("O mês " + month + " tem " + days + " dias.");
		sc.close();
	}
}
