package enemy;

import java.util.Scanner;

public class EnemyTank extends EnemyCharacter{

	private int lifePoint = 5;
	private int attack = 1;
	private int specialPower = attack + 3;

	
	public int EnTan(){
		System.out.println("Enemy : Tank");
		//System.out.println("Life point : " + lifePoint + "\nAttack : " + attack);
		this.lvlEnTank();
		return 0;
	}
	
	
	public int lvlEnTank(){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	System.out.println("Choose lvl of your Enemy :");
	System.out.println("1 : Easy");
	System.out.println("2 : Way");
	System.out.println("3 : Difficult");
	int str = Integer.parseInt(sc.nextLine());
	System.out.println("Your choosen : " + str);
	System.out.println("");
		
		int order;
		int order1;
		
	switch (str){
	
		case 1:
			order = lifePoint -1;
			order1 = attack - 1;
			System.out.println(" Your enemy is : ");
			System.out.println("Tank");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 2:
			order = lifePoint ;
			order1 = attack;
			System.out.println(" Your enemy is : ");
			System.out.println("Tank");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 3 :
			order = lifePoint + 4;
			order1 = attack + 2;
			System.out.println(" Your enemy is : ");
			System.out.println("Tank");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		default :
			order = 1;
			break;
	}
	return order;
	
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
	
	@Override
	public int setSpecialPower(int i) {
		return specialPower = i;
	}
}
