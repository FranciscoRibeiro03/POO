package aula02;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		double celcius = -300;
		Scanner sc = new Scanner(System.in);

		while (celcius < -272.15) {
			System.out.print("Introduz a temperatura em ºC: ");
			if (sc.hasNextDouble()) {
				celcius = sc.nextDouble();
				if (celcius < -272.15) System.out.println("A temperatura nunca pode ser inferior a -272.15 ºC!");
			} else {
				System.out.println("Tens de introduzir um número!");
				sc.next();
			}
		}

		double fahrenheit = 1.8 * celcius + 32;

		System.out.println("A temperatura em ºF é " + fahrenheit);
		sc.close();
	}
}
