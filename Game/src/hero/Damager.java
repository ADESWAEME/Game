package hero;

public class Damager extends Character {

	private int lifePoint = 3;
	private int attack = 2;
	private int specialPower = attack + 2;

	
	
	public int Dam(){
		System.out.println("Hero : Damager");
		System.out.println("Life point : " + lifePoint + "\nAttack : " + attack);
		return 0;
	}
	
//	@Override
//	public int specialPower() {
//		specialPower = this.attack + 2;
//		return specialPower;	
//	}
	
	@Override
	public int getLifePoint() {
		System.out.println("PDV hero : " + lifePoint);
		return lifePoint;
	}

	public int setLifePoint(int i){
		return lifePoint = i;
	}

	public int setAttack(int i){
		return attack = i;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getSpecialPower() {
		return specialPower;
	}
	

}
