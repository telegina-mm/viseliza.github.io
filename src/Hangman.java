public class Hangman {
    public static void displayHangman(int incorrectGuesses) {
        switch (incorrectGuesses) {
            case 0:
                System.out.println("  ____ \n     |  \n        |  \n        |  \n        |  \n        |  \n=========");
                break;
            case 1:
                System.out.println("  ____ \n  |     |  \n  O     |  \n        |  \n        |  \n        |  \n=========");
                break;
            case 2:
                System.out.println("  ____ \n  |     |  \n  O     |  \n  |     |  \n        |  \n        |  \n=========");
                break;
            case 3:
                System.out.println("  ____ \n  |     |  \n  O     |  \n /|     |  \n        |  \n        |  \n=========");
                break;
            case 4:
                System.out.println("  ____ \n  |     |  \n  O     |  \n /|\\    |  \n        |  \n        |  \n=========");
                break;
            case 5:
                System.out.println("  ____ \n  |     |  \n  O     |  \n /|\\    |  \n /      |  \n        |  \n=========");
                break;
            case 6:
                System.out.println("  ____ \n  |     |  \n  O     |  \n /|\\    |  \n / \\    |  \n        |  \n=========");
                break;
        }
    }
}