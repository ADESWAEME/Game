package enemy;
import java.util.Scanner;


public class EnemyDamager extends EnemyCharacter {
	
	private int lifePoint = 3;
	private int attack =2;
	private int specialPower;

	
	public int EnDam(){
		System.out.println("Enemy : Damager");
		System.out.println("Life point : " + lifePoint + "\nAttack : " + attack);
		return 0;
	}
	
	@Override
	public int specialPower() {
		specialPower = this.attack + 2;
		return specialPower;	
	}
	
	@Override
	public int getLifePoint() {
		return lifePoint;
	}

	public int setLifePoint(int i){
		return lifePoint = i;
	}

	public void setAttack(int i){
		attack = i;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getSpecialPower() {
		return specialPower();
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

}
