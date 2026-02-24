import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vidit othinku: ");
        int score = scanner.nextInt();

        if (score > 50) {
            System.out.println("zdano");
        } else {
            System.out.println("pomilka");
        }
    }
}