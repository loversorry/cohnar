public class Main6 {
    public static void main(String[] args) {
        printDog("Тузик", 10);
        printDog("Ирод");
        printDog("бездомная");
    }
    public static void control(String name) {
        if (name.equals("бездомная")) {
            System.out.println("Не пускаем");
            return;
        }
        System.out.println("добро пожаловать" + name);
    }

    public static void printDog() {
            System.out.println("бездомная");
    }

    public static void printDog(String name, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println("собака по имени" + name);

        }
    }
    public static void printDog(String name) {
        System.out.println("собака по имени" + name);
    }
}
