import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  height;
        double weight;
        int imt;
        Scanner userEnter = new Scanner(System.in);
        System.out.println("Введите свой рост: ");
        height = userEnter.nextInt();
        if ((height>=150) && (height<=180)) {
            System.out.println("Введите свой вес ");
            weight = userEnter.nextInt();;
            if ((weight<=60)) {
                System.out.println("дефицит массы тела");
            } else if ((weight>=60) && (weight<=80)) {
                System.out.println("норма");
            } else if ((weight>=81) && (weight<=99)) {
                System.out.println("Избыточная масса тела(предожирение)");
            } else if (weight>=100) {
                System.out.println("ожирение");
            }

            int height_metr_sm = (int) (height / 100);
            height = (int) (height / 100);

            System.out.println("Расчёт имт ");
            double weight_in_merr = (int) (weight / height * 2);
            imt = (int) (weight / height * 2); {
                System.out.println("ваш имт " + weight_in_merr);
            }
        } else {
            System.out.println("Неверное значение");
        }

    }
}