import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int sum = 0;
        int dlr = 0;
        int[] array = new int[7];
        for (int i=0; i < array.length; i++) {
            Scanner cv = new Scanner(System.in);
            System.out.println("Введите свои расходы за "+ (i+1) + " день: ");
            int b = cv.nextInt();
            array[i] = b;
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма: "+sum);
        dlr = (int) (sum * 70); {
            System.out.println("в долларах: " + dlr);
        }

    }
}
