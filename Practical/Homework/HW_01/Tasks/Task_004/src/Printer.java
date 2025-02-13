import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        String[] strings = {"apple", "banana", "cherry", "date"};
        String target = "banana";
        String replacement = "orange";
        String[] result = Answer.findAndReplace(strings, target,
                replacement, errors);
        System.out.println("Результаты замены: " + Arrays.toString(result));
        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }
}