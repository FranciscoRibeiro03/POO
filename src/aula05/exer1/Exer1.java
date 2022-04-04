package aula05.exer1;

import java.util.Scanner;
import aula05.Util;

public class Exer1 {
	public static void main(String[] args) {
		int input;
		Date date = new Date(1, 1, 2000);
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

					date = new Date(day, month, year);
					System.out.println("Data criada: " + date);
					break;

				case 2:
					System.out.println("Data atual: " + date.toString());
					break;

				case 3:
					int daysIn = Util.getInt("Introduza o número de dias: ", sc);
					date.increment(daysIn);
					System.out.println("Data incrementada: " + date);
					break;

				case 4:
					int daysDe = Util.getInt("Introduza o número de dias: ", sc);
					date.decrement(daysDe);
					System.out.println("Data decrementada: " + date);
					break;

				case 0:
					break;
			}
		} while (input != 0);
	}
}