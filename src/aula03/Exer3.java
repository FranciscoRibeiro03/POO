package aula03;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Util.getInt("Indique um número: ", sc, 0);
		boolean prime = isPrime(n);

		System.out.println(String.format("O número %d %s primo.", n, prime ? "é" : "não é"));

		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n < 2) return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
