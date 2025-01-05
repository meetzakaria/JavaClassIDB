package Class6;

import java.util.Scanner;

public class PrintCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Full year: "); // পূর্ণ বছরের জন্য ইনপুট গ্রহণ
        int year = input.nextInt();

        System.out.println("Enter Month (1-12): "); // মাসের জন্য ইনপুট গ্রহণ (১-১২)
        int month = input.nextInt();

        // যদি মাস ১ থেকে ১২ এর মধ্যে না হয়, তাহলে একটি সতর্ক বার্তা দেখানো হবে
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            printMonth(year, month); // সঠিক মাস হলে ক্যালেন্ডার প্রিন্ট করার জন্য ফাংশন কল করা হবে
        }

        input.close(); // ইনপুট বন্ধ করা
    }

    public static void printMonth(int year, int month) {
        // মাসের নাম এবং বছর প্রিন্ট করা
        System.out.println("\t\t" + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat"); // ক্যালেন্ডারের দিনগুলোর নাম প্রিন্ট করা

        // ক্যালেন্ডারের বডি প্রিন্ট করা
        printMonthBody(year, month);
    }

    public static String getMonthName(int month) {
        // মাসের নাম নির্ধারণ করা
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid Month"; // ডিফল্ট ক্ষেত্রে "অবৈধ মাস" রিটার্ন করা
        }
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month); // মাসের প্রথম দিনের পজিশন বের করা
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month); // মাসে মোট দিন সংখ্যা বের করা

        // প্রথম দিনের আগে ফাঁকা স্থান প্রিন্ট করা
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // মাসের দিনগুলো প্রিন্ট করা
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i); // প্রতিটি দিন চারটি স্থানে প্রিন্ট করা

            // প্রতি সপ্তাহে ৭ দিনের পর নতুন লাইন শুরু করা
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // ক্যালেন্ডারের শেষে একটি নতুন লাইন
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3; // ১ জানুয়ারি, ১৮০০ ছিল বুধবার (৩য় দিন)
        int totalNumberOfDays = getTotalNumberOfDays(year, month); // ১৮০০ সাল থেকে এই মাস পর্যন্ত মোট দিন সংখ্যা
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7; // প্রথম দিনের পজিশন নির্ধারণ করা
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // ১৮০০ সাল থেকে নির্দিষ্ট বছর পর্যন্ত মোট দিন সংখ্যা যোগ করা
        for (int i = 1800; i < year; i++) {
            total += isLeapYear(i) ? 366 : 365; // লিপ ইয়ার হলে ৩৬৬ দিন, নয়তো ৩৬৫ দিন
        }

        // নির্দিষ্ট বছরের ১ম মাস থেকে বর্তমান মাস পর্যন্ত দিন সংখ্যা যোগ করা
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }

        return total; // মোট দিন সংখ্যা রিটার্ন করা
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        // মাসের মোট দিন সংখ্যা নির্ধারণ করা
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // ৩১ দিনের মাস
            case 4: case 6: case 9: case 11:
                return 30; // ৩০ দিনের মাস
            case 2:
                return isLeapYear(year) ? 29 : 28; // ফেব্রুয়ারিতে লিপ ইয়ার হলে ২৯ দিন, নয়তো ২৮ দিন
            default:
                return 0; // অবৈধ মাসের জন্য ০ দিন
        }
    }

    public static boolean isLeapYear(int year) {
        // লিপ ইয়ার চেক করার লজিক
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
