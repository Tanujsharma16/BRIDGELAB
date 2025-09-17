import java.util.*;

public class Level3All {

    static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (y >= 1582) {
            if (y % 400 == 0) System.out.println(y + " Leap Year");
            else if (y % 100 == 0) System.out.println(y + " Not Leap Year");
            else if (y % 4 == 0) System.out.println(y + " Leap Year");
            else System.out.println(y + " Not Leap Year");

            if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
                System.out.println("(Single If) Leap Year");
            else
                System.out.println("(Single If) Not Leap Year");
        } else {
            System.out.println("Year must be >= 1582");
        }
    }

    static void marksGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Physics: ");
        int p = sc.nextInt();
        System.out.print("Chemistry: ");
        int c = sc.nextInt();
        System.out.print("Maths: ");
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;
        System.out.println("Average = " + avg);

        if (avg >= 90) System.out.println("Grade A - Excellent");
        else if (avg >= 75) System.out.println("Grade B - Very Good");
        else if (avg >= 60) System.out.println("Grade C - Good");
        else if (avg >= 40) System.out.println("Grade D - Pass");
        else System.out.println("Grade F - Fail");
    }

    static void armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        if (sum == n) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }

    static void countDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), cnt = 0;
        while (n != 0) {
            n /= 10;
            cnt++;
        }
        System.out.println("Digits = " + cnt);
    }

    static void harshad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), sum = 0, t = n;
        while (t != 0) {
            sum += t % 10;
            t /= 10;
        }
        if (n % sum == 0) System.out.println("Harshad");
        else System.out.println("Not Harshad");
    }

    static void abundant() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        if (sum > n) System.out.println("Abundant");
        else System.out.println("Not Abundant");
    }

    static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First num: ");
        double a = sc.nextDouble();
        System.out.print("Second num: ");
        double b = sc.nextDouble();
        System.out.print("Op (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/':
                if (b != 0) System.out.println("Result = " + (a / b));
                else System.out.println("Divide by 0 not allowed");
                break;
            default: System.out.println("Invalid op");
        }
    }

    static void dayOfWeek(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        System.out.println("Day of week = " + d0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.LeapYear  2.Marks  3.Armstrong  4.CountDigits");
        System.out.println("5.Harshad  6.Abundant  7.Calculator  8.DayOfWeek");
        System.out.print("Choose option: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: leapYear(); break;
            case 2: marksGrade(); break;
            case 3: armstrong(); break;
            case 4: countDigits(); break;
            case 5: harshad(); break;
            case 6: abundant(); break;
            case 7: calc(); break;
            case 8: 
                System.out.println("Run with args: month day year");
                if (args.length == 3) dayOfWeek(args);
                break;
            default: System.out.println("Invalid choice");
        }
    }
}
