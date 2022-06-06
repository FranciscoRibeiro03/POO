package aula11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Flight {
	private String hour;
	private String flight;
	private String company;
	private String origin;
	private String delay;
	private String obs;

	private static HashMap<String, String> companies = new HashMap<>();

	public Flight(String hour, String flight, String origin, String delay) throws IOException {
		this.hour = hour;
		this.flight = flight;
		this.company = getCompanies().get(this.flight.substring(0, 2));
		this.origin = origin;
		this.delay = delay;

		if (delay.equals("")) this.obs = "";
		else this.obs = "Previsto: " + this.getPrediction();
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return String.format("%-7s %-8s %-20s %-21s %-7s %-20s", this.hour, this.flight, this.company, this.origin, this.delay, this.obs);
	}

	public int getDelaySeconds() {
		return Integer.parseInt(this.getDelay().substring(0, 2)) * 3600 + Integer.parseInt(this.getDelay().substring(3, 5)) * 60; 
	}

	private HashMap<String, String> getCompanies() throws IOException {
		if (!companies.isEmpty()) return companies;

		Scanner input = new Scanner(new File("./aula11/companhias.txt"));
		input.nextLine();

		while (input.hasNextLine()) {
			String[] line = input.nextLine().split("\t");
			companies.put(line[0], line[1]);
		}

		return companies;
	}

	private String getPrediction() {
		int hours = Integer.parseInt(this.hour.substring(0, 2)) + Integer.parseInt(this.delay.substring(0, 2));
		int minutes = Integer.parseInt(this.hour.substring(3, 5)) + Integer.parseInt(this.delay.substring(3, 5));

		if (minutes >= 60) {
			hours += 1;
			minutes -= 60;
		}

		if (hours >= 24) hours -= 24;

		return String.format("%02d:%02d", hours, minutes);
	}
	
}
