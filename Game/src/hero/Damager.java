package hero;

public class Damager extends Character {

	
	public int Dam(){
		System.out.println("Hero : Damager");
		this.lifePoint();
		this.attack();
		return 0;
		
	}
	@Override
	public void lifePoint() {
		// TODO Auto-generated method stub
		int lifePoint = 3;
		System.out.println("Life point : " + lifePoint);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		int attack = 2;
		System.out.println("Attack : " + attack);
	}

//	@Override
//	public void specialPower() {
//		// TODO Auto-generated method stub
//		int specialPower = damageReceived; //(créer une classe méchant et mettre les dommages que peuvent faire les monstres en méthodes)
//	}

	
}
