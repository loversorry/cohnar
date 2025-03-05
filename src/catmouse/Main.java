package catmouse;

public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 8,15,0);
        Cat tuzik = new Cat("Tuzik", 5,19, 1);

        Mouse mish1 = new Mouse(7);
        Mouse mish2 = new Mouse(6);
        Mouse mish3 = new Mouse(9);
        Mouse mish4 = new Mouse(8);
        Mouse mish5 = new Mouse(5);

        murzik.catchMouse(mish1);
        System.out.println(mish4.getSpeed);
    }
}
