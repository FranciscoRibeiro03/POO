package aula02;

import java.util.Scanner;

/*
Escreva um programa em Java que represente dois pontos, p1 e p2, pedindo que o utilizador 
introduza as suas coordenadas reais x e y. Calcule e imprima a distância entre os pontos. 
Sugestão: para calcular a raiz quadrada use a função Math.sqrt
*/

public class Exer7 {
	public static void main(String[] args) {
		double[] p1 = new double[2];
		double[] p2 = new double[2];

		double distancia = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor de x do 1º ponto: ");
		p1[0] = sc.nextDouble();
		System.out.print("Insira o valor de y do 1º ponto: ");
		p1[1] = sc.nextDouble();

		System.out.print("Insira o valor de x do 2º ponto: ");
		p2[0] = sc.nextDouble();
		System.out.print("Insira o valor de y do 2º ponto: ");
		p2[1] = sc.nextDouble();

		distancia = Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
		
		System.out.println("A distância entre os pontos é " + distancia);
		sc.close();
	}
}
