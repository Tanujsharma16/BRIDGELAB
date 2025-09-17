import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimePractice {
    
    // ---------- Problem 1: Time Zones ----------
    public static void showTimeZones() {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("\n--- Time Zones ---");
        System.out.println("GMT Time: " + gmtTime);
        System.out.println("IST Time: " + istTime);
        System.out.println("PST Time: " + pstTime);
    }

    // ---------- Problem 2: Date Arithmetic ----------
    public static void dateArithmetic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (yyyy): ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = newDate.minusWeeks(3);

        System.out.println("\n--- Date Arithmetic ---");
        System.out.println("Original Date: " + date);
        System.out.println("After Additions: " + newDate);
        System.out.println("Final Date (After Subtraction): " + finalDate);
    }

    // ---------- Problem 3: Date Formatting ----------
    public static void dateFormatting() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("\n--- Date Formatting ---");
        System.out.println("Format 1: " + today.format(format1));
        System.out.println("Format 2: " + today.format(format2));
        System.out.println("Format 3: " + today.format(format3));
    }

    // ---------- Problem 4: Date Comparison ----------
    public static void dateComparison() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        System.out.println("\n--- Date Comparison ---");
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is equal to " + date2);
        }
    }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Date & Time Practice Menu =====");
            System.out.println("1. Show Current Time in Different Zones");
            System.out.println("2. Date Arithmetic (+7 days, +1 month, +2 years, -3 weeks)");
            System.out.println("3. Date Formatting (3 formats)");
            System.out.println("4. Date Comparison");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> showTimeZones();
                case 2 -> dateArithmetic();
                case 3 -> dateFormatting();
                case 4 -> dateComparison();
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
