package aula02;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		double km = -1;
		Scanner sc = new Scanner(System.in);

		while (km < 0) {
			System.out.print("Introduz um valor em km, superior a 0: ");
			if (sc.hasNextDouble()) 
				km = sc.nextDouble();
			else {
				System.out.println("Tens de introduzir um número!");
				sc.next();
			}
		}

		double miles = km / 1.609;

		System.out.println("A distância em milhas é " + miles);
		sc.close();
	}
}
