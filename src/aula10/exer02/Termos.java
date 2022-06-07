package aula10.exer02;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Random;

public class Termos {
	private SortedMap<String, ArrayList<String>> map;
	
	public Termos() {
		map = new TreeMap<String, ArrayList<String>>();
	}

	public void add(String termo, String ...significados) {
		map.put(termo, new ArrayList<String>(Arrays.asList(significados)));
	}

	public void addSignificado(String termo, String significado) {
		if (map.containsKey(termo)) {
			map.get(termo).add(significado);
		} else {
			map.put(termo, new ArrayList<String>(Arrays.asList(significado)));
		}
	}

	public void removeSignificado(String termo, String significado) {
		if (map.containsKey(termo)) {
			map.get(termo).remove(significado);
		}
	}

	public String randomSignificado(String termo) {
		if (map.containsKey(termo)) {
			ArrayList<String> significados = map.get(termo);
			Random random = new Random();
			return significados.get(random.nextInt(significados.size()));
		} else {
			return null;
		}
	}

	public void replace(String termo, String ...significados) {
		map.replace(termo, new ArrayList<String>(Arrays.asList(significados)));
	}

	public void remove(String termo) {
		map.remove(termo);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			sb.append(entry.getKey() + " - " + entry.getValue() + "\n");
		}
		
		for (String key : map.keySet()) {
			sb.append(key + "\n");
		}

		for (ArrayList<String> value : map.values()) {
			sb.append(value + "\n");
		}

		return sb.toString().substring(0, sb.length() - 1);
	}
}
