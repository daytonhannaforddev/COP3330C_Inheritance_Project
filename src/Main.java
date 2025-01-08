// Dayton Hannaford - COP-3330C-14319 - 09/14/24
// Program description: Create 1 parent and 2 child classes that inherit attributes from the parent. Parent must have a public interface and the child classes must override public interface methods.


public class Main {
    public static void main(String[] args) {
// Sets up the 5 fighters both villain and hero's.
        Fighter villain1 = new Villain("Galactus", 95, 100, 9999);
        Fighter hero1 = new Hero("Spawn", 100, 50, 125);
        Fighter hero2 = new Hero("Ironman", 150, 70, 150);
        Fighter hero3 = new Hero("Spiderman", 110, 60, 100);
        Fighter hero4 = new Hero("Antman", 110, 80, 110);

// An array of fighters to hold a reference to all fighters
        Fighter[] fighters = new Fighter[]{hero1, hero2, hero3, hero4};
        System.out.println("                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     Starting Health");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");
        System.out.println(villain1.getName() + "'s Starting Health is: " + villain1.getHealth());
        for (Fighter fighter : fighters) {
// Prints starting health for all fighters
            System.out.println(fighter.getName() + "'s Starting Health: " + fighter.getHealth());
        }
        System.out.println("                            ");
// Fighters attack/fight
        System.out.println("                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       First Fight");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");
        for (Fighter fighter : fighters) {
            // If the fight is = to galactus then it skips that combat, it ensure Galactus does not fight himself
            if (!fighter.getName().equals(villain1.getName())) {
                // Fighter attacks Galactus
                fighter.fight(villain1);

                // Galactus fights back
                villain1.fight(fighter);
            }
        }
        System.out.println("                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Health After First Fight");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");
// prints out fighters health after first fight
        for (Fighter fighter : fighters) {
            System.out.println(fighter.getName() + "'s Current Health: " + fighter.getHealth());
        }
        System.out.println("                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Fighters are powering up!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");
// fighters increase stats using FightActions methods overridden.
        hero1.setName("Angered Spawn");
        hero1.powerBlock(30);
        hero3.setName("Spidey Sense Spiderman");
        hero3.powerBlock(100);
        hero2.setName("Charged Up Ironman");
        hero2.powerUp(150);
        hero2.powerBlock(100);
        hero4.setName("Massive Antman");
        hero4.powerUp(700);
        hero4.powerBlock(400);
        villain1.setName("Emboldened Galactus");
        villain1.powerUp(2000);
        villain1.powerBlock(3000);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Health After Charge Up");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");
// prints out fighters health after first fight
        for (Fighter fighter : fighters) {
            System.out.println(fighter.getName() + "'s Current Health: " + fighter.getHealth());
        }

// Announcing final fight starting:
// Powering up and block increases!
        System.out.println(hero1.getName() + " is preparing defences! Blocking capabilties increasing to: " + hero1.getBlock());
        System.out.println(hero2.getName() + " is charging Unibeam! Damage has increased to: " + hero2.getDamage());
        System.out.println(hero3.getName() + " focuses up! blocking increased to: " + hero3.getBlock());
        System.out.println(hero4.getName() + " grows to a massive size! Damage increased to: "+ hero4.getDamage() + " Blocking increased to: " + hero4.getBlock());
        System.out.println("                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Galactus is stronger!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");
        System.out.println(villain1.getName() + " increases damage to: " + villain1.getDamage() + " Blocking increased to: " + villain1.getBlock());
        System.out.println("Health is: " + villain1.getHealth());

        System.out.println("                            ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The team braces for impact!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                            ");

// Fighters engage in final attack/fight once again with final healths printed out.
        for (Fighter fighter : fighters) {
            if (fighter instanceof Villain) {
                fighter.fight(hero1);
            } else {
                fighter.fight(villain1);
            }
        }
// Galactus takes 0 because the fight calculation subtracts block from damage. Galactus has incredibly high block so it nulls the damage to less than 0, doing no damage.
// Except in the case of Antman whose damage is higher than the block, thus dealing a small amount of damage.
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Antman lands a hit, but Galactus is too powerful!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Galactus: Much like the Fantastic Four, you all are nothing to me.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The team flees to regroup...");
        System.out.println("Until next time...");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
