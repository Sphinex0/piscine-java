
public class Monster extends Character{
    

    public Monster(String name, int maxHealth){
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        return super.getCurrentHealth() == 0 ? String.format("%s is a monster and is dead", super.getName())
                : String.format("%s is a monster with %d HP", super.getName(), super.getCurrentHealth());
    }
}
