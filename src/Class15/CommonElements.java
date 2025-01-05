package Class15;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {

        String[] array1 = {"Zakaria", "Faysal", "Zahid", "Hemel"};
        String[] array2 = {"Faysal", "Zakaria", "Ashik", "Nahid"};

        HashSet<String> set = new HashSet<>();

        for (String item : array1) {
            set.add(item);
        }

        System.out.println("Common elements between the two arrays: ");
        for (String item : array2) {

            if (set.contains(item)) {
                System.out.println(item);
            }
        }
    }
}
