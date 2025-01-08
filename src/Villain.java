public class Villain extends Fighter{

//This fighters name and stats
    public Villain(String name, int damage, int block, int health) { super(name, damage, block, health);}
// Overrides powerUp public interface allowing damage to be increased and returned.
    @Override
    public int powerUp(int powerIncrease){
        this.damage += powerIncrease;
        this.block -= (int)(powerIncrease / 1.2);
        return this.damage;
    }
// Overides powerBlock public interface allowing damage to be increased and returned.
    @Override
    public int powerBlock(int blockIncrease){
        this.block += blockIncrease;
        this.health -= blockIncrease;
        return this.block;
    }
// Overrides toString method to provide a string representation of Villain's stats
    @Override
    public String toString() {
        return "Villain{name='" + getName() + "', damage=" + getDamage() + ", block=" + getBlock() + ", health=" + getHealth() + "}";
    }
}
