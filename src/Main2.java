import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int i = 7;
        int[] array = new int[7];
        int all = 0;
        for (int k = 0; k < array.length; k++) {
            array[k] = (int) (Math.random() * 10000) + 1;
            all += array[k];
            int max = 0;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(all);

    }
}
