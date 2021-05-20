package com.company;

public class Main {

    public static void main(String[] args) {
	Team<CricketPlayer>RCB = new Team<>("Royal Challengers Bangalore");
	CricketPlayer Gayle = new CricketPlayer("Chris Gayle");
	CricketPlayer Virat = new CricketPlayer("Virat Kohli");
	SoccerPalyer Messi = new SoccerPalyer("lIONEL messi");
	BasketBallPalyer Jordan = new BasketBallPalyer("MICHEAL jordon");
	RCB.addPlayer(Gayle);
	RCB.addPlayer(Virat);
	Team<SoccerPalyer> Barcelona = new Team<>("Barcelona");
	Barcelona.addPlayer(Messi);
	Team<BasketBallPalyer> Whirlpool = new Team<>("WhirlPool");
	Whirlpool.addPlayer(Jordan);
	RCB.numberOfPlayers();
	Barcelona.numberOfPlayers();
	Whirlpool.numberOfPlayers();





    }
}
