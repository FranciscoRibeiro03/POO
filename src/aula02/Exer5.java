package aula02;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		double km1, km2, vel1, vel2, velFinal;
		Scanner sc = new Scanner(System.in);

		km1 = getDouble("Insira a distância do 1º trajeto: ", sc);
		vel1 = getDouble("Insira a velocidade do 1º trajeto: ", sc);

		km2 = getDouble("Insira a distância do 2º trajeto: ", sc);
		vel2 = getDouble("Insira a velocidade do 2º trajeto: ", sc);

		velFinal = (km1 + km2) / ((km1 / vel1) + (km2 / vel2));

		System.out.println("A velocidade média final é " + velFinal);
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
