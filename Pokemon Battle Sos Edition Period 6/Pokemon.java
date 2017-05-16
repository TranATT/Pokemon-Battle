    import java.util.Random;
    import javax.swing.*;
    import java.awt.event.*;

    public class Pokemon implements PokemonInterface {
     private int HP; //the current HP of the Pokemon
     private Random randomizer; //an object to generate random numbers
     private ArrayList < Object > attacks; //list of possible attacks and their respective damage

     public Pokemon(String name, String attack1, int atack1, int pp1, String attack2, int atack2, int pp2, String attack3, int atack3, int pp3, String attack4, int atack4, int pp4, int health) {
      attacks = new ArrayList < Object > ();
      attacks.add(attack1); //name
      attacks.add(atack1); //damage
      attacks.add(pp1); //pp
      attacks.add(attack2); //name
      attacks.add(atack2); //damage
      attacks.add(pp2); //pp
      attacks.add(attack3); //name
      attacks.add(atack3); //damage
      attacks.add(pp3); //pp         
      attacks.add(attack4); //name
      attacks.add(atack4); //damage
      attacks.add(pp4); //pp

      HP = health; //health

      frame(name);
     }

     public int attackDmg(int attack) {
      if (attacks.get(attack * 3 - 1) != 0) {
       attacks.set(attacks.get(attack * 3 - 1) - 1)
       return Math.random(attacks.get(attack * 3 - 2) * 0.1) + (attacks.get(attack * 3 - 2) - (attacks.get(attack * 3 - 2) * 0.1));
      } else {
       return -1;
      }
     }

     public int attack(String name) {
      JFrame f = new JFrame(name);
      f.setVisible(true);
      f.setSize(400, 400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel p = new JPanel();
      JButton b1 = new JButton(attacks.get(0) + "\n PP " + attacks.get(2));
      JButton b2 = new JButton(attacks.get(3) + "\n PP " + attacks.get(5));
      JButton b3 = new JButton(attacks.get(6) + "\n PP " + attacks.get(8));
      JButton b4 = new JButton(attacks.get(9) + "\n PP " + attacks.get(11));
      b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return attackDmg(1);
       }
      });
      b2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return attackDmg(2);
       }
      });
      b3.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return attackDmg(3);
       }

      });
      b4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return attackDmg(4);
       }
      });

      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      f.add(p);
     }




     //change the current HP of the Pokemon
     public void setHP(int health) {
      HP = health;
     }
     public int getHP() {
      return HP;
     }
    }
