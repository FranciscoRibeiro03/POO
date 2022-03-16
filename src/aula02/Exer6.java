package aula02;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		int segundos, horas, minutos;
		Scanner sc = new Scanner(System.in);

		segundos = getInt("Insira o tempo em segundos: ", sc);

		horas = segundos / 3600;
		segundos %= 3600;
		minutos = segundos / 60;
		segundos %= 60;
		
		System.out.printf("O tempo em horas é %02d:%02d:%02d", horas, minutos, segundos);
		sc.close();
	}

	public static int getInt(String mensagem, Scanner sc) {
		int r = 0;
		while (true) {
			System.out.print(mensagem);
			if (sc.hasNextInt()){
				r = sc.nextInt();
				break;
			} else {
				System.out.println("Tens de introduzir um número inteiro!");
				sc.next();
			}
		}
		return r;
	}
}
