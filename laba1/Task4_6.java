public class Task4_6 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Парні числа від 1 до 100:");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}