package main;

import enemy.EnemyCharacter;
import handle.Handle;
import hero.Character;



public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Character character = new Character();
		final EnemyCharacter enemyCharacter = new EnemyCharacter();
		final Handle handle= new Handle();
		
			character.start();
			enemyCharacter.start2();
			handle.handle();
			

	}

}
