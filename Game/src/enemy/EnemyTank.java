package enemy;

import java.util.Scanner;

public class EnemyTank extends EnemyCharacter{

	int lifePoint;
	int attack;
	
	public int EnTan(){
		System.out.println("Enemy : Tank");
		this.lvlDamager();
		return 0;
		
	}
	@Override
	public int lifePoint() {
		// TODO Auto-generated method stub
		return lifePoint = 5;
		
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return attack = 1;
		
	}

//	@Override
//	public void specialPower() {
//		// TODO Auto-generated method stub
//		int specialPower = damageReceived; //(créer une classe méchant et mettre les dommages que peuvent faire les monstres en méthodes)
//	}
	
	
	public int lvlDamager(){
		
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
			order = this.lifePoint() -1;
			order1 = this.attack() - 1;
			System.out.println(" Your enemy is : ");
			System.out.println("Tank");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 2:
			order = this.lifePoint() ;
			order1 = this.attack();
			System.out.println(" Your enemy is : ");
			System.out.println("Tank");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 3 :
			order = this.lifePoint() + 4;
			order1 = this.attack() + 2;
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
}
