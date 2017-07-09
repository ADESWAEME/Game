package hero;

public class Damager extends Character {

	
	public int Dam(){
		System.out.println("Hero : Damager");
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
		int lifePoint = 3;
		//System.out.println("Life point : " + lifePoint);
		return lifePoint;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		int attack = 2;
//		System.out.println("Attack : " + attack);
//		System.out.println(" ");
		return attack;
	}

	@Override
	public int specialPower() {
		// TODO Auto-generated method stub
		int specialPower = 1 ; //(créer une classe méchant et mettre les dommages que peuvent faire les monstres en méthodes)
		return specialPower ;
	}

	public String getLifePointDam(){
		//System.out.println("PVD Damager");
		String lifePointDam = Integer.toString(this.lifePoint());
		return lifePointDam;
		
	}
	
	public String getAttackDam(){
		//System.out.println("PVD Damager");
		String attackDam = Integer.toString(this.attack());
		return attackDam;
		
	}
	
	public String getSpacialPowerDam(){
		//System.out.println("PVD Damager");
		String specialPowerDam = Integer.toString(this.specialPower());
		return specialPowerDam;
		
	}
}
