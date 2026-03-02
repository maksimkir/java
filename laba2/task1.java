import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String validDate = "2024-05-20";
        String invalidDate = "неправильна-дата";

        System.out.println("Спроба 1 (коректна):");
        convertToDate(validDate);

        System.out.println("\nСпроба 2 (некоректна):");
        convertToDate(invalidDate);
    }

    public static void convertToDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        // Встановлюємо суворий режим перевірки
        formatter.setLenient(false);

        try {
            Date date = formatter.parse(dateStr);
            System.out.println("Успішно конвертовано: " + date);
        } catch (ParseException e) {
            System.err.println("Помилка: Рядок '" + dateStr + "' має недійсний формат дати.");
            System.err.println("Деталі виключення: " + e.getMessage());
        }
    }
}