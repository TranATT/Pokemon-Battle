
public class Pokemon implements PokemonInterface
{
    private int HP;
    private int attack1Damage;
    private String attack1Name;
    private int attack2Damage;
    private String attack2Name;
    private int attack3Damage;
    private String attack3Name;
    private int attack4Damage;
    private String attack4Name;
    
    public Pokemon()
    {
        HP = 99;
        attack1Damage = 1;
        attack2Damage = 2;
        attack3Damage = 3;
        attack4Damage = 4;
        attack1Name = "name";
        attack2Name = "a name";
        attack3Name = "the name";
        attack4Name = "my name";
        
    }
    
    public int attack () {
    //buttons + if-return statement
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
