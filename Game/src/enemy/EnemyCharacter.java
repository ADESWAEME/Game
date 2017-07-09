package enemy;

import enemy.EnemyDamager;
import enemy.EnemyHealer;
import enemy.EnemyTank;


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
		
		EnemyDamager eD = new EnemyDamager();
		EnemyHealer eH = new EnemyHealer();
		EnemyTank eT = new EnemyTank();
		
		
		
	switch (str){
	
		case 1:
			order = eD.EnDam();
		
				break;
		case 2:
			order = eH.EnHeal();
				break;
		case 3 :
			order = eT.EnTan();
			
		default :
			order = 1;
			break;
	}
	return order;

	
	
	}
	//method lifePoint
	public int lifePoint(){
		return 0;
		
	};
	
	//method attack
	public int attack(){
		return 0;
		
	};
	
	//method specialPower
	public int specialPower(){
		return 0;
		
	}
	public int getLifePoint() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getAttack() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getSpecialPower() {
		// TODO Auto-generated method stub
		return 0;
	}


}
