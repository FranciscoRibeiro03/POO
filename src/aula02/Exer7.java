package aula02;

import java.util.Scanner;

public class Exer7 {
	public static void main(String[] args) {
		double[] p1 = new double[2];
		double[] p2 = new double[2];

		double distancia = 0;
		Scanner sc = new Scanner(System.in);

		p1[0] = getDouble("Insira o valor de x do 1º ponto: ", sc);
		p1[1] = getDouble("Insira o valor de y do 1º ponto: ", sc);

		p2[0] = getDouble("Insira o valor de x do 2º ponto: ", sc);
		p2[1] = getDouble("Insira o valor de y do 2º ponto: ", sc);

		distancia = Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
		
		System.out.println("A distância entre os pontos é " + distancia);
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
