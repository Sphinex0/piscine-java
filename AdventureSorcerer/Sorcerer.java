
public class Sorcerer extends Character implements Healer {
    private int healCapacity;

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
        if (ch.currentHealth + this.healCapacity >= ch.getMaxHealth()) {
            ch.currentHealth = ch.getMaxHealth();
        } else {
            ch.currentHealth += this.healCapacity;
        }
    }

    @Override
    public String toString() {
        return currentHealth == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", getName(), getHealCapacity())
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP.", getName(), getCurrentHealth(),
                        getHealCapacity());
    }

}
