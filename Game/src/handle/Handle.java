package handle;


import java.util.Random;
import java.util.Scanner;

import enemy.EnemyDamager;
import hero.Damager;
import hero.Healer;
import hero.Tank;

public class Handle {



	
	public int handle(){
	
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int action;
		
		final Damager dam = new Damager();
		final Healer heal = new Healer();
		final Tank tan = new Tank();
		
		final EnemyDamager enDam = new EnemyDamager();
	
		int lifeDam = Integer.parseInt(dam.getLifePointDam());
		int attackDam = Integer.parseInt(dam.getAttackDam());
		int specialPowerDam = Integer.parseInt(dam.getSpacialPowerDam());
		
		int lifeHeal = Integer.parseInt(heal.getLifePointHeal());
		int attackHeal = Integer.parseInt(heal.getAttackHeal());
		int specialPowerHeal = Integer.parseInt(heal.getSpecialPowerHeal());
		
		int lifeTan = Integer.parseInt(tan.getLifePointTan());
		int attackTan = Integer.parseInt(tan.getAttackTan());
		int specialPowerTan = Integer.parseInt(tan.getSpecialPowerTan());
		
		int lifeEnDam = Integer.parseInt(enDam.getLifePointEnDam());
		int attackEnDam = Integer.parseInt(enDam.getAttackEnDam());
		int specialPowerEnDam = Integer.parseInt(enDam.getSpecialPowerEnDam());
		
		
		if(lifeDam == 0){
			System.out.println("Handle"+ " " + i);
			System.out.println("Game over");
				return i;
		}
		
		while(lifeDam > 0){
			System.out.println(">Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);
			
			switch (battle){
				case 1 : 
					 
					 System.out.println("Life Point enemy : " + lifeEnDam);
					 System.out.print("You attack :");
					 System.out.println( - attackDam);
					 action = lifeEnDam - attackDam;
					 System.out.println(action);
					 System.out.println("");
					 	break;
				case 2 : 
					System.out.println("You heal");
					System.out.println("Life Point :" + lifeDam);
					System.out.println( "Healing +"+ specialPowerDam);
					action = lifeDam + specialPowerDam;
					System.out.println("Life Point : " + action);
					System.out.println("");
				default : 
					action = 1;
			}	
				
			
			
			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + lifeDam);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnDam);
					 action = lifeDam - attackEnDam;
					 System.out.println(action);
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + lifeEnDam);
						System.out.println( "Healing : +" + specialPowerEnDam);
						action = lifeEnDam + specialPowerEnDam;
						System.out.println("Life Point IA :" + action);
		             break;
		        }
			i ++;
			if (lifeDam == 0){
				System.out.println("Game over");
			}
			
			if (lifeEnDam == 0){
				System.out.println("Succeed !");
			}
		}
		
		return i;
//		if(lifeHeal == 0){
//			System.out.println("Handle"+ " " + i);
//			System.out.println("Game over");
//			i++;
//				return i;
//		}
//		
//		while(lifeTan == 0){
//			System.out.println("Handle" + " " + i);
//			System.out.println("Game over");
//			i++;
//				return i;
//		}
//		
//		return i;
//		
//	}

	}
}
