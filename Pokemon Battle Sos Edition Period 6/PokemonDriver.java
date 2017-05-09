import java.util.Random;
public class PokemonDriver
{
  public static void main(String args[])
  {
    Battle battle = new Battle(new Pokemon pokemon1, new Pokemon pokemon2);
    
    Random randomizer = new Random();
    //decide who goes first
    int first = randomizer.nextInt(2);
    
  }
}
