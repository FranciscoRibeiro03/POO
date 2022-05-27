package aula10.exer03;

import java.util.ArrayList;
import java.util.HashMap;

public class Exer3 {
	public static void main(String[] args) {
		System.out.println(charactersPosition("Hello World"));
		System.out.println(charactersPosition("Alguma frase interessante"));
	}

	public static HashMap<String, ArrayList<Integer>> charactersPosition(String text) {
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		
		for (int i = 0; i < text.length(); i++) {
			String character = text.substring(i, i + 1);
			
			if (map.containsKey(character)) {
				map.get(character).add(i);
			} else {
				map.put(character, new ArrayList<Integer>());
				map.get(character).add(i);
			}
		}
		
		return map;
	}
}
