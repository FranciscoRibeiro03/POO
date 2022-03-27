package aula04;

import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = Util.getString("Introduza uma frase: ", sc);
        System.out.println("Acrónimo: " + createAcronym(str));
        sc.close();
    }

    public static String createAcronym(String s) {
        if (s.length() < 3) return s;
        String acronym = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;
            if (Character.isUpperCase(s.charAt(i))) acronym += s.charAt(i);
        }

        return acronym;
    }
    
}
