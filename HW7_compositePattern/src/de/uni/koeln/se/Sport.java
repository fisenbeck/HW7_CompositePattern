package de.uni.koeln.se;

public class Sport implements OlympicsTeams {
	private String name;
	private int numAthletes;
	private int numGoldMedals;
	
	public Sport(String name, int numAthletes, int numGoldMedals) {
		this.name = name;
		this.numAthletes = numAthletes;
		this.numGoldMedals = numGoldMedals;
	}
}
