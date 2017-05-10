import java.util.Random;
public class Pokemon implements PokemonInterface {
    private int HP; //the current HP of the Pokemon
    private Random randomizer; //an object to generate random numbers
    
    public Pokemon() 
    {
        HP = 99;
        randomizer = new Random();
    }
    
    public int attack(Pokemon target)
    {
        int damage = randomizer.nextInt(/* the attack's maximum power possible */);
        target.setHP(target.getHP() - damage);
        if (target.getHP() <= 0)
        {
            /* do something to indicate that the target is dead */
            target.setHP(0);
        }
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
}
