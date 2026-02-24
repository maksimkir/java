public class task3 {
    public static void main(String[] args) {
        int number = 14;
        int remainder = number % 2;

        switch (remainder) {
            case 0:
                System.out.println(number + " - perche shislo");
                break;
            case 1:
            case -1: // Для від'ємних непарних чисел
                System.out.println(number + " - neperche shislo");
                break;
        }
    }
}