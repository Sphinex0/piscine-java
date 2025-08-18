
public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    // constructor
    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
    }

    // getters
    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public String getName() {
        return name;
    }

    // toString
    @Override
    public String toString() {
        return currentHealth == 0 ? String.format("%s : KO", this.name)
                : String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    // METHODS
    public void takeDamage(int dmg) {
        if (this.currentHealth - dmg < 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= dmg;
        }
    }

    public void attack(Character ch) {
        ch.takeDamage(9);
    }
}
