package aula02;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		double mass, tempI, tempF, energy;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a quantidade de água (kg): ");
		mass = sc.nextDouble();
		System.out.print("Insira a temperatura inicial (ºC): ");
		tempI = sc.nextDouble();
		System.out.print("Insira a temperatura final (ºC): ");
		tempF = sc.nextDouble();

		energy = mass * (tempF - tempI) * 4184;

		System.out.println("A energia necessária para a aquecer a água é " + energy + " J");
		sc.close();
	}
}
