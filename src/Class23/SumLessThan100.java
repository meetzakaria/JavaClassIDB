package Class23;

public class SumLessThan100 {
    public static boolean isSumLessThan100(int num1, int num2) {
        return (num1 + num2) < 100;
    }

    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 50;
        System.out.println(isSumLessThan100(num1, num2));
    }
}
