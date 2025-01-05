import java.util.Calendar;
import java.util.Scanner;

public class  PrintCalender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        printCalendar(year, month);

        scanner.close();
    }

    public static void printCalendar(int year, int month) {
        month = month - 1;

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\n  Calendar for " + year + ", " + (month + 1));
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}