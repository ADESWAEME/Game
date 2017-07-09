package handle;


import java.util.Random;
import java.util.Scanner;

import enemy.EnemyCharacter;
import enemy.EnemyDamager;
import enemy.EnemyHealer;
import enemy.EnemyTank;
import hero.Damager;
import hero.Healer;
import hero.Tank;

public class Handle{



	
	public int handle(){
	
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int action = 1;
		int actionIA = 1;

		
		
		final Damager dam = new Damager();
		final Healer heal = new Healer();
		final Tank tan = new Tank();
		
		final EnemyDamager enDam = new EnemyDamager();
		final EnemyTank enTan = new EnemyTank();
		final EnemyHealer enHeal = new EnemyHealer();
	
		int monstreIA = dam.getStart();
		
		int lifeDam = dam.setLifePoint(i);
		int attackDam = dam.getAttack();
		int specialPowerDam = dam.getSpecialPower();
		
		int lifeHeal = heal.setLifePoint(i);
		int attackHeal = heal.getAttack();
		int specialPowerHeal = heal.getSpecialPower();
		
		int lifeTan = tan.setLifePoint(i);
		int attackTan = tan.setAttack(i);
		int specialPowerTan = tan.getSpecialPower();
		
		int lifeEnDam = enDam.setLifePoint(i);
		int attackEnDam = enDam.getAttack();
		int specialPowerEnDam = enDam.getSpecialPower();
		
		int lifeEnTan = enTan.setLifePoint(i);
		int attackEnTan = enTan.setAttack(i);
		int specialPowerEnTan = enTan.getSpecialPower();
		
		int lifeEnHeal = enHeal.setLifePoint(i);
		int attackEnHeal = enHeal.setAttack(i);
		int specialPowerEnHeal = enHeal.getSpecialPower();
		
		

		
		while(monstreIA == 1){
			System.out.println("\n >Handle"+ " " + i + "<");
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
			
			if (actionIA <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (action <= 0){
				System.out.println("Succeed !");
					return 0;
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
					 actionIA = lifeDam - attackEnDam;
					 System.out.println(actionIA);
					
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + lifeEnDam);
						System.out.println( "Healing : +" + specialPowerEnDam);
						actionIA = lifeEnDam + specialPowerEnDam;
						System.out.println("Life Point IA :" + actionIA);
				
		             break;
		             
		            default :
		            	actionIA = 1;
		        }

			i ++;
			
		}
		
//		return i;

	
	
					while(monstreIA == 2){
						
						System.out.println("\n >Handle"+ " " + i + "<");
						System.out.println("");
						System.out.println("Your turn :");
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						int battle = Integer.parseInt(sc.nextLine());
						System.out.println("Your choosen : " + battle);


		
					switch (battle){
						case 1 : 
							 System.out.println("Life Point enemy : " + lifeEnTan);
							 System.out.print("You attack :");
							 System.out.println( - attackDam);
							 action = lifeEnTan - attackDam;
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
								break;
								
						default : 
							action = 1;
					}	
		
				if (actionIA <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (action <= 0){
					System.out.println("Succeed !");
						return 0;
				}

					System.out.println("** Turn of IA **");
					
				       Random coin = new Random();
				        int iA;
				        iA = coin.nextInt(2);
				        switch(iA){
				            case 0 : 
				           	 System.out.println("Life Point hero : " + lifeDam);
							 System.out.print("IA attacks :");
							 System.out.println( - attackEnTan);
							 actionIA = lifeDam - attackEnTan;
							 System.out.println(actionIA);
							
							 	break;
				            case 1 : 
				            	System.out.println("IA heal");
								System.out.println("Life Point IA :" + lifeEnTan);
								System.out.println( "Healing : +" + specialPowerEnTan);
								actionIA = lifeEnTan + specialPowerEnTan;
								System.out.println("Life Point IA :" + actionIA);
						
				             break;
				             
				            default :
				            	actionIA = 1;
				        }
			
					i ++;
					
				}
			

					
					
					while(monstreIA == 3){
						
						System.out.println("\n >Handle"+ " " + i + "<");
						System.out.println("");
						System.out.println("Your turn :");
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						int battle = Integer.parseInt(sc.nextLine());
						System.out.println("Your choosen : " + battle);


		
					switch (battle){
						case 1 : 
							 System.out.println("Life Point enemy : " + lifeEnHeal);
							 System.out.print("You attack :");
							 System.out.println( - attackDam);
							 action = lifeEnHeal - attackDam;
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
								break;
								
						default : 
							action = 1;
					}	
		
				if (actionIA <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (action <= 0){
					System.out.println("Succeed !");
						return 0;
				}

					System.out.println("** Turn of IA **");
					
				       Random coin = new Random();
				        int iA;
				        iA = coin.nextInt(2);
				        switch(iA){
				            case 0 : 
				           	 System.out.println("Life Point hero : " + lifeDam);
							 System.out.print("IA attacks :");
							 System.out.println( - attackEnHeal);
							 actionIA = lifeDam - attackEnHeal;
							 System.out.println(actionIA);
							
							 	break;
				            case 1 : 
				            	System.out.println("IA heal");
								System.out.println("Life Point IA :" + lifeEnHeal);
								System.out.println( "Healing : +" + specialPowerEnHeal);
								actionIA = lifeEnHeal + specialPowerEnTan;
								System.out.println("Life Point IA :" + actionIA);
						
				             break;
				             
				            default :
				            	actionIA = 1;
				        }
			
					i ++;
					
				}
				return i;

}
}
