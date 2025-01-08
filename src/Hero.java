public class Hero extends Fighter{

//This fighters name and stats
    public Hero(String name, int damage, int block, int health) { super(name, damage, block, health);}
// Overrides powerUp public interface allowing damage to be increased and returned.
    @Override
    public int powerUp(int powerIncrease){
        this.damage += powerIncrease * 2;
        return this.damage;
    }
// Overides powerBlock public interface allowing damage to be increased and returned.
// Block is increased
    @Override
    public int powerBlock(int blockIncrease){
        this.block += (int)(blockIncrease * 1.2);
        this.health += (int)(blockIncrease * 5);
        return this.block;
    }
// Overrides toString method to provide a string representation of Hero's stats
    @Override
    public String toString() {
        return "Hero{name='" + getName() + "', damage=" + getDamage() + ", block=" + getBlock() + ", health=" + getHealth() + "}";
    }
}
