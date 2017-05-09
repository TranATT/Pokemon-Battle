
public class Pokemon implements PokemonInterface {
    private int HP; //the current HP of the Pokemon
    private ArrayList <Object> attacks; //list of possible attacks and their respective damage
    
    public Pokemon() {
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
        
    }
    
    public int attack() {
        //return attack number depending on which button is used
    }
    

    //change the current HP of the Pokemon
    public void setHP(int health) {
        HP = health;
    }
    public int getHP() {
        return HP;
    }
}
