package hero;

public class Tank extends Character{

	public int Tan(){
		System.out.println("Hero : Tank");
		this.lifePoint();
		this.attack();
		return 0;
		
	}
	@Override
	public void lifePoint() {
		// TODO Auto-generated method stub
		int lifePoint = 5;
		System.out.println("Life point : " + lifePoint);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		int attack = 1;
		System.out.println("Attack : " + attack);
		System.out.println(" ");
	}

//	@Override
//	public void specialPower() {
//		// TODO Auto-generated method stub
//		int specialPower = damageReceived; //(cr�er une classe m�chant et mettre les dommages que peuvent faire les monstres en m�thodes)
//	}
}
