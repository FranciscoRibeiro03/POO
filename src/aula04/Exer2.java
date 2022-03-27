package aula04;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = Util.getString("Introduza uma frase: ", sc);

        System.out.println("A frase tem " + countDigits(frase) + " dígitos.");
        System.out.println("A frase tem " + countSpaces(frase) + " espaços.");
        System.out.println("A frase só contém minúsculas? " + isLowercase(frase));
        System.out.println("Frase sem espaços duplicados: " + removeSubsequentWhitespace(frase));
        System.out.println("A frase é um palíndromo? " + isPalindrome(frase));
    
        sc.close();
    }

    public static int countDigits(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) count++;
        }

        return count;
    }

    public static int countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) count++;
        }

        return count;
    }

    public static boolean isLowercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i))) return false;
        }

        return true;
    }

    public static String removeSubsequentWhitespace(String s) {
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i)) &&
                Character.isWhitespace(newString.charAt(newString.length() - 1)))
                continue;

            newString += s.charAt(i);
        }

        return newString;
    }

    public static boolean isPalindrome(String s) {
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;

            newString += s.charAt(i);
        }

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) != newString.charAt(newString.length() - 1 - i))
                return false;
        }

        return true;
    }
    
}
