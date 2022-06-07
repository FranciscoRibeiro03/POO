package aula10.exer04;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Exer4 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> words = readFile("./aula10/exer04/text.txt");
		ArrayList<String> wordsWith2Chars = new ArrayList<>();
		ArrayList<String> remove = new ArrayList<>();

		for (String word : words) {
			if (word.length() == 2) wordsWith2Chars.add(word);
			if (word.endsWith("s")) System.out.println(word);
		}

		for (String word : words) {
			if (!isAlpha(word)) remove.add(word);
		}

		words.removeAll(remove);
	}

	public static ArrayList<String> readFile(String path) throws IOException {
		Scanner input = new Scanner(new FileReader(path));
		ArrayList<String> words = new ArrayList<String>();
		while (input.hasNext()) {
			String word = input.next();
			if (word.length() > 2) words.add(word);
		}
		return words;
	}

	public static boolean isAlpha(String word) {
		return word.matches("[a-zA-Z]+");
	}
	
}
