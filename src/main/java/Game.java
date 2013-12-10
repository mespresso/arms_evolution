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
		while(judgeGameNotOver()){
			attactPlayer.attact(beAttactedPlayer);
			showSituation();
			changeAttactPosition();
		}
		return attactPlayer.getName()+"被打败了";
	}
	public void changeAttactPosition(){
		tempPlayer = attactPlayer;
		attactPlayer = beAttactedPlayer;
		beAttactedPlayer = tempPlayer;
	}
	public void showSituation(){
		System.out.print(attactPlayer.getName()+"攻击了"+beAttactedPlayer.getName()+",");
		System.out.print(beAttactedPlayer.getName()+"受到了"+attactPlayer.getDamage()+"点伤害,");
		System.out.println(beAttactedPlayer.getName()+"剩余生命"+beAttactedPlayer.getBlood());
		if(!judgeGameNotOver()){
			System.out.print(beAttactedPlayer.getName()+"被打败了");
		}
	}
	private boolean judgeGameNotOver(){
		return attactPlayer.getBlood()>0&&beAttactedPlayer.getBlood()>0;
	}
}
