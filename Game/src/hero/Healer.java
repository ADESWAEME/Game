package hero;

public class Healer extends Character {

	private int lifePoint = 4;
	private int attack = 1;
	private int specialPower;

	
	public int Heal(){
		System.out.println("Hero : Healer");
		System.out.println("Life point : " + lifePoint + "\nAttack : " + attack);
		return 0;
	}
	
	@Override
	public int specialPower() {
		specialPower = this.attack + 3;
		return specialPower;	
	}
	
	@Override
	public int getLifePoint() {
		return lifePoint;
	}

	public void setLifePoint(int i){
		lifePoint = i;
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

}
