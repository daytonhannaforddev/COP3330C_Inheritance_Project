public class Main {
    public static void main(String[] args) {
// Sets up the 2 fighters as Spawn and Iron respectively.
        Fighter spawn = new Fighter1("Spawn", 10, 5, 125);
        Fighter ironman = new Fighter2("Ironman", 9, 7, 100);
        Fighter spiderman = new Fighter1("Spiderman", 12, 6, 130);
        Fighter antman = new Fighter2("Antman", 11, 8, 110);
        Fighter galactic = new Fighter1("Galactic", 15, 7, 140);

// An array of fighters to hold a reference to both fighters
        Fighter[] fighters = new Fighter[] {spawn, ironman, spiderman, antman, galactic};

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Fighter fighter : fighters) {
// Prints starting health for both fighters
            System.out.println(fighter.getName() + "'s Starting Health: " + fighter.getHealth());
        }
// Fighters attack/fight
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Fighter fighter : fighters) {
            if (fighter instanceof Fighter1) {
                fighter.fight(ironman);
            } else {
                fighter.fight(spawn);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// prints out fighters health after first fight
        for (Fighter fighter : fighters) {
            System.out.println(fighter.getName() + "'s Current Health: " + fighter.getHealth());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// Both fighters increase stats
        spawn.setBlock(30);
        ironman.setName("Charged Up Ironman");
        ironman.setDamage(150);
// Powering up and block increases!
        System.out.println(spawn.getName() + " is preparing defences! Blocking capabilties increasing to: " +spawn.getBlock());
        System.out.println(ironman.getName() + " is charging Unibeam! Damage has increased to: " +ironman.getDamage());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Spawn and Ironman brace for impact!!");
// Announcing final fight starting: Setting further increases using interface methods.
        spawn.powerBlock(4); // block increase
        spawn.powerUp(85); // damage increase
        ironman.powerBlock(10); // block increase
        ironman.powerUp(50); // damage increase

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// Fighters engage in final attack/fight once again with final healths printed out.
        for (Fighter fighter : fighters) {
            if (fighter instanceof Fighter1) {
                fighter.fight(ironman);
            }
            else {
                fighter.fight(spawn);
                System.out.println("Spawn is defeated and disappears!");

                System.out.println("Ironman barely standing..and flies away.");
            }
        }
    }
}
