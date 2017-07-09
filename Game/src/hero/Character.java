package hero;

import java.util.Scanner;

public class Character {
	

	public int start(){
	
		
		Damager d = new Damager();
		Healer h = new Healer();
		Tank t = new Tank();
		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose your character :");
	System.out.println("1 : Dameger");
	System.out.println("2 : Healer");
	System.out.println("3 : Tank");
	int str = Integer.parseInt(sc.nextLine());
	System.out.println("Your choosen : " + str);
		
	int order;
		
	switch (str){
	
		case 1:
			order = d.Dam();
				break;
		case 2:
			order = h.Heal();
				break;
		case 3 :
			order = t.Tan();
				break;
			
		default :
			order = 1;
				
	}
	if (str >= 4){
		System.out.println("Character doesn't exist, default character :");
		order = d.Dam();
	}
	
	return order;
	
	}
	
	
	//method lifePoint
	public int lifePoint(){
	
//		final Damager lPD = new Damager();
//		final Healer lPH = new Healer();
//		final Tank lPT = new Tank();
//		
//		
//		if (this.start() == 1){
//			lPD.getLifePointDam();	
//		}
//		
//		if (this.start() == 2){
//			lPH.getLifePointHeal();
//		}
//	
//		if (this.start() == 3){
//			lPT.getLifePointTan();
//		}
	
		return lifePoint();

	}
	
	
	//method attack
	public int attack(){
		return attack();
		
	}
	
	//method specialPower
	public int specialPower(){
		
		return specialPower();
	}
	

}
