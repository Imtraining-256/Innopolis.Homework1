package beepers;

/**
 * beepers.FancyMusic - concrete beeper makes a sound
 */
public class FancyMusic implements Beeper {

    @Override
    public String makeSound() {
        return "What is Love?";
    }
}
