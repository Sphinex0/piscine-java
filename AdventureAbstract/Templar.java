
public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
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
    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return super.getCurrentHealth() == 0
                ? String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                        super.getName(), getShield(), getHealCapacity())
                : String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                        super.getName(), super.getCurrentHealth(), getHealCapacity(), getShield());
    }

    @Override
    public void takeDamage(int dmg) {
        dmg = dmg - shield;
        if (getCurrentHealth() - dmg < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(getCurrentHealth() - dmg);
        }
    }

    @Override
    public void attack(Character ch) {
        this.heal(this);
        ch.takeDamage(6);
    }

}