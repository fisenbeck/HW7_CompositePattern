package de.uni.koeln.se;

public class ContinentTeams implements OlympicsTeams {
	private String name;
	private int numAthletes;
	private int numGoldMedals;
	
	public ContinentTeams(String name, int numAthletes, int numGoldMedals) {
		this.name = name;
		this.numAthletes = numAthletes;
		this.numGoldMedals = numGoldMedals;
	}
}
