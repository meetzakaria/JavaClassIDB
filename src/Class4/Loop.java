package Class4;

public class Loop {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i < 10; i++) {
            x += i + 1;
            System.out.println(x);
        }
        System.out.println("\nTotal " + x);
    }
}
