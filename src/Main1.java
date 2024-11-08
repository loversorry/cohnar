import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner cv = new Scanner(System.in);
        System.out.println("оцените наше приложение");
        int number = cv.nextInt();
        if (number == 1) {
            System.out.println("За что такая низкая оценка???!!!");
        }
        else if (number == 2) {
            System.out.println("У тебя в дневнике");
        }
        else if (number == 3) {
            System.out.println("Что тебе не понравилось?");
        }
        else if (number == 4) {
            System.out.println("Что нам улучшить?");
        }
        else if (number == 5) {
            System.out.println("Спасибо! Рады быть полезными");
        }
    }
}
