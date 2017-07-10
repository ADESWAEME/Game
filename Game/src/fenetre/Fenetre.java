package fenetre;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import enemy.DamagerEnemyCharacters;
import enemy.HealerEnemyCharacters;
import enemy.TankEnemyCharacters;
import handle.Handle;
import hero.Character;

public class Fenetre extends JFrame {
		 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton damager = new JButton("Damager");
    private JButton healer = new JButton("Healer");
    private JButton tank = new JButton("Tank");
    
    private JButton damEnemyDamager = new JButton("Enemy Dameger");
    private JButton damEnemyHealer = new JButton("Enemy Healer");
    private JButton damEnemyTank = new JButton("Enemy Tank");
    
    private JButton healEnemyDamager = new JButton("Enemy Dameger");
    private JButton healEnemyHealer = new JButton("Enemy Healer");
    private JButton healEnemyTank = new JButton("Enemy Tank");
    
    private JButton tanEnemyDamager = new JButton("Enemy Dameger");
    private JButton tanEnemyHealer = new JButton("Enemy Healer");
    private JButton tanEnemyTank = new JButton("Enemy Tank");
    
    private JButton dVsD = new JButton("Start ");
    private JButton dVsH = new JButton("Start");
    private JButton dVsT = new JButton("Start");
    
    private JButton hVsD = new JButton("Start ");
    private JButton hVsH = new JButton("Start");
    private JButton hVsT = new JButton("Start");
    
    private JButton tVsD = new JButton("Start ");
    private JButton tVsH = new JButton("Start");
    private JButton tVsT = new JButton("Start");
    
    private JButton exit = new JButton("Exit");
  
	@SuppressWarnings("static-access")
	
	public void fenetre() {
	
	    JFrame fenetre = new JFrame();
	    JPanel pan = new JPanel(); 
	   
	    
	    //title 
	    fenetre.setTitle("Game");
	    
	    //Windows size : 400 pixels large and 100 pixels height
	    fenetre.setSize(610, 350);
	    
	    //location center
	    fenetre.setLocationRelativeTo(null);
	    
	    //exit
	    fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
	    
	    
	    damager.setBackground(Color.YELLOW);
	    JLabel label = new JLabel("Choose your character :");
	    pan.add(label);
		pan.add(damager);
		damager.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("lol");
				final Character character = new Character();
				character.start(1);
			}
			
		});
		
		healer.setBackground(Color.CYAN);
		pan.add(healer);
		healer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("lol");
				final Character character = new Character();
				character.start(1);
			}
			
		});
		
		
		tank.setBackground(Color.ORANGE);
		pan.add(tank);
		tank.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("lol");
				final Character character = new Character();
				character.start(3);
			}
			
		});
		
		
		damEnemyDamager.setBackground(Color.YELLOW);
		damEnemyHealer.setBackground(Color.YELLOW);
		damEnemyTank.setBackground(Color.YELLOW);
		JLabel damChooseEnemy = new JLabel("Choose your enemy if your hero is Dam :");
		pan.add(damChooseEnemy);
		pan.add(damEnemyDamager);
		damEnemyDamager.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy damager");
				final DamagerEnemyCharacters damagerEnC = new DamagerEnemyCharacters();
				damagerEnC.damagerEnemyCharacters(1);
				fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
			}
			
		});
		
	
		pan.add(damEnemyHealer);
		damEnemyHealer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy healer");
				final DamagerEnemyCharacters damagerEnC = new DamagerEnemyCharacters();
				damagerEnC.damagerEnemyCharacters(2); 
				  fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
				    
			}
		});
		pan.add(damEnemyTank);
		damEnemyTank.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy tank");
				final DamagerEnemyCharacters damagerEnC = new DamagerEnemyCharacters();
				damagerEnC.damagerEnemyCharacters(3);
				  fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
				    
				}
			});
		
		
		
		healEnemyDamager.setBackground(Color.CYAN);
		healEnemyHealer.setBackground(Color.CYAN);
		healEnemyTank.setBackground(Color.CYAN);
		JLabel healChooseEnemy = new JLabel("Choose your enemy if your hero is Heal :");
		pan.add(healChooseEnemy);
		pan.add(healEnemyDamager);
		healEnemyDamager.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy damager");
				final HealerEnemyCharacters healerEnC = new HealerEnemyCharacters();
				healerEnC.healerEnemyCharacters(1); 
				fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
			}
			
		});
		
	
		pan.add(healEnemyHealer);
		healEnemyHealer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy healer");
				final DamagerEnemyCharacters healerEnC = new DamagerEnemyCharacters();
				healerEnC.damagerEnemyCharacters(2); 
				  fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
				    
			}
		});
		pan.add(healEnemyTank);
		healEnemyTank.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy tank");
				final HealerEnemyCharacters healerEnC = new HealerEnemyCharacters();
				healerEnC.healerEnemyCharacters(3); 
				  fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
				    
				}
			});
		
		
		tanEnemyDamager.setBackground(Color.ORANGE);
		tanEnemyHealer.setBackground(Color.ORANGE);
		tanEnemyTank.setBackground(Color.ORANGE);
		JLabel tanChooseEnemy = new JLabel("Choose your enemy if your hero is Tan :");
		pan.add(tanChooseEnemy);
		pan.add(tanEnemyDamager);
		tanEnemyDamager.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy damager");
				final TankEnemyCharacters tanEnC = new TankEnemyCharacters();
				tanEnC.tankEnemyCharacters(1);
				fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
			}
			
		});
		
	
		pan.add(tanEnemyHealer);
		tanEnemyHealer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy healer");
				final TankEnemyCharacters tanEnC = new TankEnemyCharacters();
				tanEnC.tankEnemyCharacters(2);
				  fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
				    
			}
		});
		pan.add(tanEnemyTank);
		tanEnemyTank.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("enemy tank");
				final TankEnemyCharacters tanEnC = new TankEnemyCharacters();
				tanEnC.tankEnemyCharacters(3); 
				  fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
				    
				}
			});
		
		dVsD.setBackground(Color.YELLOW);
		dVsH.setBackground(Color.YELLOW);
		dVsT.setBackground(Color.YELLOW);
		JLabel damVsDam = new JLabel("Hero Damager vs Enemy Damager :");
		pan.add(damVsDam);
		pan.add(dVsD);
		dVsD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.handle();
			}
		});
		
		JLabel damVsHealer = new JLabel("Hero Damager vs Enemy Healer :");
		pan.add(damVsHealer);
		pan.add(dVsH);
		dVsH.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.damAgainstHealer();
			}
		});
		
		JLabel damVsTank = new JLabel("Hero Damager vs Enemy Tank :");
		pan.add(damVsTank);
		pan.add(dVsT);
		dVsT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.damAgainstTank();
			}
		});
		
		
		hVsD.setBackground(Color.CYAN);
		hVsH.setBackground(Color.CYAN);
		hVsT.setBackground(Color.CYAN);
		JLabel healVsDam = new JLabel("Hero Healer vs Enemy Damager :");
		pan.add(healVsDam);
		pan.add(hVsD);
		hVsD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.healAgainstDamager();
			}
		});
		
		JLabel healVsHealer = new JLabel("Hero Healer vs Enemy Healer :");
		pan.add(healVsHealer);
		pan.add(hVsH);
		hVsH.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.healAgainstHealer();
			}
		});
		
		JLabel healVsTank = new JLabel("Hero Healer vs Enemy Tank :");
		pan.add(healVsTank);
		pan.add(hVsT);
		hVsT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.healAgainstTank();
			}
		});
		
		
		
		
		tVsD.setBackground(Color.ORANGE);
		tVsH.setBackground(Color.ORANGE);
		tVsT.setBackground(Color.ORANGE);
		JLabel tanVsDam = new JLabel("Hero Healer vs Enemy Damager :");
		pan.add(tanVsDam);
		pan.add(tVsD);
		tVsD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.tanAgainstDamager();
			}
		});
		
		JLabel tanVsHealer = new JLabel("Hero Healer vs Enemy Healer :");
		pan.add(tanVsHealer);
		pan.add(tVsH);
		tVsH.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.tanAgainstHealer();
			}
		});
		
		JLabel tanVsTank = new JLabel("Hero Healer vs Enemy Tank :");
		pan.add(tanVsTank);
		pan.add(tVsT);
		tVsT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				final Handle handle= new Handle();
				handle.tanAgainstTank();
			}
		});
		
		JLabel getOut = new JLabel("Out of the game");
		pan.add(getOut);
		pan.add(exit);
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
			
		});
	    fenetre.add(pan);
	   
	    fenetre.setVisible(true);

		
	  }  
	
}
