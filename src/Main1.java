import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner cv = new Scanner(System.in);

        while (true) {
            System.out.println("оцените наше приложение");
            int number = cv.nextInt();
            if (number == 1) {
                System.out.println("За что такая низкая оценка???!!!");
                break;
            }
            else if (number == 2) {
                System.out.println("У тебя в дневнике");
                break;
            }
            else if (number == 3) {
                System.out.println("Что тебе не понравилось?");
                break;
            }
            else if (number == 4) {
                System.out.println("Что нам улучшить?");
                break;
            }
            else if (number == 5) {
                System.out.println("Спасибо! Рады быть полезными");
                break;
            }
        }

    }
}
