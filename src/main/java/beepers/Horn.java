package beepers;

/**
 * beepers.Horn - concrete beeper makes a sound
 */
public class Horn implements Beeper {

    @Override
    public String makeSound() {
        return "HOOOOOOO";
    }
}
