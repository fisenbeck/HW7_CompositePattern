package de.uni.koeln.se;

public class Client {

	
	public static void main(String[]args) {
		Component teakwondo = new Sport("teakwondo", 4, 1);
		Component waterpolo = new Sport("Waterpolo", 4, 1);
		Component artisticGymnastics = new Sport("Artistic Gymnastics", 4, 1);
		Component shooting = new Sport("Shooting", 4, 1);
		Component cycling = new Sport("Cycling", 4, 1);
		Component tennis = new Sport("Tennis", 4, 1);
		Component tableTennis = new Sport("Table Tennis", 4, 1);
		Component footbal = new Sport("Footbal", 18, 0);
		
		Component womenTeam = new MenWomenTeams("Women's Team" , 6, 2);
	
		
	}
}
