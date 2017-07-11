package handle;


import java.util.Scanner;

import enemy.EnemyDamager;
import enemy.EnemyHealer;
import enemy.EnemyTank;
import hero.Damager;
import hero.Healer;
import hero.Tank;

public class Handle{


	int equationBloquer;
	int iA = 4 ;
	
	public int handle(){
		
		int actionLife = 1;
		int actionAttack = 1;
		int actionIALife = 1;
		int actionIAAttack = 1;
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
		
	
		int lifeEnDam = enDam.getLifePoint();
		int setLifeEnDam = enDam.setLifePoint(lifeEnDam);
		int attackEnDam = enDam.getAttack();
		int setAttackEnDam = enDam.setAttack(attackEnDam);
		int specialPowerEnDam = enDam.getSpecialPower();
	
//		int bloquerDam;
//		int bloquerEnDam;
		
	
		
		while(lifeEnDam > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeDam);
			System.out.println("Life IA : " + setLifeEnDam);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			System.out.println("3 : Bloquer");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);


			
			switch (battle){
				case 1 : 
					 System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
					 System.out.print("You attack :");
					 System.out.println( - attackDam);
					 actionLife = setLifeEnDam - attackDam;
					 System.out.println("Life IA Damager: " + actionLife);
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
						
				case 3 :
					if (iA == 0){
						System.out.println("Hero Damager stoped attack of the hero Damger !");
						System.out.println("Life Hero Damager : " + setLifeDam);
						setLifeDam = setLifeDam + setAttackEnDam;
						System.out.println("Life Hero Damager recovery : " + setLifeDam);
						equationBloquer =  actionIAAttack - actionIAAttack + 1;
						System.out.println("Lost point :" + equationBloquer);
						setLifeDam = setLifeDam - equationBloquer;
						System.out.println("Life Hero Damager after Stopted the attack : " + setLifeDam);
					}
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
			
		      
		        
		        iA = (int)(Math.random() * 3);
		        switch(iA){
		            case 0 : 
		             System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackEnDam);
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnDam);
					 actionIALife = setLifeDam - attackEnDam;
					 System.out.println(actionIALife);
					 System.out.println(" ");
					 System.out.println("Life Hero Damager : " + actionIALife);
					 System.out.println("Life IA Damager: " + actionLife);
					 System.out.println(" ");
					 setLifeDam = actionIALife;
					 setLifeEnDam = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackEnDam);
						System.out.println("IA Damager becomes strong");
						System.out.println( "+ attack :  "+ specialPowerDam);
						actionIAAttack = setAttackEnDam + specialPowerEnDam;
						System.out.println("Life Point :" + setLifeEnDam + " " + "Attack : " + actionIAAttack);
						System.out.println("");
						setAttackEnDam = actionIAAttack;
							break;
		            case 2 :
							if (battle == 1){
								System.out.println("IA Damager stoped attack of the hero Damger !");
								System.out.println("Life IA Damager : " + setLifeEnDam);
								setLifeEnDam = setLifeEnDam + setAttackDam;
								System.out.println("Life IA Damager recovery : " + setLifeEnDam);
								equationBloquer =  actionAttack - actionAttack + 1;
								System.out.println("Lost point :" + equationBloquer);
								setLifeEnDam = setLifeEnDam - equationBloquer;
								System.out.println("Life IA Damager after Stopted the attack : " + setLifeEnDam);
							}
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
		int actionIAAttack = 1;
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
		
		int lifeEnHeal = enHeal.getLifePoint();
		int setLifeEnHeal = enHeal.setLifePoint(lifeEnHeal);
		int attackEnHeal = enHeal.getAttack();
		int setAttackEnHeal = enHeal.setAttack(attackEnHeal);
		int specialPowerEnHeal = enHeal.getSpecialPower();
		
		
		while(lifeEnHeal > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeDam);
			System.out.println("Life IA : " + setLifeEnHeal);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			System.out.println("3 : Bloquer");
			int battle = Integer.parseInt(sc.nextLine());
			System.out.println("Your choosen : " + battle);


			
			switch (battle){
				case 1 : 
					 System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
					 System.out.print("You attack :");
					 System.out.println( - setAttackDam);
					 actionLife = setLifeEnHeal - setAttackDam;
					 System.out.println("Life IA : " + actionLife);
					 System.out.println("");
					 System.out.println("Life hero : " + setLifeDam);
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
				
				case 3 :
					if (iA == 0){
						System.out.println("Hero Damager stoped attack of the hero Damger !");
						System.out.println("Life Hero Damager : " + setLifeDam);
						setLifeDam = setLifeDam + setAttackEnHeal;
						System.out.println("Life Hero Damager recovery : " + setLifeDam);
						equationBloquer =  actionIAAttack - actionIAAttack + 1;
						System.out.println("Lost point :" + equationBloquer);
						setLifeDam = setLifeDam - equationBloquer;
						System.out.println("Life Hero Damager after Stopted the attack : " + setLifeDam);
					}
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
			System.out.println("");
			System.out.println("Life Point IA :" + setLifeEnHeal + " " + "Attack IA : " + actionIAAttack);
			
		      
		        iA = (int)(Math.random() * 3);
		        switch(iA){
		            case 0 : 
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnHeal);
					 actionIALife = setLifeDam - attackEnHeal;
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeDam = actionIALife;
					 setLifeEnHeal = actionLife;
					 	break;
		            case 1 : 
		               	System.out.println("IA Tank become strong");
						System.out.println( "+ attack :  "+ specialPowerEnHeal);
						actionIAAttack = setAttackEnHeal + specialPowerEnHeal;
						System.out.println("Life Point IA :" + setLifeEnHeal + " " + "Attack IA : " + actionIAAttack);
						System.out.println("");
						setAttackEnHeal = actionIAAttack;			
								break;
		             
		            case 2 :
		            	if (battle == 1){
							System.out.println("IA Damager stoped attack of the hero Damger !");
							System.out.println("Life IA Damager : " + setLifeEnHeal);
							setLifeEnHeal = setLifeEnHeal + setAttackDam;
							System.out.println("Life IA Damager recovery : " + setLifeEnHeal);
							equationBloquer =  actionAttack - actionAttack + 1;
							System.out.println("Lost point :" + equationBloquer);
							setLifeEnHeal = setLifeEnHeal - equationBloquer;
							System.out.println("Life IA Damager after Stopted the attack : " + setLifeEnHeal);
						}
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
		int actionIAAttack = 1;
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
						System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + setAttackDam);
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						System.out.println("3 : Bloquer");
						int battle = Integer.parseInt(sc.nextLine());
						System.out.println("Your choosen : " + battle);
			
			
						
						switch (battle){
							case 1 : 
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
								System.out.println("You become strong");
								System.out.println( "+ attack :  "+ specialPowerDam);
								actionAttack = setAttackDam + specialPowerDam;
								System.out.println("Life Point :" + setLifeDam + " " + "Attack : " + actionAttack);
								System.out.println("");
								setAttackDam = actionAttack;
									break;					
							case 3 :
								if (iA == 0){
									System.out.println("Hero Damager stoped attack of the hero Damger !");
									System.out.println("Life Hero Damager : " + setLifeDam);
									setLifeDam = setLifeDam + setAttackEnTan;
									System.out.println("Life Hero Damager recovery : " + setLifeDam);
									equationBloquer =  actionIAAttack - actionIAAttack + 1;
									System.out.println("Lost point :" + equationBloquer);
									setLifeDam = setLifeDam - equationBloquer;
									System.out.println("Life Hero Damager after Stopted the attack : " + setLifeDam);
								}
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
						System.out.println("");
						System.out.println("Life Point IA :" + setLifeEnTan + " " + "Attack IA : " + actionIAAttack);
					      
					        iA = (int)(Math.random() * 3);
					        switch(iA){
					            case 0 : 
					           	 System.out.println("Life Point hero : " + setLifeDam);
								 System.out.print("IA attacks :");
								 System.out.println( - attackEnTan);
								 actionIALife = setLifeDam - attackEnTan;
								 System.out.println(" ");
								 System.out.println("Life Hero : " + actionIALife);
								 System.out.println("Life IA : " + actionLife);
								 System.out.println(" ");
								 setLifeDam = actionIALife;
								 setLifeEnTan = actionLife;
								 	break;
					            case 1 : 
					            	System.out.println("IA Tank become strong");
									System.out.println( "+ attack :  "+ specialPowerEnTan);
									actionIAAttack = setAttackEnTan + specialPowerEnTan;
									System.out.println("Life Point IA :" + setLifeEnTan + " " + "Attack IA : " + actionIAAttack);
									System.out.println("");
									setAttackEnTan = actionIAAttack;
							
					             break;
					            
					            case 2 :
					         	if (battle == 1){
									System.out.println("IA Tank stoped attack of the hero Damger !");
									System.out.println("Life IA Tank : " + setLifeEnTan);
									setLifeEnTan = setLifeEnTan + setAttackDam;
									System.out.println("Life IA Tank recovery : " + setLifeEnTan);
									equationBloquer =  actionAttack - actionAttack + 1;
									System.out.println("Lost point :" + equationBloquer);
									setLifeEnTan = setLifeEnTan - equationBloquer;
									System.out.println("Life IA Tank after Stopted the attack : " + setLifeEnTan);
								}
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
		int actionIAAttack = 1;
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
		int setAttackEnDam = enDam.setAttack(attackEnDam);
		int specialPowerEnDam = enDam.getSpecialPower();

	 	
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
			System.out.println("3 : Bloquer");
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
				case 3 :
					if (iA == 0){
						System.out.println("Hero Damager stoped attack of the hero Damger !");
						System.out.println("Life Hero Damager : " + setLifeHeal);
						setLifeHeal = setLifeHeal + setAttackEnDam;
						System.out.println("Life Hero Damager recovery : " + setLifeHeal);
						equationBloquer =  actionIAAttack - actionIAAttack + 1;
						System.out.println("Lost point :" + equationBloquer);
						setLifeHeal = setLifeHeal - equationBloquer;
						System.out.println("Life Hero Damager after Stopted the attack : " + setLifeHeal);
					}
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
			System.out.println("");
			System.out.println("Life Point IA :" + setLifeEnDam + " " + "Attack IA : " + actionIAAttack);
		
		       
		        iA = (int)(Math.random() * 3);
		        switch(iA){
		            case 0 : 
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
		            	System.out.println("Life IA :" + setLifeEnDam + " " + "Attack IA: " + setAttackEnDam);
						System.out.println("IA becomes strong");
						System.out.println( "+ attack :  "+ specialPowerEnDam);
						actionIAAttack = setAttackEnDam + specialPowerEnDam;
						System.out.println("Life IA :" + setLifeEnDam + " " + "Attack IA: " + actionAttack);
						System.out.println("");
						setAttackEnDam = actionIAAttack;
				
		             break;
		            case 2 :
		         	if (battle == 1){
						System.out.println("IA Healer stoped attack of the hero Damger !");
						System.out.println("Life IA Healer : " + setLifeEnDam);
						setLifeEnDam = setLifeEnDam + setAttackHeal;
						System.out.println("Life IA Healer recovery : " + setLifeEnDam);
						equationBloquer =  actionAttack - actionAttack + 1;
						System.out.println("Lost point :" + equationBloquer);
						setLifeEnDam = setLifeEnDam - equationBloquer;
						System.out.println("Life IA Healer after Stopted the attack : " + setLifeEnDam);
					}
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
		int actionIAAttack = 1;
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

		
		int lifeEnHeal = enHeal.getLifePoint();
		int setLifeEnHeal = enHeal.setLifePoint(lifeEnHeal);
		int attackEnHeal = enHeal.getAttack();
		int setAttackEnHeal = enHeal.setAttack(attackEnHeal);
		int specialPowerEnHeal = enHeal.getSpecialPower();
	
		
		
		while(lifeEnHeal > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeHeal);
			System.out.println("Life IA : " + setLifeEnHeal);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("Life Point :" + setLifeHeal + " " + "Attack : " + setAttackHeal);
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			System.out.println("3 : Bloquer");
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
				System.out.println("Life Hero :" + setLifeHeal + " " + "Attack : " + actionAttack);
				System.out.println("");
				setAttackHeal = actionAttack;
					break;			
				
			case 3 :
				if (iA == 0){
					System.out.println("Hero Damager stoped attack of the hero Damger !");
					System.out.println("Life Hero Damager : " + setLifeHeal);
					setLifeHeal = setLifeHeal + setAttackEnHeal;
					System.out.println("Life Hero Damager recovery : " + setLifeHeal);
					equationBloquer =  actionIAAttack - actionIAAttack + 1;
					System.out.println("Lost point :" + equationBloquer);
					setLifeHeal = setLifeHeal - equationBloquer;
					System.out.println("Life Hero Damager after Stopted the attack : " + setLifeHeal);
				}
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
			System.out.println("");
			System.out.println("Life Point IA :" + setLifeEnHeal + " " + "Attack IA : " + actionIAAttack);
		
		        iA = (int)(Math.random() * 3);
		        switch(iA){
		            case 0 : 
					 System.out.print("IA attacks :");
					 System.out.println( - attackEnHeal);
					 actionIALife = setLifeHeal - attackEnHeal;
					 System.out.println(" ");
					 System.out.println("Life Hero : " + actionIALife);
					 System.out.println("Life IA : " + actionLife);
					 System.out.println(" ");
					 setLifeHeal = actionIALife;
					 setLifeEnHeal = actionLife;
					 	break;
		            case 1 : 
		            	System.out.println("Life IA :" + setLifeEnHeal + " " + "Attack IA : " + setAttackEnHeal);
						System.out.println("IA becomes strong");
						System.out.println( "+ attack :  "+ specialPowerHeal);
						actionIAAttack = setAttackEnHeal + specialPowerEnHeal;
						System.out.println("Life IA :" + setLifeHeal + " " + "Attack IA: " + actionIAAttack);
						System.out.println("");
						setAttackEnHeal = actionIAAttack;
				
		             break;
		            
		            case 2 :
		            	if (battle == 1){
							System.out.println("IA  stoped attack of the hero Damger !");
							System.out.println("Life IA : " + setLifeEnHeal);
							setLifeEnHeal = setLifeEnHeal + setAttackHeal;
							System.out.println("Life IA recovery : " + setLifeEnHeal);
							equationBloquer =  actionAttack - actionAttack + 1;
							System.out.println("Lost point :" + equationBloquer);
							setLifeEnHeal = setLifeEnHeal - equationBloquer;
							System.out.println("Life IA after Stopted the attack : " + setLifeEnHeal);
						}
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
		int actionIAAttack = 1;
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
						System.out.println("Life Point :" + setLifeHeal + " " + "Attack : " + setAttackHeal);
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						System.out.println("3 : Bloquer");
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
						case 3 :
							if (iA == 0){
								System.out.println("Hero stoped attack of the hero Damger !");
								System.out.println("Life Hero  : " + setLifeHeal);
								setLifeHeal = setLifeHeal + setAttackEnTan;
								System.out.println("Life Hero recovery : " + setLifeHeal);
								equationBloquer =  actionIAAttack - actionIAAttack + 1;
								System.out.println("Lost point :" + equationBloquer);
								setLifeHeal = setLifeHeal - equationBloquer;
								System.out.println("Life Hero after Stopted the attack : " + setLifeHeal);
							}
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
						System.out.println("");
						System.out.println("Life Point IA :" + setLifeEnTan + " " + "Attack IA : " + actionIAAttack);
					      
					        iA = (int)(Math.random() * 3);
					        switch(iA){
					            case 0 : 
								 System.out.print("IA attacks :");
								 System.out.println( - attackEnTan);
								 actionIALife = setLifeHeal - attackEnTan;
								 System.out.println(" ");
								 System.out.println("Life Hero : " + actionIALife);
								 System.out.println("Life IA : " + actionLife);
								 System.out.println(" ");
								 setLifeHeal = actionIALife;
								 setLifeEnTan = actionLife;
								 	break;
					            case 1 : 
					            	System.out.println("IA becomes strong");
									System.out.println( "+ attack :  "+ specialPowerEnTan);
									actionIAAttack = setAttackEnTan + specialPowerEnTan;
									System.out.println("Life Point IA:" + setLifeEnTan + " " + "Attack IA : " + actionIAAttack);
									System.out.println("");
									setAttackEnTan = actionIAAttack;
							
					             break;
					             
					            case 2 :
						         	if (battle == 1){
										System.out.println("IA stoped attack of the hero Damger !");
										System.out.println("Life IA : " + setLifeEnTan);
										setLifeEnTan = setLifeEnTan + setAttackHeal;
										System.out.println("Life IA recovery : " + setLifeEnTan);
										equationBloquer =  actionAttack - actionAttack + 1;
										System.out.println("Lost point :" + equationBloquer);
										setLifeEnTan = setLifeEnTan - equationBloquer;
										System.out.println("Life IA after Stopted the attack : " + setLifeEnTan);
									}
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
		int actionIAAttack = 1;
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
		int setAttackEnDam = enDam.setAttack(attackEnDam);
		int specialPowerEnDam = enDam.getSpecialPower();
	

	 	
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
			System.out.println("3 : Bloquer");
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
			
				case 3 :
					if (iA == 0){
						System.out.println("Hero stoped attack of the hero Damger !");
						System.out.println("Life Hero : " + setLifeTan);
						setLifeTan = setLifeTan + setAttackEnDam;
						System.out.println("Life Hero recovery : " + setLifeTan);
						equationBloquer =  actionIAAttack - actionIAAttack + 1;
						System.out.println("Lost point :" + equationBloquer);
						setLifeTan = setLifeTan - equationBloquer;
						System.out.println("Life Hero after Stopted the attack : " + setLifeTan);
					}
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
			
		      
		        iA = (int)(Math.random() * 3);
		        switch(iA){
		            case 0 : 
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
		            	System.out.println("Life IA :" + setLifeEnDam + " " + "Attack : " + setAttackEnDam);
						System.out.println("IA becomes strong");
						System.out.println( "+ attack :  "+ specialPowerEnDam);
						actionIAAttack = setAttackEnDam + specialPowerEnDam;
						System.out.println("Life IA :" + setLifeEnDam + " " + "Attack : " + actionIAAttack);
						System.out.println("");
						setAttackEnDam = actionIAAttack;
				
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
		int actionIAAttack = 1;
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

		int lifeEnHeal = enHeal.getLifePoint();
		int setLifeEnHeal = enHeal.setLifePoint(lifeEnHeal);
		int attackEnHeal = enHeal.getAttack();
		int setAttackEnHeal = enHeal.setAttack(attackEnHeal);
		int specialPowerEnHeal = enHeal.getSpecialPower();
	
		
		while(lifeEnHeal > 0){
			System.out.println("\n >Handle"+ " " + i + "<");
			System.out.println("");
			System.out.println("Life Hero : " + setLifeTan);
			System.out.println("Life IA : " + setLifeEnHeal);
			System.out.println("");
			System.out.println("Your turn :");
			System.out.println("Life Point :" + setLifeTan + " " + "Attack : " + setAttackTan);
			System.out.println("1 : Attack");
			System.out.println("2 : Special Power");
			System.out.println("3 : Bloquer");
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
				System.out.println("Life Hero :" + setLifeTan + " " + "Attack : " + actionAttack);
				System.out.println("");
				setAttackTan = actionAttack;
					break;			
			  case 3 :
					if (iA == 0){
						System.out.println("Hero  stoped attack of the hero Damger !");
						System.out.println("Life Hero : " + setLifeTan);
						setLifeTan = setLifeTan + setAttackEnHeal;
						System.out.println("Life Hero  recovery : " + setLifeTan);
						equationBloquer =  actionIAAttack - actionIAAttack + 1;
						System.out.println("Lost point :" + equationBloquer);
						setLifeTan = setLifeTan - equationBloquer;
						System.out.println("Life Hero after Stopted the attack : " + setLifeTan);
					}
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
			System.out.println("");
			System.out.println("Life IA :" + setLifeEnHeal + " " + "Attack IA : " + actionIAAttack);
		
		       
		        iA = (int)(Math.random() * 3);
		        switch(iA){
		            case 0 : 
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
		            	System.out.println("IA becomes strong");
						System.out.println( "+ attack :  "+ specialPowerEnHeal);
						actionIAAttack = setAttackEnHeal + specialPowerEnHeal;
						System.out.println("Life IA :" + setLifeEnHeal + " " + "Attack IA : " + actionIAAttack);
						System.out.println("");
						setAttackEnHeal = actionIAAttack;
				
		             break;
		            
		            case 2 :
		            	if (battle == 1){
							System.out.println("IA stoped attack of the hero Damger !");
							System.out.println("Life IA  : " + setLifeEnHeal);
							setLifeEnHeal = setLifeEnHeal + setAttackTan;
							System.out.println("Life IA recovery : " + setLifeEnHeal);
							equationBloquer =  actionAttack - actionAttack + 1;
							System.out.println("Lost point :" + equationBloquer);
							setLifeEnHeal = setLifeEnHeal - equationBloquer;
							System.out.println("Life IA  after Stopted the attack : " + setLifeEnHeal);
						}
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
		int actionIAAttack = 1;
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
						System.out.println("Life Point :" + setLifeTan + " " + "Attack : " + setAttackTan);
						System.out.println("1 : Attack");
						System.out.println("2 : Special Power");
						System.out.println("3 : Bloquer");
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
						case 3 :
							if (iA == 0){
								System.out.println("Hero stoped attack of the hero Damger !");
								System.out.println("Life Hero  : " + setLifeTan);
								setLifeTan = setLifeTan + setAttackEnTan;
								System.out.println("Life Hero recovery : " + setLifeTan);
								equationBloquer =  actionIAAttack - actionIAAttack + 1;
								System.out.println("Lost point :" + equationBloquer);
								setLifeTan = setLifeTan - equationBloquer;
								System.out.println("Life Hero  after Stopted the attack : " + setLifeTan);
							}
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
						System.out.println("");
						System.out.println("Life Point IA :" + setLifeEnTan + " " + "Attack IA : " + actionIAAttack);
					      
					        int iA;
					        iA = (int)(Math.random() * 3);
					        switch(iA){
					            case 0 : 
								 System.out.print("IA attacks :");
								 System.out.println( - attackEnTan);
								 actionIALife = setLifeTan - attackEnTan;
								 System.out.println(" ");
								 System.out.println("Life Hero : " + actionIALife);
								 System.out.println("Life IA : " + actionLife);
								 System.out.println(" ");
								 setLifeTan = actionIALife;
								 setLifeEnTan = actionLife;
								 	break;
					            case 1 : 
					            	System.out.println("IA becomes strong");
									System.out.println( "+ attack :  "+ specialPowerEnTan);
									actionIAAttack = setAttackEnTan + specialPowerEnTan;
									System.out.println("Life Point IA :" + setLifeEnTan + " " + "Attack IA : " + actionIAAttack);
									System.out.println("");
									setAttackEnTan = actionIAAttack;
							
					             break;
					            
					            case 2 :
						         	if (battle == 1){
										System.out.println("IA stoped attack of the hero Damger !");
										System.out.println("Life IA : " + setLifeEnTan);
										setLifeEnTan = setLifeEnTan + setAttackTan;
										System.out.println("Life IA recovery : " + setLifeEnTan);
										equationBloquer =  actionAttack - actionAttack + 1;
										System.out.println("Lost point :" + equationBloquer);
										setLifeEnTan = setLifeEnTan - equationBloquer;
										System.out.println("Life IA after Stopted the attack : " + setLifeEnTan);
									}
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
