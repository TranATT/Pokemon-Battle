import java.util.*;

public class Pokemon {
private int HP;     //the current HP of the Pokemon
private Random randomizer;     //an object to generate random numbers
private boolean growlNextAttack;
private ArrayList <Integer> pp = new ArrayList <Integer> ();
private String name = "";

public Pokemon(String theName) {
        randomizer = new Random();
        growlNextAttack = false;
        name = theName;
        if (name.equals("Sos Boss")) {
                HP = 100;
                pp.add(6); pp.add(0); pp.add(5); pp.add(0); pp.add(3); pp.add(3); pp.add(0);
        } else if (name.equals("Andy")) {
                HP = 100;
                pp.add(6); pp.add(5); pp.add(5); pp.add(4); pp.add(0); pp.add(0); pp.add(0);
        } else if (name.equals("Lion King")) {
                HP = 100;
                pp.add(6); pp.add(0); pp.add(5); pp.add(0); pp.add(3); pp.add(10); pp.add(0);
        } else if (name.equals("Liam")) {
                HP = 100;
                pp.add(6); pp.add(0); pp.add(0); pp.add(4); pp.add(0); pp.add(10); pp.add(3);
        } else if (name.equals("Nero")) {
                HP = 100;
                pp.add(6); pp.add(5); pp.add(0); pp.add(0); pp.add(3); pp.add(10); pp.add(0);
        } else if (name.equals("Flamiplume")) {
                HP = 100;
                pp.add(6); pp.add(0); pp.add(5); pp.add(4); pp.add(3); pp.add(0); pp.add(0);
        } else if (name.equals("Rico")) {
                HP = 100;
                pp.add(6); pp.add(5); pp.add(5); pp.add(0); pp.add(3); pp.add(0); pp.add(0);
        }

}

//tackle, heal, headbutt, growl, fireball, punch, whip

public void tackle(Pokemon target) {
        //6
        if (pp.get(0) > 0) {
                int damage = (int)(6 + (inverseGaussian(1,3) * 5));
                if (growlNextAttack) {
                        damage = damage * 2;
                        growlNextAttack = false;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0) {
                        System.out.println(target + " is dead.");
                }
                else {
                        System.out.println(target + " got tackled by " + name + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                pp.set(0, pp.get(0) - 1);
                System.out.println("Tackle can now be used" + pp.get(0) + "more times");
        }
}
public void heal(Pokemon target) {
        //5
        if (pp.get(1) > 0) {
                int healing = (int)(5 + (inverseGaussian(1,3) * 4));
                target.setHP(target.getHP() + healing);
                if (target.getHP() > 99) {
                        target.setHP(99);
                        System.out.println(target + " is at full health.");
                }
                else {
                        System.out.println(target + " get healed by " + name + " for " + healing + " HP and now has " + target.getHP() + " HP.");
                }
                pp.set(1, pp.get(1) - 1);
                System.out.println("Tackle can now be used" + pp.get(1) + "more times");
        }
}
public void headbutt(Pokemon target) {
        //5
        if (pp.get(2) > 0) {
                int damage = (int)(10 + (inverseGaussian(1,3) * 3));
                if (growlNextAttack) {
                        damage = damage * 2;
                        growlNextAttack = false;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0) {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else {
                        System.out.println(target + " got headbutted by " + name + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                pp.set(2, pp.get(2) - 1);
                System.out.println("Tackle can now be used" + pp.get(1) + "more times");
        }
}
public void growl() {
        //4
        if (pp.get(3) > 0) {
                growlNextAttack = true;
                System.out.println(name + "'s next attack will deal extra damage.");
                pp.set(3, pp.get(3) - 1);
                System.out.println("Tackle can now be used" + pp.get(1) + "more times");
        }
}
public void fireball(Pokemon target) {
        //3
        if (pp.get(4) > 0) {
                int damage = (int)(3 + (inverseGaussian(1,2) * 12));
                if (growlNextAttack) {
                        damage = damage * 2;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0) {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else {
                        System.out.println(target + " got burned by " + name + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                growlNextAttack = true;
                pp.set(4, pp.get(4) - 1);
                System.out.println("Tackle can now be used" + pp.get(1) + "more times");
        }
}
public void punch(Pokemon target) {
        //10
        if (pp.get(5) > 0) {
                int damage = (int)(2 + (inverseGaussian(1,3) * 2));
                if (growlNextAttack) {
                        damage = damage * 2;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0) {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else {
                        System.out.println(target + " got punched by " + name + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                pp.set(5, pp.get(5) - 1);
                System.out.println("Tackle can now be used" + pp.get(1) + "more times");
        }
}
public void whip(Pokemon target) {
        //3
        if (pp.get(6) > 0) {
                int damage = (int)(10 + (inverseGaussian(1,4) * 2));
                if (growlNextAttack) {
                        damage = (int)(damage * 1.3);
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0) {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else {
                        System.out.println(target + " got whipped by " + name + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                pp.set(6, pp.get(6) - 1);
                System.out.println("Tackle can now be used" + pp.get(1) + "more times");
        }
}

public double inverseGaussian(double mu, double lambda) {
        //default = 1, 2
        double v = randomizer.nextGaussian();  // sample from a normal distribution with a mean of 0 and 1 standard deviation
        double y = v*v;
        double x = mu + (mu*mu*y)/(2*lambda) - (mu/(2*lambda)) * Math.sqrt(4*mu*lambda*y + mu*mu*y*y);
        double test = randomizer.nextDouble(); // sample from a uniform distribution between 0 and 1
        if (test <= (mu)/(mu + x))
                return x;
        else
                return (mu*mu)/x;
}


//change the current HP of the Pokemon
public void setHP(int health) {
        HP = health;
}
public int getHP() {
        return HP;
}
public String getName() {
        return name;
}
}
