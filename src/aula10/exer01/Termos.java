package aula10.exer01;

import java.util.Map;
import java.util.HashMap;

public class Termos {
	private Map<String, String> map;
	
	public Termos() {
		map = new HashMap<String, String>();
	}

	public void add(String termo, String significado) {
		map.put(termo, significado);
	}

	public void replace(String termo, String significado) {
		map.replace(termo, significado);
	}

	public void remove(String termo) {
		map.remove(termo);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			sb.append(entry.getKey() + " - " + entry.getValue() + "\n");
		}
		
		for (String key : map.keySet()) {
			sb.append(key + "\n");
		}

		for (String value : map.values()) {
			sb.append(value + "\n");
		}

		return sb.toString().substring(0, sb.length() - 1);
	}

}
