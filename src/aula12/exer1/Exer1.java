package aula12.exer1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("./src/aula12/exer1/text.txt"));
        sc.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

        List<String> words = new ArrayList<String>();

        while (sc.hasNext()) {
            String word = sc.next();
            words.add(word);
        }

        System.out.println("Número Total de Palavras: " + words.size());
        System.out.println("Número de Diferentes Palavras: " + new HashSet<String>(words).size() );

    }
}
