
/**
 * The Balrog class
 * Is a Demon that can attack twice each round
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * 
 * @author Matthew Lee
 * @version 11.9.2021
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
            );
    }

    /**
     * Overrides the attack method which will allow the Balrog to attack twice per round
     * @return damage
     */
    public int attack()
    {
        int dmg = super.attack();
        dmg = dmg + super.attack();
        return dmg;
    }
}
