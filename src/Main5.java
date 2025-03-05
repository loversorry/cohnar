public class Main5 {
    public static void main(String[] args) {
        int a = max(5,8);
        System.out.println(a);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
