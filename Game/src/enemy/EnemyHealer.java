package enemy;

public class EnemyHealer extends EnemyCharacter{

	public int EnHeal(){
		System.out.println("Enemy : Healer");
		this.lifePoint();
		this.attack();
		return 0;
		
		
	}
	@Override
	public void lifePoint() {
		// TODO Auto-generated method stub
		int lifePoint = 4;
		System.out.println("Life point : " + lifePoint);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		int attack = 1;
		System.out.println("Attack : " + attack);
	}

	

//	@Override
//	public void specialPower() {
//		// TODO Auto-generated method stub
//		int specialPower = this.lifePoint + 2;
//	}
}
