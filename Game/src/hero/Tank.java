package hero;

import enemy.TankEnemyCharacters;

public class Tank extends Character{

	private int lifePoint = 5;
	private int attack = 1;
	private int specialPower = attack + 3;

	
	public int Tan(){
		
		final TankEnemyCharacters enemyCharacter = new TankEnemyCharacters();
		System.out.println("Hero : Tank");
		System.out.println("Life point : " + lifePoint + "\nAttack : " + attack);
		enemyCharacter.tankEnemyCharacters();
		return 0;
	}
	
	@Override
	public int getLifePoint() {
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
