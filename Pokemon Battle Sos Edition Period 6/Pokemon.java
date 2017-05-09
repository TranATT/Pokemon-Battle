
public class Pokemon implements PokemonInterface
{
    private int HP;
    private ArrayList <Object> attacks;
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
         attacks.add("a1");
        attacks.add(1);
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
    
    public int attack () {
    //buttons + return attack number
    }
    
    public void setHP(int newHP)
    {
        HP = newHP;
    }
    public int getHP()
    {
        return HP;
    }
}
