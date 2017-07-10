package handle;


import java.util.Random;
import java.util.Scanner;

import enemy.EnemyDamager;
import enemy.EnemyHealer;
import enemy.EnemyTank;
import hero.Damager;
import hero.Healer;
import hero.Tank;

public class Handle{


	
	
	public int handle(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
	//	int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Damager dam = new Damager();
		final EnemyDamager enDam = new EnemyDamager();
		
		int lifeDam = dam.getLifePoint();
		int setLifeDam = dam.setLifePoint(lifeDam);
		int attackDam = dam.getAttack();
		int setAttackDam = dam.setAttack(attackDam);
		int specialPowerDam = dam.getSpecialPower();
	//	int setSpecialPowerDam = dam.setSpecialPower(specialPowerDam);
		
		int lifeEnDam = enDam.getLifePoint();
		int setLifeEnDam = enDam.setLifePoint(lifeEnDam);
		int attackEnDam = enDam.getAttack();
	//	int setAttackEnDam = enDam.setAttack(attackEnDam);
		int specialPowerEnDam = enDam.getSpecialPower();
	//	int setSpecialPowerEnDam = enDam.setSpecialPower(specialPowerEnDam);
		

	 	
		while(lifeEnDam > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeDam);
			System.out.println("Life IA : " + setLifeEnDam);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);


			
			switch (battle){
				case 1 : 
					 
					 System.out.println("Life Point enemy : " + setLifeEnDam);
					 System.out.print("You attack :");
					 System.out.println( - attackDam);
					 actionLife = setLifeEnDam - attackDam;
					 System.out.println("Life IA : " + actionLife);
					 System.out.println("");
					 setLifeEnDam = actionLife;
					
					 	break;
				case 2 : 
					System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
					System.out.println("You become strong");
					System.out.println( "+ attack :  "+ specialPowerDam);
					actionAttack = setAttackDam + specialPowerDam;
					System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + actionAttack);
					System.out.println("");
					setAttackDam = actionAttack;
						break;
				
				default : 
					battle = 1;
					break;
			}	
			
			if (actionIALife <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (actionLife <= 0){
				System.out.println("Succeed !");
					return 0;
			}

			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + setLifeDam);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnDam);
					 actionIALife = setLifeDam - attackEnDam;
					 System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeDam = actionIALife;
					 setLifeEnDam = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + setLifeEnDam);
						System.out.println( "Healing : +" + specialPowerEnDam);
						actionIALife = setLifeEnDam + specialPowerEnDam;
						System.out.println("Life Point IA :" + actionIALife);
						 System.out.println(" ");
						 System.out.println("Life Hero : " + actionLife);
						 System.out.println("Life IA : " + actionIALife);
						 System.out.println(" ");
						 setLifeDam = actionLife;
						 setLifeEnDam = actionIALife;
				
		             break;
		             
		            default :
		            	iA = 1;
		            	break;
		        }
				if (actionIALife <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (actionLife <= 0){
					System.out.println("Succeed !");
						return 0;
				}
			i ++;
			
		}
		return i;
		}	
	
	public int damAgainstHealer(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
	//	int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Damager dam = new Damager();
		final EnemyHealer enHeal = new EnemyHealer();
		
		int lifeDam = dam.getLifePoint();
		int setLifeDam = dam.setLifePoint(lifeDam);
		int attackDam = dam.getAttack();
		int setAttackDam = dam.setAttack(attackDam);
		int specialPowerDam = dam.getSpecialPower();
	//	int setSpecialPowerDam = dam.setSpecialPower(specialPowerDam);
		
		int lifeEnHeal = enHeal.getLifePoint();
		int setLifeEnHeal = enHeal.setLifePoint(lifeEnHeal);
		int attackEnHeal = enHeal.getAttack();
	//	int setAttackEnHeal = enHeal.setAttack(attackEnHeal);
		int specialPowerEnHeal = enHeal.getSpecialPower();
	//	int setSpecialPowerEnHeal = enHeal.setSpecialPower(specialPowerEnHeal);
		
		
		while(lifeEnHeal > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeDam);
			System.out.println("Life IA : " + setLifeEnHeal);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);


			
			switch (battle){
				case 1 : 
					System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
					 System.out.println("Life Point enemy : " + setLifeEnHeal);
					 System.out.print("You attack :");
					 System.out.println( - setAttackDam);
					 actionLife = setLifeEnHeal - setAttackDam;
					 System.out.println("Life IA : " + actionLife);
					 System.out.println("");
					 System.out.println("PDV hero : " + setLifeDam);
					 setLifeEnHeal = actionLife;
					
					 	break;
				case 2 : 
					
					System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
					System.out.println("You become strong");
					System.out.println( "+ attack :  "+ specialPowerDam);
					actionAttack = setAttackDam + specialPowerDam;
					System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + actionAttack);
					System.out.println("");
					setAttackDam = actionAttack;
						break;					
				
				default : 
					battle = 1;
						break;
			}	
			
			if (actionIALife <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (actionLife <= 0){
				System.out.println("Succeed !");
					return 0;
			}

			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + setLifeDam);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnHeal);
					 actionIALife = setLifeDam - attackEnHeal;
					 //System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeDam = actionIALife;
					 setLifeEnHeal = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + setLifeEnHeal);
						System.out.println( "Healing : +" + specialPowerEnHeal);
						actionIALife = setLifeEnHeal + specialPowerEnHeal;
						System.out.println("Life Point IA :" + actionIALife);
						 System.out.println(" ");
						 System.out.println("Life Hero : " + actionLife);
						 System.out.println("Life IA : " + actionIALife);
						 System.out.println(" ");
						 setLifeDam = actionLife;
						 setLifeEnHeal = actionIALife;
				
		             break;
		             
		            default :
		            	iA = 1;
		        }
				if (actionIALife <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (actionLife <= 0){
					System.out.println("Succeed !");
						return 0;
				}
			i ++;
			
		}
		
		return i;
	}
	
	public int damAgainstTank(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
		//int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Damager dam = new Damager();
		final EnemyTank enTan = new EnemyTank();
		
		int lifeDam = dam.getLifePoint();
		int setLifeDam = dam.setLifePoint(lifeDam);
		int attackDam = dam.getAttack();
		int setAttackDam = dam.setAttack(attackDam);
		int specialPowerDam = dam.getSpecialPower();
		int setSpecialPowerDam = dam.setSpecialPower(specialPowerDam);
		
		int lifeEnTan = enTan.getLifePoint();
		int setLifeEnTan = enTan.setLifePoint(lifeEnTan);
		int attackEnTan = enTan.getAttack();
		int setAttackEnTan = enTan.setAttack(attackEnTan);
		int specialPowerEnTan = enTan.getSpecialPower();
		
		
					while(lifeEnTan > 0){
						System.out.println("\n >Handle"+ " " + i + "<");
						System.out.println("");
						System.out.println("Life Hero : " + setLifeDam);
						System.out.println("Life IA : " + setLifeEnTan);
						System.out.println("");
						System.out.println("Your turn :");
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						int battle = Integer.parseInt(sc.nextLine());
						System.out.println("Your choosen : " + battle);
			
			
						
						switch (battle){
							case 1 : 
								System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
								 System.out.println("Life Point enemy : " + setLifeEnTan);
								 System.out.print("You attack :");
								 System.out.println( - setAttackDam);
								 actionLife = setLifeEnTan - setAttackDam;
								 System.out.println("Life IA : " + actionLife);
								 System.out.println("");
								 System.out.println("PDV hero : " + setLifeDam);
								 setLifeEnTan = actionLife;
								
								 	break;
							case 2 : 
								
								System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
								System.out.println("You become strong");
								System.out.println( "+ attack :  "+ specialPowerDam);
								actionAttack = setAttackDam + specialPowerDam;
								System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + actionAttack);
								System.out.println("");
								setAttackDam = actionAttack;
									break;					
							
							default : 
								battle = 1;
									break;
						}	
						
						if (actionIALife <= 0){
							System.out.println("Game over");
								return 0;
						}
						
						if (actionLife <= 0){
							System.out.println("Succeed !");
								return 0;
						}
			
						System.out.println("** Turn of IA **");
						
					       Random coin = new Random();
					        int iA;
					        iA = coin.nextInt(2);
					        switch(iA){
					            case 0 : 
					           	 System.out.println("Life Point hero : " + setLifeDam);
								 System.out.print("IA attacks :");
								 System.out.println( - attackEnTan);
								 actionIALife = setLifeDam - attackEnTan;
								 //System.out.println(actionIALife);
								 System.out.println(" ");
								 System.out.println("Life Hero : " + actionIALife);
								 System.out.println("Life IA : " + actionLife);
								 System.out.println(" ");
								 setLifeDam = actionIALife;
								 setLifeEnTan = actionLife;
								 	break;
					            case 1 : 
					            	System.out.println("IA heal");
									System.out.println("Life Point IA :" + setLifeEnTan);
									System.out.println( "Healing : +" + specialPowerEnTan);
									actionIALife = setLifeEnTan + specialPowerEnTan;
									System.out.println("Life Point IA :" + actionIALife);
									 System.out.println(" ");
									 System.out.println("Life Hero : " + actionLife);
									 System.out.println("Life IA : " + actionIALife);
									 System.out.println(" ");
									 setLifeDam = actionLife;
									 setLifeEnTan = actionIALife;
							
					             break;
					             
					            default :
					            	iA = 1;
					        }
							if (actionIALife <= 0){
								System.out.println("Game over");
									return 0;
							}
							
							if (actionLife <= 0){
								System.out.println("Succeed !");
									return 0;
							}
						i ++;
						
					}
				
		return i;
	}
	
///////////////////////////////////////***************HEALER******************///////////////////////////////////////
	
	public int healAgainstDamager(){
		
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
	//	int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Healer heal = new Healer();
		final EnemyDamager enDam = new EnemyDamager();
		
		int lifeHeal = heal.getLifePoint();
		int setLifeHeal = heal.setLifePoint(lifeHeal);
		int attackHeal = heal.getAttack();
		int setAttackHeal = heal.setAttack(attackHeal);
		int specialPowerHeal = heal.getSpecialPower();
		
		int lifeEnDam = enDam.getLifePoint();
		int setLifeEnDam = enDam.setLifePoint(lifeEnDam);
		int attackEnDam = enDam.getAttack();
	//	int setAttackEnDam = enDam.setAttack(attackEnDam);
		int specialPowerEnDam = enDam.getSpecialPower();
	//	int setSpecialPowerEnDam = enDam.setSpecialPower(specialPowerEnDam);
		

	 	
		while(lifeEnDam > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeHeal);
			System.out.println("Life IA : " + setLifeEnDam);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("Life Point :" + setLifeHeal + " " + "Attack : " + setAttackHeal);
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);
			
			
			switch (battle){
				case 1 : 
					 System.out.print("You attack :");
					 System.out.println( - attackHeal);
					 actionLife = setLifeEnDam - attackHeal;
					 System.out.println("Life IA : " + actionLife);
					 System.out.println("");
					 setLifeEnDam = actionLife;
					
					 	break;
				case 2 : 
					System.out.println("You become strong");
					System.out.println( "+ attack :  "+ specialPowerHeal);
					actionAttack = setAttackHeal + specialPowerHeal;
					System.out.println("Life Point :" + setLifeHeal + " " + "Attack : " + actionAttack);
					System.out.println("");
					setAttackHeal = actionAttack;
						break;
				
				default : 
					battle = 1;
					break;
			}	
			
			if (actionIALife <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (actionLife <= 0){
				System.out.println("Succeed !");
					return 0;
			}

			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + setLifeHeal);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnDam);
					 actionIALife = setLifeHeal - attackEnDam;
					 System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeHeal = actionIALife;
					 setLifeEnDam = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + setLifeEnDam);
						System.out.println( "Healing : +" + specialPowerEnDam);
						actionIALife = setLifeEnDam + specialPowerEnDam;
						System.out.println("Life Point IA :" + actionIALife);
						 System.out.println(" ");
						 System.out.println("Life Hero : " + actionLife);
						 System.out.println("Life IA : " + actionIALife);
						 System.out.println(" ");
						 setLifeHeal = actionLife;
						 setLifeEnDam = actionIALife;
				
		             break;
		             
		            default :
		            	iA = 1;
		            	break;
		        }
				if (actionIALife <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (actionLife <= 0){
					System.out.println("Succeed !");
						return 0;
				}
			i ++;
			
		}
		return i;
		}
	
	
	public int healAgainstHealer(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
	//	int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Healer heal = new Healer();
		final EnemyHealer enHeal = new EnemyHealer();
		
		int lifeHeal = heal.getLifePoint();
		int setLifeHeal = heal.setLifePoint(lifeHeal);
		int attackHeal = heal.getAttack();
		int setAttackHeal = heal.setAttack(attackHeal);
		int specialPowerHeal = heal.getSpecialPower();
	//	int setSpecialPowerDam = dam.setSpecialPower(specialPowerDam);
		
		int lifeEnHeal = enHeal.getLifePoint();
		int setLifeEnHeal = enHeal.setLifePoint(lifeEnHeal);
		int attackEnHeal = enHeal.getAttack();
	//	int setAttackEnHeal = enHeal.setAttack(attackEnHeal);
		int specialPowerEnHeal = enHeal.getSpecialPower();
	//	int setSpecialPowerEnHeal = enHeal.setSpecialPower(specialPowerEnHeal);
		
		
		while(lifeEnHeal > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeHeal);
			System.out.println("Life IA : " + setLifeEnHeal);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);


			
			switch (battle){
			case 1 : 
				 System.out.print("You attack :");
				 System.out.println( - attackHeal);
				 actionLife = setLifeEnHeal - attackHeal;
				 System.out.println("Life IA : " + actionLife);
				 System.out.println("");
				 setLifeEnHeal = actionLife;
				
				 	break;
			case 2 : 
				System.out.println("You become strong");
				System.out.println( "+ attack :  "+ specialPowerHeal);
				actionAttack = setAttackHeal + specialPowerHeal;
				System.out.println("Life Point :" + setLifeHeal + " " + "Attack : " + actionAttack);
				System.out.println("");
				setAttackHeal = actionAttack;
					break;			
				
				default : 
					battle = 1;
						break;
			}	
			
			if (actionIALife <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (actionLife <= 0){
				System.out.println("Succeed !");
					return 0;
			}

			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + setLifeHeal);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnHeal);
					 actionIALife = setLifeHeal - attackEnHeal;
					 //System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeHeal = actionIALife;
					 setLifeEnHeal = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + setLifeEnHeal);
						System.out.println( "Healing : +" + specialPowerEnHeal);
						actionIALife = setLifeEnHeal + specialPowerEnHeal;
						System.out.println("Life Point IA :" + actionIALife);
						 System.out.println(" ");
						 System.out.println("Life Hero : " + actionLife);
						 System.out.println("Life IA : " + actionIALife);
						 System.out.println(" ");
						 setLifeHeal = actionLife;
						 setLifeEnHeal = actionIALife;
				
		             break;
		             
		            default :
		            	iA = 1;
		        }
				if (actionIALife <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (actionLife <= 0){
					System.out.println("Succeed !");
						return 0;
				}
			i ++;
			
		}
		
		return i;
	}
	public int healAgainstTank(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
		//int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Healer heal = new Healer();
		final EnemyTank enTan = new EnemyTank();
		
		int lifeHeal = heal.getLifePoint();
		int setLifeHeal = heal.setLifePoint(lifeHeal);
		int attackHeal = heal.getAttack();
		int setAttackHeal = heal.setAttack(attackHeal);
		int specialPowerHeal = heal.getSpecialPower();
		int setSpecialPowerHeal =heal.setSpecialPower(specialPowerHeal);
		
		int lifeEnTan = enTan.getLifePoint();
		int setLifeEnTan = enTan.setLifePoint(lifeEnTan);
		int attackEnTan = enTan.getAttack();
		int setAttackEnTan = enTan.setAttack(attackEnTan);
		int specialPowerEnTan = enTan.getSpecialPower();
		
		
					while(lifeEnTan > 0){
						System.out.println("\n >Handle"+ " " + i + "<");
						System.out.println("");
						System.out.println("Life Hero : " + setLifeHeal);
						System.out.println("Life IA : " + setLifeEnTan);
						System.out.println("");
						System.out.println("Your turn :");
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						int battle = Integer.parseInt(sc.nextLine());
						System.out.println("Your choosen : " + battle);
			
			
						
						switch (battle){
						case 1 : 
							 System.out.print("You attack :");
							 System.out.println( - attackHeal);
							 actionLife = setLifeEnTan - attackHeal;
							 System.out.println("Life IA : " + actionLife);
							 System.out.println("");
							 setLifeEnTan = actionLife;
							
							 	break;
						case 2 : 
							System.out.println("You become strong");
							System.out.println( "+ attack :  "+ specialPowerHeal);
							actionAttack = setAttackHeal + specialPowerHeal;
							System.out.println("Life Point :" + setLifeHeal + " " + "Attack : " + actionAttack);
							System.out.println("");
							setAttackHeal = actionAttack;
								break;					
							
							default : 
								battle = 1;
									break;
						}	
						
						if (actionIALife <= 0){
							System.out.println("Game over");
								return 0;
						}
						
						if (actionLife <= 0){
							System.out.println("Succeed !");
								return 0;
						}
			
						System.out.println("** Turn of IA **");
						
					       Random coin = new Random();
					        int iA;
					        iA = coin.nextInt(2);
					        switch(iA){
					            case 0 : 
					           	 System.out.println("Life Point hero : " + setLifeHeal);
								 System.out.print("IA attacks :");
								 System.out.println( - attackEnTan);
								 actionIALife = setLifeHeal - attackEnTan;
								 //System.out.println(actionIALife);
								 System.out.println(" ");
								 System.out.println("Life Hero : " + actionIALife);
								 System.out.println("Life IA : " + actionLife);
								 System.out.println(" ");
								 setLifeHeal = actionIALife;
								 setLifeEnTan = actionLife;
								 	break;
					            case 1 : 
					            	System.out.println("IA heal");
									System.out.println("Life Point IA :" + setLifeEnTan);
									System.out.println( "Healing : +" + specialPowerEnTan);
									actionIALife = setLifeEnTan + specialPowerEnTan;
									System.out.println("Life Point IA :" + actionIALife);
									 System.out.println(" ");
									 System.out.println("Life Hero : " + actionLife);
									 System.out.println("Life IA : " + actionIALife);
									 System.out.println(" ");
									 setLifeHeal = actionLife;
									 setLifeEnTan = actionIALife;
							
					             break;
					             
					            default :
					            	iA = 1;
					        }
							if (actionIALife <= 0){
								System.out.println("Game over");
									return 0;
							}
							
							if (actionLife <= 0){
								System.out.println("Succeed !");
									return 0;
							}
						i ++;
						
					}
				
		return i;
	}

///////////////////////////////////////***************TANK******************///////////////////////////////////////
	public int tanAgainstDamager(){
		
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
	//	int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Tank tan = new Tank();
		final EnemyDamager enDam = new EnemyDamager();
		
		int lifeTan = tan.getLifePoint();
		int setLifeTan = tan.setLifePoint(lifeTan);
		int attackTan = tan.getAttack();
		int setAttackTan = tan.setAttack(attackTan);
		int specialPowerTan = tan.getSpecialPower();
		
		int lifeEnDam = enDam.getLifePoint();
		int setLifeEnDam = enDam.setLifePoint(lifeEnDam);
		int attackEnDam = enDam.getAttack();
	//	int setAttackEnDam = enDam.setAttack(attackEnDam);
		int specialPowerEnDam = enDam.getSpecialPower();
	//	int setSpecialPowerEnDam = enDam.setSpecialPower(specialPowerEnDam);
		

	 	
		while(lifeEnDam > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeTan);
			System.out.println("Life IA : " + setLifeEnDam);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("Life Point :" + setLifeTan + " " + "Attack : " + setAttackTan);
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);
			
			
			switch (battle){
				case 1 : 
					 System.out.print("You attack :");
					 System.out.println( - attackTan);
					 actionLife = setLifeEnDam - attackTan;
					 System.out.println("Life IA : " + actionLife);
					 System.out.println("");
					 setLifeEnDam = actionLife;
					
					 	break;
				case 2 : 
					System.out.println("You become strong");
					System.out.println( "+ attack :  "+ specialPowerTan);
					actionAttack = setAttackTan + specialPowerTan;
					System.out.println("Life Point :" + setLifeTan + " " + "Attack : " + actionAttack);
					System.out.println("");
					setAttackTan = actionAttack;
						break;
				
				default : 
					battle = 1;
					break;
			}	
			
			if (actionIALife <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (actionLife <= 0){
				System.out.println("Succeed !");
					return 0;
			}

			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + setLifeTan);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnDam);
					 actionIALife = setLifeTan - attackEnDam;
					 System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeTan = actionIALife;
					 setLifeEnDam = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("IA Tan");
						System.out.println("Life Point IA :" + setLifeEnDam);
						System.out.println( "Taning : +" + specialPowerEnDam);
						actionIALife = setLifeEnDam + specialPowerEnDam;
						System.out.println("Life Point IA :" + actionIALife);
						 System.out.println(" ");
						 System.out.println("Life Hero : " + actionLife);
						 System.out.println("Life IA : " + actionIALife);
						 System.out.println(" ");
						 setLifeTan = actionLife;
						 setLifeEnDam = actionIALife;
				
		             break;
		             
		            default :
		            	iA = 1;
		            	break;
		        }
				if (actionIALife <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (actionLife <= 0){
					System.out.println("Succeed !");
						return 0;
				}
			i ++;
			
		}
		return i;
		}
	
	
	public int tanAgainstHealer(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
	//	int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Tank tan = new Tank();
		final EnemyHealer enHeal = new EnemyHealer();
		
		int lifeTan = tan.getLifePoint();
		int setLifeTan = tan.setLifePoint(lifeTan);
		int attackTan = tan.getAttack();
		int setAttackTan = tan.setAttack(attackTan);
		int specialPowerTan = tan.getSpecialPower();
	//	int setSpecialPowerDam = dam.setSpecialPower(specialPowerDam);
		
		int lifeEnHeal = enHeal.getLifePoint();
		int setLifeEnHeal = enHeal.setLifePoint(lifeEnHeal);
		int attackEnHeal = enHeal.getAttack();
	//	int setAttackEnHeal = enHeal.setAttack(attackEnHeal);
		int specialPowerEnHeal = enHeal.getSpecialPower();
	//	int setSpecialPowerEnHeal = enHeal.setSpecialPower(specialPowerEnHeal);
		
		
		while(lifeEnHeal > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeTan);
			System.out.println("Life IA : " + setLifeEnHeal);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);


			
			switch (battle){
			case 1 : 
				 System.out.print("You attack :");
				 System.out.println( - attackTan);
				 actionLife = setLifeEnHeal - attackTan;
				 System.out.println("Life IA : " + actionLife);
				 System.out.println("");
				 setLifeEnHeal = actionLife;
				
				 	break;
			case 2 : 
				System.out.println("You become strong");
				System.out.println( "+ attack :  "+ specialPowerTan);
				actionAttack = setAttackTan + specialPowerTan;
				System.out.println("Life Point :" + setLifeTan + " " + "Attack : " + actionAttack);
				System.out.println("");
				setAttackTan = actionAttack;
					break;			
				
				default : 
					battle = 1;
						break;
			}	
			
			if (actionIALife <= 0){
				System.out.println("Game over");
					return 0;
			}
			
			if (actionLife <= 0){
				System.out.println("Succeed !");
					return 0;
			}

			System.out.println("** Turn of IA **");
			
		       Random coin = new Random();
		        int iA;
		        iA = coin.nextInt(2);
		        switch(iA){
		            case 0 : 
		           	 System.out.println("Life Point hero : " + setLifeTan);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnHeal);
					 actionIALife = setLifeTan - attackEnHeal;
					 //System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeTan = actionIALife;
					 setLifeEnHeal = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("IA heal");
						System.out.println("Life Point IA :" + setLifeEnHeal);
						System.out.println( "Healing : +" + specialPowerEnHeal);
						actionIALife = setLifeEnHeal + specialPowerEnHeal;
						System.out.println("Life Point IA :" + actionIALife);
						 System.out.println(" ");
						 System.out.println("Life Hero : " + actionLife);
						 System.out.println("Life IA : " + actionIALife);
						 System.out.println(" ");
						 setLifeTan = actionLife;
						 setLifeEnHeal = actionIALife;
				
		             break;
		             
		            default :
		            	iA = 1;
		        }
				if (actionIALife <= 0){
					System.out.println("Game over");
						return 0;
				}
				
				if (actionLife <= 0){
					System.out.println("Succeed !");
						return 0;
				}
			i ++;
			
		}
		
		return i;
	}
	public int tanAgainstTank(){
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
		//int actionIAAttack = 1;
		int i = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		final Tank tan = new Tank();
		final EnemyTank enTan = new EnemyTank();
		
		int lifeTan = tan.getLifePoint();
		int setLifeTan = tan.setLifePoint(lifeTan);
		int attackTan = tan.getAttack();
		int setAttackTan = tan.setAttack(attackTan);
		int specialPowerTan = tan.getSpecialPower();
		int setSpecialPowerTan = tan.setSpecialPower(specialPowerTan);
		
		int lifeEnTan = enTan.getLifePoint();
		int setLifeEnTan = enTan.setLifePoint(lifeEnTan);
		int attackEnTan = enTan.getAttack();
		int setAttackEnTan = enTan.setAttack(attackEnTan);
		int specialPowerEnTan = enTan.getSpecialPower();
		
		
					while(lifeEnTan > 0){
						System.out.println("\n >Handle"+ " " + i + "<");
						System.out.println("");
						System.out.println("Life Hero : " + setLifeTan);
						System.out.println("Life IA : " + setLifeEnTan);
						System.out.println("");
						System.out.println("Your turn :");
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						int battle = Integer.parseInt(sc.nextLine());
						System.out.println("Your choosen : " + battle);
			
			
						
						switch (battle){
						case 1 : 
							 System.out.print("You attack :");
							 System.out.println( - attackTan);
							 actionLife = setLifeEnTan - attackTan;
							 System.out.println("Life IA : " + actionLife);
							 System.out.println("");
							 setLifeEnTan = actionLife;
							
							 	break;
						case 2 : 
							System.out.println("You become strong");
							System.out.println( "+ attack :  "+ specialPowerTan);
							actionAttack = setAttackTan + specialPowerTan;
							System.out.println("Life Point :" + setLifeTan + " " + "Attack : " + actionAttack);
							System.out.println("");
							setAttackTan = actionAttack;
								break;					
							
							default : 
								battle = 1;
									break;
						}	
						
						if (actionIALife <= 0){
							System.out.println("Game over");
								return 0;
						}
						
						if (actionLife <= 0){
							System.out.println("Succeed !");
								return 0;
						}
			
						System.out.println("** Turn of IA **");
						
					       Random coin = new Random();
					        int iA;
					        iA = coin.nextInt(2);
					        switch(iA){
					            case 0 : 
					           	 System.out.println("Life Point hero : " + setLifeTan);
								 System.out.print("IA attacks :");
								 System.out.println( - attackEnTan);
								 actionIALife = setLifeTan - attackEnTan;
								 //System.out.println(actionIALife);
								 System.out.println(" ");
								 System.out.println("Life Hero : " + actionIALife);
								 System.out.println("Life IA : " + actionLife);
								 System.out.println(" ");
								 setLifeTan = actionIALife;
								 setLifeEnTan = actionLife;
								 	break;
					            case 1 : 
					            	System.out.println("IA heal");
									System.out.println("Life Point IA :" + setLifeEnTan);
									System.out.println( "Healing : +" + specialPowerEnTan);
									actionIALife = setLifeEnTan + specialPowerEnTan;
									System.out.println("Life Point IA :" + actionIALife);
									 System.out.println(" ");
									 System.out.println("Life Hero : " + actionLife);
									 System.out.println("Life IA : " + actionIALife);
									 System.out.println(" ");
									 setLifeTan = actionLife;
									 setLifeEnTan = actionIALife;
							
					             break;
					             
					            default :
					            	iA = 1;
					        }
							if (actionIALife <= 0){
								System.out.println("Game over");
									return 0;
							}
							
							if (actionLife <= 0){
								System.out.println("Succeed !");
									return 0;
							}
						i ++;
						
					}
				
		return i;
	}
}
