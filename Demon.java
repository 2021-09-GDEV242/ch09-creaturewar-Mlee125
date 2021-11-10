
/**
 * The Demon class
 * Is a type of creature that isn't created directly 
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [30/10]
 * 
 * @author Matthew Lee
 * @version 11.9.2021
 */
public class Demon extends Creature 
{
    /**
     * Constructor for objects of class Demon
     * Creates a creature with normal stats
     */
    public Demon()
    {
        super();
    }

    /**
     * Creates a Demon with stats given from its subtypes
     */
    public Demon(int hp, int str)
    {
        super(hp, str);
    }
    
    /**
     * Overrides the attack method which allows the demon a 5% chance to deal an additional 50 Damage
     * @return damage
     */
    public int attack()
    {
        int dmg = super.attack();
        int i = Randomizer.nextInt(20);
        if(i == 20) {
            dmg = dmg + 50;
        }
        return dmg;
    }
}
