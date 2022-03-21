package aula03;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		int n;
		boolean prime = false;

		Scanner sc = new Scanner(System.in);

		n = Util.getInt("Indique um número: ", sc, 0);
		prime = isPrime(n);

		if (prime) {
			System.out.println("O número " + n + " é primo.");
		} else {
			System.out.println("O número " + n + " não é primo.");
		}

		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
