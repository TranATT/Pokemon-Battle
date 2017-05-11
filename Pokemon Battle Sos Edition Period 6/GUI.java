
import javax.swing.*;
import java.awt.event.*;
public class GUI
{
   public GUI()
   {
     frame();
       
    }
   
   public void frame()
   {
     JFrame f = new JFrame("Moves List");
     f.setVisible(true);
     f.setSize(400, 400);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     JPanel p = new JPanel();
     JButton b1 = new JButton("Tackle");
     JButton b2 = new JButton("Heal");
     JButton b3 = new JButton("Headbutt"); 
     JButton b4 = new JButton("Growl"); 
     b1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
       {
          System.out.println("Tackle");
        }
         
     });
     b2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
       {
          System.out.println("Heal");
        }
         
     });
     b3.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
       {
          System.out.println("Headbutt");
        }
         
     });
     b4.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
       {
          System.out.println("Growl");
        }
         
     });
     p.add(b1);
     p.add(b2);
     p.add(b3);
     p.add(b4);
     f.add(p);
   }
   
   
   public static void main(String arg[])
   {
     new GUI(); 
       
    }









}

