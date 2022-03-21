package aula03;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] main) {
		int month, year, days;

		Scanner sc = new Scanner(System.in);

		month = Util.getInt("Mês: ", sc, 0, 12);
		year = Util.getInt("Ano: ", sc, 0);

		if (month == 2) {
			days = 28;

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				days = 29;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}

		System.out.println("O mês " + month + " tem " + days + " dias.");
		sc.close();
	}
}
