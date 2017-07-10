package hero;

//import java.util.Scanner;

public class Character {
	
//	Scanner sc = new Scanner(System.in);
	//private int str = Integer.parseInt(sc.nextLine());
	
	public int start(int str){
	
		
		Damager d = new Damager();
		Healer h = new Healer();
		Tank t = new Tank();
		
//	@SuppressWarnings("resource")
//	Scanner sc = new Scanner(System.in);
	System.out.println("Choose your character :");
	System.out.println("1 : Dameger");
	System.out.println("2 : Healer");
	System.out.println("3 : Tank");
//	int str = Integer.parseInt(sc.nextLine());
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
	if (str <= 0){
		System.out.println("Character doesn't exist, default character :");
		order = d.Dam();
	}
	return order;
	
	}
	
	public int getAttack() {
		// TODO Auto-generated method stub
		return getAttack();
	}


	public int getLifePoint() {
		// TODO Auto-generated method stub
		return getLifePoint();
	}
	
	public int getSpecialPower() {
		// TODO Auto-generated method stub
		return getSpecialPower();
	}


	public int setSpecialPower(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
