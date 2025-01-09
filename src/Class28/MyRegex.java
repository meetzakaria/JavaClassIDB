package Class28;

import java.util.Scanner;

class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    static class MyRegex {
        String pattern = "((0|[6-9]|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5])))\\."
                + "((0|[6-9]|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5])))\\."
                + "((0|[6-9]|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5])))\\."
                + "((0|[6-9]|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5])))";
    }
}
