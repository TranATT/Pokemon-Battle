
public class Pokemon implements PokemonInterface {
    private int HP; //the current HP of the Pokemon
    private ArrayList <Object> attacks; //list of possible attacks and their respective damage
    
    public Pokemon(String attack1, int atack1, String attack2, int atack2, String attack3, int atack3, String attack4, int atack4, int health) {
        attacks = new ArrayList <Object> ();
        attacks.add(attack1); //name
        attacks.add(atack1);  //damage
        attacks.add(attack2); //name
        attacks.add(atack2);  //damage
        attacks.add(attack3); //name
        attacks.add(atack3);  //damage
        attacks.add(attack4); //name
        attacks.add(atack4);  //damage
        HP = health;
        
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
