import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    // constructor
    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
        Character.allCharacters.add(this);
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

    public static String printStatus() {

        if (allCharacters != null && allCharacters.size() != 0) {
            String res = "------------------------------------------\n" +
                    "Characters currently fighting :\n";
            for (Character ch : allCharacters) {
                res += " - " + ch.toString() + "\n";
            }
            res += "------------------------------------------";
            return res;
        } else {
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------";

        }
    }

    public static Character fight(Character ch1, Character ch2) {
        while (true) {
            ch1.attack(ch2);
            if (ch2.currentHealth == 0)
                break;
            ch2.attack(ch1);
            if (ch1.currentHealth == 0)
                break;

        }

        return ch1.currentHealth == 0 ? ch2 : ch1;
    }
}
