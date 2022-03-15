package aula02;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		double km1, km2, vel1, vel2, velFinal;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a distância do 1º trajeto: ");
		km1 = sc.nextDouble();
		System.out.print("Insira a velocidade do 1º trajeto: ");
		vel1 = sc.nextDouble();

		System.out.print("Insira a distância do 2º trajeto: ");
		km2 = sc.nextDouble();
		System.out.print("Insira a velocidade do 2º trajeto: ");
		vel2 = sc.nextDouble();

		velFinal = (km1 + km2) / ((km1 / vel1) + (km2 / vel2));

		System.out.println("A velocidade média final é " + velFinal);
		sc.close();
	}
}
