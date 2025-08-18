public class DeadCharacterException extends Exception{
    Character ch;
    public DeadCharacterException(Character ch){
        this.ch = ch;
    }

    @Override
    public String getMessage() {
        return String.format("The %s %s is dead.", ch.getClass().getSimpleName().toLowerCase(), ch.getName());
    }
}
