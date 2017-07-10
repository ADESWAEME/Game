package enemy;

import enemy.EnemyDamager;
import enemy.EnemyHealer;
import enemy.EnemyTank;
import handle.Handle;

import java.util.Scanner;

public class EnemyCharacter {


	
	public int start2(){
		   
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your enemy :");
		System.out.println("1 : Enemy Damager");
		System.out.println("2 : Enemy Healer");
		System.out.println("3 : Enemy Tank");
		int str = Integer.parseInt(sc.nextLine());
		System.out.println("Your choosen : " + str);
		System.out.println("");
		

		int order;
		int order1;
		
		EnemyDamager eD = new EnemyDamager();
		EnemyHealer eH = new EnemyHealer();
		EnemyTank eT = new EnemyTank();
		
		final Handle handle= new Handle();
		
	switch (str){
	
		case 1:
			order = eD.EnDam();
			order1 = handle.handle();
			
				break;
		case 2:
			order = eH.EnHeal();
			order1 = handle.damAgainstHealer();
			
				break;
		case 3 :
			order = eT.EnTan();
			order1 = handle.damAgainstTank();
			
			
		default :
			order = eD.EnDam();
//			order1 = handle.handle();
			break;
	}
	return order;

	
	
	}

	public int getLifePoint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int setLifePoint(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getAttack() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int setAttack(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public int getSpecialPower() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int setSpecialPower(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
