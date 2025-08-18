
public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch) {
        if (ch.getCurrentHealth() + this.healCapacity >= ch.getMaxHealth()) {
            ch.setCurrentHealth(ch.getMaxHealth()); 
        } else {
            ch.setCurrentHealth((ch.getCurrentHealth() + this.healCapacity));
        }
    }

    @Override
    public String toString() {
        return getCurrentHealth() == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", getName(), getHealCapacity())
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP.", getName(), getCurrentHealth(),
                        getHealCapacity());
    }

}
