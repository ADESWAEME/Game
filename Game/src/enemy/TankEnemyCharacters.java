package enemy;

//import java.util.Scanner;

//import handle.Handle;

public class TankEnemyCharacters {

	public int tankEnemyCharacters(int str){
		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your enemy :");
		System.out.println("1 : Enemy Damager");
		System.out.println("2 : Enemy Healer");
		System.out.println("3 : Enemy Tank");
	//	int str = Integer.parseInt(sc.nextLine());
		System.out.println("Your choosen : " + str);
		System.out.println("");
		

		EnemyDamager eD = new EnemyDamager();
		EnemyHealer eH = new EnemyHealer();
		EnemyTank eT = new EnemyTank();
		
		//final Handle handle= new Handle();
		
	switch (str){
	
		case 1:
		eD.EnDam();
		//handle.tanAgainstDamager();
			
				break;
		case 2:
		eH.EnHeal();
		//handle.tanAgainstHealer();
			
				break;
		case 3 :
		eT.EnTan();
		//handle.tanAgainstTank();
			
			
		default :
		eD.EnDam();
		//handle.handle();
			break;
	}
	return str;
		
		}
	
}
