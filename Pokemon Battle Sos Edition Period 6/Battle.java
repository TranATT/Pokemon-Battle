    public class Battle {
     private Pokemon player1;
     private Pokemon player2;

     public Battle() {
      String pokemon1 = choose();
      String pokemon2 = choose();
      if (pokemon1.equals("Tigair") || pokemon2.equals("Tigair")) {
       if (pokemon1.equals("Tigair"))
        player1 = new Pokemon("Tigair")
       if (pokemon2.equals("Tigair"))
        player1 = new Pokemon("Tigair")
      }
     }

     public String choose() {
      JFrame f = new JFrame(Pokemon);
      f.setVisible(true);
      f.setSize(400, 400);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel p = new JPanel();
      //http://www.fantasynamegenerators.com/pokemon-names.php
      JButton b1 = new JButton("Tigair");
      JButton b2 = new JButton("Bamboa");
      JButton b3 = new JButton("Flamiplume");
      JButton b4 = new JButton("Hyedrill");
      b1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return "Tigair";
       }
      });
      b2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return "Bamboa";
       }
      });
      b3.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return "Flamiplume";
       }

      });
      b4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        return "Hyedrill";
       }
      });

      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      f.add(p);
     }
    }
