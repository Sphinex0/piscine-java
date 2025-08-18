
public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        return super.getCurrentHealth() == 0 ? String.format("%s is a monster and is dead", super.getName())
                : String.format("%s is a monster with %d HP", super.getName(), super.getCurrentHealth());
    }

    @Override
    public void takeDamage(int dmg) {
        dmg = dmg * 80 / 100;
        if (getCurrentHealth() - dmg < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(getCurrentHealth() - dmg);
        }
    }

    @Override
    public void attack(Character ch) {
        ch.takeDamage(7);
    }
}
