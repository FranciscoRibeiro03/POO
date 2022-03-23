package aula03;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Util.getInt("Indique um número inicial para a contagem decrescente: ", sc, 0);

		for (int i = n; i >= 0; i--) System.out.println(i);

		sc.close();
	}
}
