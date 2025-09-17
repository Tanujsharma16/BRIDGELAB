import java.util.*;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Odd/Even numbers
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) System.out.println(i + " is Even");
            else System.out.println(i + " is Odd");
        }

        // 2. Bonus based on service
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yrs = sc.nextInt();
        if (yrs > 5) {
            double bonus = sal * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No Bonus");
        }

        // 3. Multiplication table from 6 to 9
        System.out.print("Enter a number for table: ");
        int t = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(t + " * " + i + " = " + (t * i));
        }

        // 4. FizzBuzz with for loop
        System.out.print("Enter number for FizzBuzz: ");
        int fb = sc.nextInt();
        if (fb > 0) {
            for (int i = 1; i <= fb; i++) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
            }
        }

        // 5. FizzBuzz with while loop
        int i2 = 1;
        while (i2 <= fb) {
            if (i2 % 3 == 0 && i2 % 5 == 0) System.out.println("FizzBuzz");
            else if (i2 % 3 == 0) System.out.println("Fizz");
            else if (i2 % 5 == 0) System.out.println("Buzz");
            else System.out.println(i2);
            i2++;
        }

        // 6. Youngest and tallest among friends
        System.out.print("Enter age of Amar: ");
        int a1 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int h1 = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int a2 = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int h2 = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int a3 = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int h3 = sc.nextInt();
        int minAge = Math.min(a1, Math.min(a2, a3));
        int maxHt = Math.max(h1, Math.max(h2, h3));
        System.out.println("Youngest age is " + minAge);
        System.out.println("Tallest height is " + maxHt);

        // 7. Factors with for loop
        System.out.print("Enter number for factors: ");
        int f1 = sc.nextInt();
        if (f1 > 0) {
            for (int i = 1; i < f1; i++) {
                if (f1 % i == 0) System.out.print(i + " ");
            }
            System.out.println();
        }

        // 8. Factors with while loop
        int c1 = 1;
        while (c1 < f1) {
            if (f1 % c1 == 0) System.out.print(c1 + " ");
            c1++;
        }
        System.out.println();

        // 9. Greatest factor with for loop
        System.out.print("Enter number for greatest factor: ");
        int g1 = sc.nextInt(), gf = 1;
        for (int i = g1 - 1; i >= 1; i--) {
            if (g1 % i == 0) {
                gf = i;
                break;
            }
        }
        System.out.println("Greatest factor (beside itself) is " + gf);

        // 10. Greatest factor with while loop
        int c2 = g1 - 1, gf2 = 1;
        while (c2 >= 1) {
            if (g1 % c2 == 0) {
                gf2 = c2;
                break;
            }
            c2--;
        }
        System.out.println("Greatest factor (while loop) is " + gf2);

        // 11. Multiples of number < 100 with for loop
        System.out.print("Enter number (<100): ");
        int m1 = sc.nextInt();
        if (m1 > 0 && m1 < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % m1 == 0) System.out.print(i + " ");
            }
            System.out.println();
        }

        // 12. Power with for loop
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= pow; i++) res *= base;
        System.out.println("Result = " + res);

        // 13. Multiples of number < 100 with while loop
        int m2 = m1; // reuse same input
        int c3 = 100;
        while (c3 >= 1) {
            if (c3 % m2 == 0) System.out.print(c3 + " ");
            c3--;
        }
        System.out.println();

        // 14. Power with while loop
        int res2 = 1, cnt = 0;
        while (cnt < pow) {
            res2 *= base;
            cnt++;
        }
        System.out.println("Result (while loop) = " + res2);

        sc.close();
    }
}
