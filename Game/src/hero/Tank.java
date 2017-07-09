package hero;

public class Tank extends Character{

	public int Tan(){
		System.out.println("Hero : Tank");
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
		int lifePoint = 5;
		
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
		int specialPower = this.attack() + 3; //(créer une classe méchant et mettre les dommages que peuvent faire les monstres en méthodes)
			return specialPower;
	}
	
	public String getLifePointTan(){
		String lifePointTan = Integer.toString(this.lifePoint());
		return lifePointTan;
		
	}
	
	public String getAttackTan(){
		String attackTan = Integer.toString(this.attack());
		return attackTan;
		
	}
	
	public String getSpecialPowerTan(){
		String specialPowerTan = Integer.toString(this.lifePoint());
		return specialPowerTan;
		
	}
	
}
