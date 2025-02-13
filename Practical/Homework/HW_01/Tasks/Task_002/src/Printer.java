import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            int[] b = {4, 5, 6};
            int[] result = Answer.mergeAndValidateArrays(a, b);
            System.out.println(Arrays.toString(result));
//            Ожидаемый результат: [1, 2, 3, 4, 5, 6]
        } catch (IllegalArgumentException e) {
            System.out.println("Длины массивов не равны");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] c = {1, 2};
            int[] d = {3, 4, 5};
            System.out.println(Arrays.toString(Answer.mergeAndValidateArrays(c, d)));
//            Ожидаемый результат: исключение IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Длины массивов не равны");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] e = {-1, 2, 3};
            int[] f = {4, 5, 6};
            System.out.println(Arrays.toString(Answer.mergeAndValidateArrays(e, f)));
//            Ожидаемый результат: исключение RuntimeException
        } catch (IllegalArgumentException e) {
            System.out.println("Длины массивов не равны");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}