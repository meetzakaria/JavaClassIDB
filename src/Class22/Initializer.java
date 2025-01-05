package Class22;

public class Initializer {
    static int initialValue;
    static {
        initialValue = 1000;
        System.out.println("Static block initialized the initial value" + initialValue);
    }

    public static void main(String[] args) {
        System.out.println("initial"+ initialValue);


    }
}
