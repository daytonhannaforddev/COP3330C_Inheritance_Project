public abstract class Fighter implements FighterActions {
    public String name;
    public int damage;
    public int block;
    public int health;

// Parent constructor for "Fighter" in which the 2 other child fighters inherit from.

public Fighter(String name, int damage, int block, int health) {
    this.name = name;
    this.damage = damage;
    this.block = 0;
    this.health = health;
}
// Basics Getters/Setters that include: Name, Health, Damage, and Block.
public String getName() {return name;}

public void setName(String name) {this.name = name;}

public int getDamage() {return damage;}

public void setDamage(int damage) {this.damage = damage;}

public int getBlock() {return block;}

public void setBlock(int block) {this.block = block;}

public int getHealth() {return health;}

public void setHealth(int health) {this.health = health;}

// Method for fighters to attack one another. Simple math to calculate the damage minus block, then taking that number and subtracting from health.
public void fight(Fighter target) {
    int damageDealt = Math.max(0, this.getDamage() - target.getBlock());
    int targetHealthBefore = target.getHealth();
    target.setHealth(target.health - damageDealt);
    int targetHealthAfter = target.getHealth();
// System out printing health before and after attack calculation.
    System.out.println(this.getName() + " attacks " + target.getName() + "!");
    System.out.println("Damage dealt: " + damageDealt);
    System.out.println("Health before: " + targetHealthBefore);
    System.out.println("Health after: " + targetHealthAfter);
}

// toString requirement.
    @Override
    public String toString() {
        return "Fighter{name='" + name + "', damage=" + damage + ", block=" + block + ", health=" + health + "}";
    }
}
