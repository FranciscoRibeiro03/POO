package aula05.exer2;

import java.util.Scanner;
import aula05.Util;

public class Exer2 {
	public static void main(String[] args) {
		int input;
		Calendar calendar = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Calendar operations:");
			System.out.println("1 - create new calendar");
			System.out.println("2 - print calendar month");
			System.out.println("3 - print calendar");
			System.out.println("0 - exit");

			input = Util.getInt("Escolha uma operação: ", sc, 0, 3);

			switch (input) {
				case 1:
					int year = Util.getInt("Introduza o ano: ", sc);
					int weekDay = Util.getInt("Introduza o dia em que começa o ano (1-Domingo, 7-Sábado): ", sc, 1, 7);

					calendar = new Calendar(year, weekDay);
					System.out.println("Calendário criado: " + year);
					break;

				case 2:
					if (calendar == null) {
						System.out.println("Calendário não criado.");
						break;
					}

					int month = Util.getInt("Introduza o mês: ", sc, 1, 12);
					calendar.printMonth(month);
					break;

				case 3:
					if (calendar == null) {
						System.out.println("Calendário não criado.");
						break;
					}

					calendar.toString();
					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);
	}
}
