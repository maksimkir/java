import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        String validDate = "2026-02-01";
        String invalidDate = "nepravilna data";

        System.out.println("sproba 1 (korrektna):");
        convertToDate(validDate);

        System.out.println("\nsproba 2 (nekorrektna):");
        convertToDate(invalidDate);
    }

    public static void convertToDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //суворий режим перевірки
        formatter.setLenient(false);

        try {
            Date date = formatter.parse(dateStr);
            System.out.println("uspishno konvertovano: " + date);
        } catch (ParseException e) {
            System.err.println("Pomilka: Ryadok '" + dateStr + "' maye nediyisnyy format daty.");
            System.err.println("Detali vyklyuchennya: " + e.getMessage());
        }
    }
}