package main.java;

public class Player {
    private String name;
	private int blood;
    private int damage;
    /*
     * @param name
     * @param blood
     * @param damage
     * */
    public Player(String name,int blood,int damage){
    	this.name = name;
    	this.blood = blood;
    	this.damage = damage;
    }
    
    
    public int attact(Player beAttactedPlayer){
    	beAttactedPlayer.setBlood(beAttactedPlayer.blood-this.damage);
    	return beAttactedPlayer.blood;
    }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getBlood() {
		return blood;
	}



	public void setBlood(int blood) {
		this.blood = blood;
	}
}
