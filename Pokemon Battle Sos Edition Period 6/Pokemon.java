import java.util.Random;
public class Pokemon
{
    private int HP; //the current HP of the Pokemon
    private Random randomizer; //an object to generate random numbers
    private boolean growlNextAttack;
    public String theName;
    
    public Pokemon(String name) 
    {
        HP = 99;
        randomizer = new Random();
        growlNextAttack = false;
        theName = name;
    }
    
    public void tackle(Pokemon target)
    {
        int damage = 6 + randomizer.nextInt(5);
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
            System.out.println(target + " took " + damage + " damage and has "
                               + target.getHP() + " health remaining.");
        }
    }
    public void heal(Pokemon target)
    {
        int healing = 5 + randomizer.nextInt(4);
        target.setHP(target.getHP() + healing);
        if (target.getHP() > 99)
        {
            target.setHP(99);
            System.out.println(target + " at full health.");
        }
        else
        {
            System.out.println(target + " healed for " + healing + " HP and now has " 
                               + target.getHP() + " HP.");
        }
    }
    public void headbutt(Pokemon target)
    {
        int damage = 10 + randomizer.nextInt(3);
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
            System.out.println(target + " took " + damage + " damage and has "
                               + target.getHP() + " health remaining.");
        }
    }
    public void growl(Pokemon target)
    {
        growlNextAttack = true;
        System.out.println(target + "'s next attack will deal extra damage.");
    }
    
    

    //change the current HP of the Pokemon
    public void setHP(int health)
    {
        HP = health;
    }
    public int getHP()
    {
        return HP;
    }
    public String getName()
    {
        return theName;
    }
}
