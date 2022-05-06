package aula07.exer2;

import java.util.Scanner;
import aula07.Util;

public class Exer2 {
	public static void main(String[] args) {
		int input;
		DateYMD date = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

			input = Util.getInt("Escolha uma operação: ", sc, 0, 4);

			switch (input) {
				case 1:
					int day = Util.getInt("Introduza o dia: ", sc, 1, 31);
					int month = Util.getInt("Introduza o mês: ", sc, 1, 12);
					int year = Util.getInt("Introduza o ano: ", sc);

					date = new DateYMD(day, month, year);
					System.out.println("Data criada: " + date);
					break;

				case 2:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}
					
					System.out.println("Data atual: " + date.toString());
					break;

				case 3:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}

					int daysIn = Util.getInt("Introduza o número de dias: ", sc);
					date.increment(daysIn);
					System.out.println("Data incrementada: " + date);
					break;

				case 4:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}

					int daysDe = Util.getInt("Introduza o número de dias: ", sc);
					date.decrement(daysDe);
					System.out.println("Data decrementada: " + date);
					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);
	}
}