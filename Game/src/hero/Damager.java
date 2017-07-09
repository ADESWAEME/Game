package hero;

public class Damager extends Character {

	private int lifePoint = 3;
	private int attack = 2;
	private int specialPower;
	final Character monstre = new Character();
	private int c;
	
	
	public int Dam(){
		System.out.println("Hero : Damager");
		System.out.println("Life point : " + lifePoint + "\nAttack : " + attack);
		return 0;
	}
	
	@Override
	public int specialPower() {
		specialPower = this.attack + 2;
		return specialPower;	
	}
	
	@Override
	public int getLifePoint() {
		return lifePoint;
	}

	public int setLifePoint(int i){
		return lifePoint = i;
	}

	public void setAttack(int i){
		attack = i;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getSpecialPower() {
		return specialPower();
	}
	
	public int getStart(){
		c = monstre.getStart();
		return c;
	}
}
