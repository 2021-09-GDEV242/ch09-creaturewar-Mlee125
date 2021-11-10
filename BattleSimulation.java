import java.util.ArrayList;
/**
 * An overly simplified large battle simulator 
 * Pits two large armies against each other to see who will win!!!
 *
 * @author Matthew Lee
 * @version 11.9.2021
 */
public class BattleSimulation
{
    // Adds an ArrayList for each army
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;
    //Adds the size and index counter for each army
    private int armyOneSize;
    private int armyOneIndex = 0;
    private int armyTwoSize;
    private int armyTwoIndex = 0;
    // Adds the min and max size for each army
    private int armyOneMaxSize = 100;
    private int armyOneMinSize = 100;
    private int armyTwoMaxSize = 50;
    private int armyTwoMinSize = 30;

    /**
     * Constructor for objects of class BattleSimulation
     */
    public BattleSimulation()
    {
        //Initializes the army ArrayLists
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
        // Creates the size of each army
        armyOneSize = Randomizer.nextInt((armyOneMaxSize - armyOneMinSize) + armyOneMinSize);
        armyTwoSize = Randomizer.nextInt((armyTwoMaxSize - armyTwoMinSize) + armyTwoMinSize);
        
        for(int i = 0; i < armyOneSize; i++) {
            armyOne.add(addArmyOne());
        }
        for(int i = 0; i < armyTwoSize; i++) {
            armyTwo.add(addArmyTwo());
        }
        // Haven't added the fight method yet
        // fight();
    }

    /**
     * Creates a random creature from the subclasses to add to armyOne
     * ArmyOne will contain a large amount of humans and elfs
     * @return soldier
     */
    public Creature addArmyOne()
    {
        Creature soldier;
        if(Randomizer.nextInt(10) <=6) {
            //If random number is 1-6 add a human soldier
            soldier = new Human();
        }
        else {
            //If random number is 7-8 or 9-10 add a elf soldier            
            soldier = new Elf();
        }
        return soldier;
    }
    
    /**
     * Creates a random creature from the subclasses to add to armyTwo
     * ArmyTwo will contain a large amount of humans,cyberdemons and balrogs
     * @return soldier
     */
    public Creature addArmyTwo()
    {
        Creature soldier;
        if(Randomizer.nextInt(25) <= 18) {
            //If random number is 1-18 add a human soldier
            soldier = new Human();
        }
        else if (Randomizer.nextInt(25) <= 24) {
            //If random number is 19-24 add a cyberdemon soldier
            soldier = new CyberDemon();
        }
        else {
            //If random number is 25 add a balrog soldier
            soldier = new Balrog();
        }
        return soldier;
    }
}
