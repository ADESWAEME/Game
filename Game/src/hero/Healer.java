package hero;

public class Healer extends Character {


	
	public int Heal(){
		System.out.println("Hero : Healer");
		this.lifePoint();
		System.out.println("Life point : " + this.lifePoint());
		this.attack();
		System.out.println("Attack : " + this.attack());
		System.out.println(" ");
		return 0;
		
		
	}
	@Override
	public int lifePoint() {
		// TODO Auto-generated method stub
		int lifePoint = 4;
		
		return lifePoint;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		int attack = 1;
		return attack;
		
	}
	

//	@Override
	public int specialPower() {
		// TODO Auto-generated method stub
		int specialPower = this.lifePoint() + 2;
		return specialPower;
	}

	public String getLifePointHeal(){
		
		String lifePointHeal = Integer.toString(this.lifePoint());
		return lifePointHeal;
		
	}
	
	public String getAttackHeal(){
		
		String attackHeal = Integer.toString(this.attack());
		return attackHeal;
		
	}
	
	public String getSpecialPowerHeal(){
		
		String specialPowerHeal = Integer.toString(this.specialPower());
		return specialPowerHeal;
		
	}
}
