package walnoot.rtsgame.map.entities.players;

public class Sword extends Weapon {
	int damage;
	private static int ID = 501;

	public Sword(Soldier owner, int damage) {
		super(owner, ID);
		LOAD_TIME = 30;
		this.damage = damage;
	}

	public void activate() {
		owner.target.damage(damage);
	}

}
