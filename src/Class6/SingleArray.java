package Class6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        int[] marks = new int[14];
        marks[0] = 5;
        marks[2] = 5;
        marks[13] = 23;

        System.out.println(marks[13]);

        System.out.println("Common Loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + ", ");
        }
        System.out.println();
        System.out.println("for Each");
        System.out.println("[");
        String st = "";
        for (int m : marks) {
            st = st + m + ", ";
        }
        st = st.substring(8, st.length() - 2);
        System.out.println(st);
        System.out.println("]");

        System.out.println();
        System.out.println("Print With Array Class ");
        String result = Arrays.toString(marks);
        result = result.substring(1, result.length()-1);
        System.out.println(Arrays.toString(marks));
        System.out.println();
        System.out.println(result);
    }

}
