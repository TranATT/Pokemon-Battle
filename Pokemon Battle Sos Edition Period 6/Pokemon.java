
public class Pokemon implements PokemonInterface
{
    private int HP; //the current HP of the Pokemon
    private ArrayList <Object> attacks; //list of possible attacks and their respective damage
    /* private int attack1Damage;
    private String atStrtack1Name;
    private int attack2Damage;
    private String attack2Name;
    private int attack3Damage;
    private String attack3Name;
    private int attack4Damage;
    private String attack4Name; */
    
    public Pokemon()
    {
        attacks = new ArrayList <Object> ();
        attacks.add("a1"); //name
        attacks.add(1); //damage
        attacks.add("a2");
        attacks.add(2);
        attacks.add("a3");
        attacks.add(3);
        attacks.add("a4");
        attacks.add(4);
        HP = 99;
        /* attack1Damage = 1;
        attack2Damage = 2;
        attack3Damage = 3;
        attack4Damage = 4;
        attack1Name = "name";
        attack2Name = "a name";
        attack3Name = "the name";
        attack4Name = "my name"; */
        
    }
    
    public int attack()
    {
        //return attack number depending on which button is used
    }
    
    /** 
    *  change the current HP of the Pokemon
    */
    public void setHP(int health) 
    {
        HP = health;
    }
    public int getHP()
    {
        return HP;
    }
}
