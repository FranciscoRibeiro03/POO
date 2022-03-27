package aula04;

import java.util.Scanner;

public class Exer1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = Util.getString("Introduza uma string: ", sc);
        
        System.out.println("Minúsculas: " + str.toLowerCase());
        System.out.println("Último caracter: " + str.charAt(str.length() - 1));
        System.out.println("Três primeiros caracteres: " + str.substring(0, 3));

        System.out.println("Tamanho: " + str.length());
        System.out.println("Contém 'a': " + str.contains("a"));
        System.out.println("Última ocorrência de 'a': " + str.lastIndexOf("a"));

        sc.close();
    }

}
