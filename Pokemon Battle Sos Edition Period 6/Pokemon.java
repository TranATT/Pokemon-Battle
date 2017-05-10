import java.util.Random;
public class Pokemon implements PokemonInterface {
    private int HP; //the current HP of the Pokemon
    private Random randomizer;
    public Pokemon() 
    {
        HP = health;
        randomizer = new Random();
    }
    
    public int attack(Pokemon target)
    {
        int damage = randomizer.nextInt(/* the attack's maximum power possible */);
        target.setHP(target.getHP() - damage);
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
