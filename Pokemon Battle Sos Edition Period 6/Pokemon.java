import java.util.Random;
public class Pokemon() {
private int HP;     //the current HP of the Pokemon
private Random randomizer;     //an object to generate random numbers
private boolean growlNextAttack;
public String theName = "pokemon";

public Pokemon(String name)() {
        HP = 99;
        randomizer = new Random();
        growlNextAttack = false;
        theName = name;
}

public int tackle(Pokemon target, int pp)() {
        if (pp > 0) {
                int damage = (int)(6 + (inverseGaussian(1,3) * 5));
                if (growlNextAttack)
                {
                        damage = damage * 2;
                        growlNextAttack = false;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0)
                {
                        System.out.println(target + " is dead.");
                }
                else
                {
                        System.out.println(target + " got tackled by " + theName + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
}
public int heal(Pokemon target, int pp)() {
        if (pp > 0) {
                int healing = (int)(5 + (inverseGaussian(1,3) * 4));
                target.setHP(target.getHP() + healing);
                if (target.getHP() > 99)
                {
                        target.setHP(99);
                        System.out.println(target + " is at full health.");
                }
                else
                {
                        System.out.println(target + " get healed by " + theName + " for " + healing + " HP and now has " + target.getHP() + " HP.");
                }
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
}
public int headbutt(Pokemon target, int pp)() {
        if (pp > 0) {
                int damage = (int)(10 + (inverseGaussian(1,3) * 3));
                if (growlNextAttack)
                {
                        damage = damage * 2;
                        growlNextAttack = false;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0)
                {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else
                {
                        System.out.println(target + " got headbutted by " + theName + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
}
public int growl(Pokemon target, int pp)() {
        if (pp > 0) {
                growlNextAttack = true;
                System.out.println(target + "'s next attack will deal extra damage.");
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
}
public int fireball(Pokemon target, int pp) {
        if (pp > 0) {
                int damage = (int)(3 + (inverseGaussian(1,2) * 12));
                if (growlNextAttack)
                {
                        damage = damage * 2;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0)
                {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else
                {
                        System.out.println(target + " got burned by " + theName + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                growlNextAttack = true;
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
}
public int punch(Pokemon target, int pp) {
        if (pp > 0) {
                int damage = (int)(2 + (inverseGaussian(1,3) * 2));
                if (growlNextAttack)
                {
                        damage = damage * 2;
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0)
                {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else
                {
                        System.out.println(target + " got punched by " + theName + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
}
public int whip(Pokemon target, int pp) {
        if (pp > 0) {
                int damage = (int)(10 + (inverseGaussian(1,4) * 2));
                if (growlNextAttack)
                {
                        damage = (int)(damage * 1.3);
                }
                target.setHP(target.getHP() - damage);
                if (target.getHP() <= 0)
                {
                        target.setHP(0);
                        System.out.println(target + " is dead.");
                }
                else
                {
                        System.out.println(target + " got whipped by " + theName + "and took " + damage + " damage and has " + target.getHP() + " health remaining.");
                }
                int ppAfter = pp - 1;
                System.out.println("Tackle can now be used" + ppAfter + "more times");
                return ppAfter;
        }
        return 0;
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
public void setHP(int health)() {
        HP = health;
}
public int getHP()() {
        return HP;
}
public String getName()() {
        return theName;
}
}
