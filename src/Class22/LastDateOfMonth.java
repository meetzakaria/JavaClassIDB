package Class22;

import java.time.LocalDate;
import java.time.Month;

public class LastDateOfMonth {
    public static void main(String[] args) {
        int year = 2025;
        Month month = Month.JANUARY;

        LocalDate lastDate = LocalDate.of(year, month, month.length(year % 4 == 0));

        System.out.println("Last date of " + month + " " + year + " is: " + lastDate);
    }
}
