package hero;

import java.util.Scanner;

public class Character {

	
	
	public int start(){
   
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
System.out.println("Choose your character :");
System.out.println("1 : Dameger");
System.out.println("2 : Healer");
System.out.println("3 : Tank");
int str = Integer.parseInt(sc.nextLine());
System.out.println("Your choosen : " + str);
		
		Damager d = new Damager();
		Healer h = new Healer();
		Tank t = new Tank();
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
			
		default :
			order = 1;
			break;
	}
	return order;
	
	}
	//method lifePoint
	public void lifePoint(){
		
	};
	
	//method attack
	public void attack(){
		
	};
	
	//method specialPower
	public void specialPower(){
		
	};
	
}
