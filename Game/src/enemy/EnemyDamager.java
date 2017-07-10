package enemy;
import java.util.Scanner;



public class EnemyDamager extends EnemyCharacter {
	
	private int lifePoint = 3;
	private int attack = 2;
	private int specialPower = attack + 2;
	private int order;
	private int order1;

	
	public int EnDam(){
		
		System.out.println("Enemy : Damager");
		
		return 0;
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
				
	switch (str){
	
		case 1:
			order = lifePoint -1;
			order1 = attack - 1;
			System.out.println(" Your enemy is : ");
			System.out.println("Damager");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 2:
			order = lifePoint ;
			order1 = attack;
			System.out.println(" Your enemy is : ");
			System.out.println("Damager");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
				break;
		case 3 :
			order = lifePoint + 4;
			order1 = attack + 2;
			System.out.println(" Your enemy is : ");
			System.out.println("Damager");
			System.out.println("Life point : " + order);
			System.out.println("Attack : " + order1);
			System.out.println("");
			System.out.println("..");
				break;
		default :
			order = lifePoint ;
			order1 = attack;
			break;
	}

	return str;
	
	}
	
	@Override
	public int getLifePoint() {
		this.lvlDamager();
		return order;
	}
	@Override
	public int setLifePoint(int i){
		return order = i;
	}

	@Override
	public int setAttack(int i){
		return order1 = i;
	}

	@Override
	public int getAttack() {
		return order1;
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
