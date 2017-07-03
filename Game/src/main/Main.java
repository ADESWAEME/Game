package main;

import enemy.EnemyCharacter;
import hero.Character;



public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//System.out.println("lorem ispum vodka russia");
//System.out.println("Russian version of hello world");
//String str = sc.nextLine();
//System.out.println("Vous avez tapez : " + str);

		final Character character = new Character();
		final EnemyCharacter enemyCharacter = new EnemyCharacter();
			character.start();
			enemyCharacter.start2();

	}

}
