
/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Matthew Lee
 * @version 11.11.2021
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super (
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }

    /**
     * Overrides the damage method to allow for a 10% chance to do magical damage
     *
     * @return damage
     */
    public int attack()
    {
        int dmg = super.attack();
        int i = Randomizer.nextInt(10);
        if(i == 10) {
            // if the Randomizer generates the number 10 2x damage returned
            dmg = dmg * 2;
        }
        return dmg;
    }
}
