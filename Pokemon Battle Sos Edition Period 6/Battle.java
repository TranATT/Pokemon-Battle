import javax.swing.*;
import java.awt.event.*;
import java.lang.NullPointerException;

public class Battle {
private Pokemon player1;
private Pokemon player2;
private boolean whichPlayer1 = true;

public Battle()
{
        choose();
        choose();

        try {
                System.out.println("Player one is " + player1.getName());
            import javax.swing.*;
import java.awt.event.*;
import java.lang.NullPointerException;

public class Battle {
private Pokemon player1;
private Pokemon player2;
private boolean whichPlayer1 = true;

public Battle()() {
        choose();
        choose();

        try {
                System.out.println("Player one is " + player1.getName());
                System.out.println("Player two is " + player2.getName());
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
        JButton b2 = new JButton("Bamboa");
        JButton b3 = new JButton("Flamiplume");
        JButton b4 = new JButton("Hyedrill");
        b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Sos Boss");
                                        System.out.println("Player 1 = Sos Boss");
                                        whichPlayer1 = false;
                                } else{
                                        player2 = new Pokemon("Sos Boss");
                                        System.out.println("Player 2 = Sos Boss");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }
                });

        b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Bamboa");
                                        System.out.println("Player 1 = Bamboa");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Bamboa");
                                        System.out.println("Player 2 = Bamboa");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }
                });

        b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Flamiplume");
                                        System.out.println("Player 1 = Flamiplume");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Flamiplume");
                                        System.out.println("Player 2 = Flamiplume");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }

                });

        b4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Hyedrill");
                                        System.out.println("Player 1 = Hyedrill");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Hyedrill");
                                        System.out.println("Player 2 = Hyedrill");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }
                });
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.add(p);
}
}
    System.out.println("Player two is " + player2.getName());
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
        JButton b2 = new JButton("Bamboa");
        JButton b3 = new JButton("Flamiplume");
        JButton b4 = new JButton("Hyedrill");
        b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Sos Boss");
                                        System.out.println("Player 1 = Sos Boss");
                                        whichPlayer1 = false;
                                } else{
                                        player2 = new Pokemon("Sos Boss");
                                        System.out.println("Player 2 = Sos Boss");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }
                });

        b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Bamboa");
                                        System.out.println("Player 1 = Bamboa");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Bamboa");
                                        System.out.println("Player 2 = Bamboa");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }
                });

        b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Flamiplume");
                                        System.out.println("Player 1 = Flamiplume");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Flamiplume");
                                        System.out.println("Player 2 = Flamiplume");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }

                });

        b4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(whichPlayer1) {
                                        player1 = new Pokemon("Hyedrill");
                                        System.out.println("Player 1 = Hyedrill");
                                        whichPlayer1 = false;
                                } else {
                                        player2 = new Pokemon("Hyedrill");
                                        System.out.println("Player 2 = Hyedrill");
                                        f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                                }
                                //System.exit(1);
                        }
                });
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.add(p);
}
}
