package aula02;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		double mass, tempI, tempF, energy;
		Scanner sc = new Scanner(System.in);

		mass = getDouble("Insira a quantidade de água (kg): ", sc);
		tempI = getDouble("Insira a temperatura inicial (ºC): ", sc);
		tempF = getDouble("Insira a temperatura final (ºC): ", sc);

		energy = mass * (tempF - tempI) * 4184;

		System.out.println("A energia necessária para a aquecer a água é " + energy + " J");
		sc.close();
	}

	public static double getDouble(String mensagem, Scanner sc) {
		double r = 0;
		while (true) {
			System.out.print(mensagem);
			if (sc.hasNextDouble()){
				r = sc.nextDouble();
				break;
			} else {
				System.out.println("Tens de introduzir um número!");
				sc.next();
			}
		}
		return r;
	}
}
