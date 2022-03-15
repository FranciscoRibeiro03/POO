package aula02;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		int segundos, horas, minutos;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tempo em segundos: ");
		segundos = sc.nextInt();

		horas = segundos / 3600;
		segundos %= 3600;
		minutos = segundos / 60;
		segundos %= 60;
		
		System.out.println("O tempo em horas é " + String.format("%02d:%02d:%02d", horas, minutos, segundos));
		sc.close();
	}
}
