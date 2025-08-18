
public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        return (super.getCurrentHealth() == 0 ? String.format("%s is a monster and is dead", super.getName())
                : String.format("%s is a monster with %d HP", super.getName(), super.getCurrentHealth()))+" He has the weapon "+ weapon.name;
    }

    @Override
    public void takeDamage(int dmg) {
        System.out.println(dmg);

        dmg = dmg * 80 / 100;
        if (getCurrentHealth() - dmg < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(getCurrentHealth() - dmg);
        }
    }

    @Override
    public void attack(Character ch) {
        ch.takeDamage(ch.weapon == null ? 7 : this.weapon.damage);
    }
}
