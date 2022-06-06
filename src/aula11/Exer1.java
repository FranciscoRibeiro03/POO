package aula11;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Exer1 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> words = readFile("./aula11/major.txt");
		Map<String, Map<String, Integer>> map = new TreeMap<>();

		for (int i = 0; i < words.size() - 1; i++) {
			String word = words.get(i);
			String nextWord = words.get(i + 1);

			if (map.containsKey(word)) {
				Map<String, Integer> mapWord = map.get(word);
				if (mapWord.containsKey(nextWord)) {
					mapWord.put(nextWord, mapWord.get(nextWord) + 1);
				} else {
					mapWord.put(nextWord, 1);
				}
			} else {
				Map<String, Integer> mapWord = new TreeMap<>();
				mapWord.put(nextWord, 1);
				map.put(word, mapWord);
			}
		}

		for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

	public static ArrayList<String> readFile(String path) throws IOException {
		Scanner input = new Scanner(new FileReader(path));
		input.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

		ArrayList<String> words = new ArrayList<String>();

		while (input.hasNext()) {
			String word = input.next();
			if (word.length() > 2) words.add(word.toLowerCase());
		}
		return words;
	}
}
