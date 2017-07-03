package hero;

import java.util.Scanner;

public class Character {

	
	
	public int start(){
   
		Scanner sc = new Scanner(System.in);
System.out.println("Choose your character :");
System.out.println("1 : Dameger");
System.out.println("2 : Healer");
int str = Integer.parseInt(sc.nextLine());
System.out.println("Your choosen : " + str);
		
		Damager d = new Damager();
		Healer h = new Healer();
		int order;
	//	int choice = 2;
	switch (str){
	
		case 1:
			order = d.Dam();
				break;
		case 2:
			order = h.Heal();
				break;
		
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
