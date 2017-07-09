package enemy;
import java.util.Scanner;

import handle.Handle;
public class EnemyDamager extends EnemyCharacter {

	int lifePoint;
	int attack;
	
	final Handle h = new Handle();

	public int EnDam(){
		System.out.println("Enemy : Damager");
		System.out.println("");
		this.lvlDamager();
		return 0;
		
		
	}
	@Override
	public int lifePoint() {
		return lifePoint = 3;
		
	}

	@Override
	public int attack() {
		return attack = 2;
		
	}

	@Override
	public int specialPower() {
		// TODO Auto-generated method stub
		int specialPower = 1; //(créer une classe méchant et mettre les dommages que peuvent faire les monstres en méthodes)
			
		return specialPower;
	}

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
			System.out.println("Damager");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 2:
			order = this.lifePoint() ;
			order1 = this.attack();
			System.out.println(" Your enemy is : ");
			System.out.println("Damager");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 3 :
			order = this.lifePoint() + 4;
			order1 = this.attack() + 2;
			System.out.println(" Your enemy is : ");
			System.out.println("Damager");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		default :
			order = 1;
			break;
	}
	return str;
	
	}
	
	public String getLifePointEnDam(){
		String lifePointEnDam = Integer.toString(this.lifePoint());
		return lifePointEnDam;
		
	}
	
	public String getAttackEnDam(){
		String attackEnDam = Integer.toString(this.attack());
		return attackEnDam;
		
	}
	
	public String getSpecialPowerEnDam(){
		String specialPowerEnDam = Integer.toString(this.specialPower());
		return specialPowerEnDam;
		
	}
	
	public int setLifePointEnDam(){
		this.lifePoint();
		return lifePoint();
	}
}
