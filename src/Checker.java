import java.util.Objects;
import java.util.Scanner;

public class Checker {
    public boolean check_to_continue(){
        Scanner statement = new Scanner(System.in);
        System.out.println("Хотите ли вы продолжить игру? Введите yes/no");
        String stat = statement.nextLine();
        return Objects.equals("yes", stat);
    }
}
