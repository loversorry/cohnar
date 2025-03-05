import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b = 1;
        int c = 1;
        int d = 1;

        for(int i = 0; i < a; i++)
        {
            if(i % 2 == 0) {
                System.out.println("Круг " + i);
                System.out.println("отжимания: " + (b += 3));
                System.out.println("Пресс: " + (d += 7));
            }
            else {
                System.out.println("приседания: " + (c += 5));
                System.out.println("Пресс: " + (d += 7));
            }
        }
    }
}
