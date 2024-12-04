import java.util.Scanner;

public class Game {
    private Dictionary dictionary;
    private String currentWord;
    private StringBuilder guessedWord;
    private int incorrectGuesses;
    private boolean checker;

    public Game() {
        dictionary = new Dictionary();
        incorrectGuesses = 0;
    }
    public void play() {
        currentWord = dictionary.getRandomWord();
        guessedWord = new StringBuilder("_".repeat(currentWord.length()));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру!");

        while (incorrectGuesses < 6 && !guessedWord.toString().equals(currentWord)) {
            System.out.println("Загаданное слово: " + guessedWord);
            System.out.println("Неправильных букв: " + incorrectGuesses + " из 6");
            boolean checker = new Checker().check_to_continue();
            if (!checker) {
                break;
            } else {
                System.out.print("Введите букву: ");
                char sym = scanner.next().charAt(0);
                processGuess(sym);
            }

        }

        if (guessedWord.toString().equals(currentWord)) {
            System.out.println("Поздравляем! Вы угадали слово: " + currentWord);
        } else if (!checker){
            System.out.println("До новых встреч!");
        } else {
            System.out.println("Вы проиграли! Загаданное слово: " + currentWord);
        }
        scanner.close();
    }
    private void processGuess(char sym) {
        boolean correctGuess = false;
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) == sym) {
                guessedWord.setCharAt(i, sym);
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            incorrectGuesses++;
        }
    }
}
