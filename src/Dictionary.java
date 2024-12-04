import java.util.Random;

public class Dictionary {
    private final String[] words = {"book", "computer", "programming", "study", "school", "sleep", "winter", "home", "friend"};
    private final Random random;

    public Dictionary() {
        random = new Random();
    }

    public String getRandomWord() {
        return words[random.nextInt(words.length)];
    }
}