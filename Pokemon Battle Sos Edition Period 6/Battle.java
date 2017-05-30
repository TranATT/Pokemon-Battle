import javax.swing.*;
import java.awt.event.*;
import java.lang.NullPointerException;
import java.util.*;

public class Battle {
private Pokemon player1;
private Pokemon player2;
private boolean whichPlayer1 = true;
private boolean turn1 = true;
//tackle, heal, headbutt, growl, fireball, punch, whip
//pp - 6      5     5         4      3         10     3

public static void main(String[] args){
        Battle first = new Battle();
}

public Battle()
{
        choose();
        choose();

        try {
                System.out.println("Player one is " + player1.getName());
                System.out.println("Player two is " + player2.getName());
                while (player1.getHP() > 0 || player2.getHP() > 0) {
                        if (turn1) {
                                move(player1, player2);
                        } else {
                                move(player2, player1);
                        }
                }

        } catch (NullPointerException e) {
        }


}

public void choose() {
        final JFrame f = new JFrame("Pokemon Selection");
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();

        //http://www.fantasynamegenerators.com/pokemon-names.php
        JButton b1 = new JButton("Sos Boss");
        JButton b2 = new JButton("Andy");
        JButton b3 = new JButton("Lion King");
        JButton b4 = new JButton("Liam");
        JButton b5 = new JButton("Nero");
        JButton b6 = new JButton("Flamiplume");
        JButton b7 = new JButton("Rico");
        b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Sos Boss");
                                        System.out.println("Player 1 = Sos Boss");
                                        whichPlayer1 = false;
                                } else{
                                        player2 = new Pokemon("Sos Boss");
                                        System.out.println("Player 2 = Sos Boss");
                                }
                                //System.exit(1);
                        }
                });

        b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Andy");
                                        System.out.println("Player 1 = Andy");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Andy");
                                        System.out.println("Player 2 = Andy");

                                }
                                //System.exit(1);
                        }
                });

        b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Lion King");
                                        System.out.println("Player 1 = Lion King");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Lion King");
                                        System.out.println("Player 2 = Lion King");
                                }
                                //System.exit(1);
                        }

                });

        b4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Liam");
                                        System.out.println("Player 1 = Liam");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Liam");
                                        System.out.println("Player 2 = Liam");
                                }
                                //System.exit(1);
                        }
                });

        b5.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Nero");
                                        System.out.println("Player 1 = Nero");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Nero");
                                        System.out.println("Player 2 = Nero");
                                }
                                //System.exit(1);
                        }
                });

        b6.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Flamiplume");
                                        System.out.println("Player 1 = Flamiplume");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Flamiplume");
                                        System.out.println("Player 2 = Flamiplume");
                                }
                                //System.exit(1);
                        }
                });

        b7.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Rico");
                                        System.out.println("Player 1 = Rico");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Rico");
                                        System.out.println("Player 2 = Rico");
                                }
                                //System.exit(1);
                        }
                });
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        f.add(p);
}

public void move(Pokemon player, Pokemon target) {
        final JFrame moveset = new JFrame("Pokemon Selection");
        moveset.setVisible(true);
        moveset.setSize(400, 400);
        moveset.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel moveWind = new JPanel();

        JButton tackle = new JButton("tackle");
        JButton heal = new JButton("heal");
        JButton headbutt = new JButton("headbutt");
        JButton growl = new JButton("growl");
        JButton fireball = new JButton("fireball");
        JButton punch = new JButton("punch");
        JButton whip = new JButton("whip");
        tackle.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.tackle(target);
                                turn1 = !turn1;
                        }
                });

        heal.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.heal(player);
                                turn1 = !turn1;
                        }
                });

        headbutt.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.headbutt(target);
                                turn1 = !turn1;

                        }
                });

        growl.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.growl();
                                turn1 = !turn1;

                        }
                });

        fireball.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.fireball(target);
                                turn1 = !turn1;

                        }
                });

        punch.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.punch(target);
                                turn1 = !turn1;

                        }
                });

        whip.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                player.whip(target);
                                turn1 = !turn1;
                        }
                });


        if (player.getName().equals("Sos Boss")) {
                moveWind.add(tackle);
                moveWind.add(headbutt);
                moveWind.add(fireball);
                moveWind.add(punch);
        }
        if (player.getName().equals("Andy")) {
                moveWind.add(tackle);
                moveWind.add(heal);
                moveWind.add(headbutt);
                moveWind.add(growl);
        }
        if (player.getName().equals("Lion King")) {
                moveWind.add(tackle);
                moveWind.add(headbutt);
                moveWind.add(fireball);
                moveWind.add(punch);
        }
        if (player.getName().equals("Liam")) {
                moveWind.add(tackle);
                moveWind.add(growl);
                moveWind.add(punch);
                moveWind.add(whip);
        }
        if (player.getName().equals("Nero")) {
                moveWind.add(tackle);
                moveWind.add(heal);
                moveWind.add(fireball);
                moveWind.add(punch);
        }
        if (player.getName().equals("Flamiplume")) {
                moveWind.add(tackle);
                moveWind.add(headbutt);
                moveWind.add(fireball);
                moveWind.add(growl);
        }
        if (player.getName().equals("Rico")) {
                moveWind.add(tackle);
                moveWind.add(heal);
                moveWind.add(fireball);
                moveWind.add(headbutt);
        }
        moveset.add(moveWind);
}
}
