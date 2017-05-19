import javax.swing.*;
import java.awt.event.*;
    public class Battle {
     private Pokemon player1;
     private Pokemon player2;
     private String chosenName;
     public Battle() {
      choose();
      player1  = new Pokemon(chosenName);
      choose();
      player2  = new Pokemon(chosenName);
      
      System.out.println("Player one is " + player1.getName());
      System.out.println("Player two is " + player2.getName());
     }

     public void choose() {
      JFrame f = new JFrame("Pokemon Selection");
      f.setVisible(true);
      f.setSize(400, 400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel p = new JPanel();
      
      //http://www.fantasynamegenerators.com/pokemon-names.php
      JButton b1 = new JButton("Sos Boss");
      JButton b2 = new JButton("Bamboa");
      JButton b3 = new JButton("Flamiplume");
      JButton b4 = new JButton("Hyedrill");
      b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        chosenName = "Sos Boss";
        System.out.println("Sos Boss has been chosen.");
        
        //System.exit(1);
       }
      });
      
      b2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        chosenName = "Bamboa";
        System.out.println("Bamboa has been chosen.");
        
           //     System.exit(1);
       }
      });
      
      b3.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        chosenName = "Flamiplume";
        System.out.println("Flamiplume has been chosen.");
        
        //System.exit(1);
       }

      });
      
      b4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        chosenName = "Hyedrill";
        System.out.println("Hyedrill has been chosen.");
        
           //     System.exit(1);
       }
      });
      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      f.add(p);
     }
    }
