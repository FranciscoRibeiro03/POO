package aula02;

import java.util.Scanner;

public class Exer8 {
	public static void main(String[] args) {
		double catetoA, catetoB, hipotenusa, angulo;
		Scanner sc = new Scanner(System.in);

		catetoA = getDouble("Insira o valor do cateto A: ", sc);
		catetoB = getDouble("Insira o valor do cateto B: ", sc);

		hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		angulo = Math.toDegrees(Math.atan(catetoB / catetoA));

		System.out.println("A hipotenusa é " + hipotenusa);
		System.out.println("O ângulo é " + angulo);

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
