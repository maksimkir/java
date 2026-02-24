import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть оцінку: ");
        int score = scanner.nextInt();

        if (score > 50) {
            System.out.println("Здано");
        } else {
            System.out.println("Помилка");
        }
    }
}