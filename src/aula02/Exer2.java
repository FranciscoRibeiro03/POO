package aula02;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		double celcius, fahrenheit;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira temperatura em ºC: ");
		celcius = sc.nextDouble();

		fahrenheit = 1.8 * celcius + 32;

		System.out.println("A temperatura em ºF é " + fahrenheit);
		sc.close();
	}
}
