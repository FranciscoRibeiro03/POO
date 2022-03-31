package aula04;

import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = Util.getString("Introduza uma frase: ", sc);
        System.out.println("Acrónimo: " + createAcronym(str));
        sc.close();
    }

    public static String createAcronym(String str) {
        String acronym = "";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 3) continue;

            acronym += words[i].charAt(0);
        }

        return acronym.toUpperCase();
    }
    
}
