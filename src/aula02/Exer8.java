package aula02;

import java.util.Scanner;

public class Exer8 {
	public static void main(String[] args) {
		double catetoA, catetoB, hipotenusa, angulo;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do cateto A: ");
		catetoA = sc.nextDouble();
		System.out.print("Insira o valor do cateto B: ");
		catetoB = sc.nextDouble();

		hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		angulo = Math.toDegrees(Math.atan(catetoB / catetoA));

		System.out.println("A hipotenusa é " + hipotenusa);
		System.out.println("O ângulo é " + angulo);

		sc.close();
	}
}
