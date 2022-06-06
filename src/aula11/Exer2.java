package aula11;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class Exer2 {
	public static void main(String[] args) throws IOException {
		ArrayList<Flight> flights = loadFlights();

		String flightsList = generateFlightsList(flights);
		String delaysList = generateDelaysList(flights);
		String arrivalsList = generateArrivalsList(flights);

		generateFile(flightsList, "./aula11/infopublico.txt");
		generateFile(arrivalsList, "./aula11/cidades.txt");

		System.out.println(flightsList);
        System.out.println(delaysList);
        System.out.println(arrivalsList);
	}

	public static ArrayList<Flight> loadFlights() throws IOException {
		Scanner flightsFile = new Scanner(new FileReader("./aula11/voos.txt"));
		ArrayList<Flight> flights = new ArrayList<>();
		flightsFile.nextLine();

		while (flightsFile.hasNextLine()) {
			String[] flight = flightsFile.nextLine().split("\t");
			flights.add(new Flight(flight[0], flight[1], flight[2], flight.length > 3 ? flight[3] : ""));
		}

		return flights;
	}

	public static String generateFlightsList(ArrayList<Flight> flights) {
		String header = String.format("%-7s %-8s %-20s %-21s %-7s %-20s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
		String body = "";

		for (Flight flight : flights) {
			body += flight.toString() + "\n";
		}

		return header + body;
	}

	public static int calculateAverage(ArrayList<Integer> values) {
		int sum = 0;
		for (int value : values) sum += value;
		return sum / values.size();
	}
	
	public static String generateDelaysList(ArrayList<Flight> flights) {
		HashMap<String, ArrayList<Integer>> delays = new HashMap<>();

		for (Flight flight : flights) {
			if (flight.getDelay().equals("")) continue;

			if (delays.containsKey(flight.getCompany())) {
				delays.get(flight.getCompany()).add(flight.getDelaySeconds());
			} else {
				delays.put(flight.getCompany(), new ArrayList<Integer>());
				delays.get(flight.getCompany()).add(flight.getDelaySeconds());
			}
		}

		HashMap<String, Integer> averages = new HashMap<>();

		for (Entry<String, ArrayList<Integer>> entry : delays.entrySet()) {
			averages.put(entry.getKey(), calculateAverage(entry.getValue()));
		}

		Stream<Entry<String, Integer>> sorted = averages.entrySet().stream().sorted((e1, e2) -> e1.getValue() - e2.getValue());

		String header = String.format("%-20s %-7s\n", "Companhia", "Atraso Médio");
		String body = "";

		for (Entry<String, Integer> entry : sorted.toArray(Entry[]::new)) {
			String delay = String.format("%02d:%02d", entry.getValue() / 3600, (entry.getValue() - ((entry.getValue() / 3600) * 3600)) / 60);
			body += String.format("%-20s %-7s\n", entry.getKey(), delay);
		}

		return header + body;
	}

	public static String generateArrivalsList(ArrayList<Flight> flights) {
		HashMap<String, Integer> arrivals = new HashMap<>();

		for (Flight flight : flights) {
			if (arrivals.containsKey(flight.getOrigin())) {
				arrivals.put(flight.getOrigin(), arrivals.get(flight.getOrigin()) + 1);
			} else {
				arrivals.put(flight.getOrigin(), 1);
			}
		}

		Stream<Entry<String, Integer>> sortedArrivals = arrivals.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue());

		String header = String.format("%-20s %-5s\n", "Origem", "Voos");
		String body = "";

		for (Entry<String, Integer> arrival : sortedArrivals.toArray(Entry[]::new)) {
			body += String.format("%-20s %-5d\n", arrival.getKey(), arrival.getValue());
		}

		return header + body;
	}

	public static void generateFile(String data, String path) throws IOException {
		PrintWriter out = new PrintWriter(new File(path));
		out.print(data);
		out.close();
	}

}
