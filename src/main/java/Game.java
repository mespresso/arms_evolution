package main.java;

public class Game {
	Player attactPlayer;
	Player beAttactedPlayer;
	Player tempPlayer;
	
	public Game(Player player1,Player player2){
		attactPlayer = player1;
		beAttactedPlayer = player2;
	}
	public String play(){
		int gameOverTag = 1;
		while(gameOverTag>0){
			gameOverTag=attactPlayer.attact(beAttactedPlayer);
			changeAttactPosition();
		}
		return attactPlayer.getName()+"被打败了";
	}
	public void changeAttactPosition(){
		tempPlayer = attactPlayer;
		attactPlayer = beAttactedPlayer;
		beAttactedPlayer = tempPlayer;
	}
}
