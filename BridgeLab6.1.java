import java.util.Scanner;

public class Level1Programs {

    // 1. Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // 2. Maximum handshakes
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    // 3. Triangular Park Rounds
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int)Math.ceil(distance / perimeter);
    }

    // 4. Check number sign
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    // 5. Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    // 6. Sum of n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // 7. Smallest and Largest
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    // 8. Quotient and Remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    // 9. Divide Chocolates
    public static int[] divideChocolates(int chocolates, int children) {
        int quotient = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{quotient, remainder};
    }

    // 10. Wind Chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    // 11. Trigonometric Functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    // ================= MAIN METHOD ===================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example runs (you can test others similarly)
        System.out.println("Simple Interest: " + calculateSimpleInterest(1000, 5, 2));
        System.out.println("Handshakes (5 students): " + calculateHandshakes(5));
        System.out.println("Rounds in park: " + calculateRounds(100, 200, 150));
        System.out.println("Check Number (0): " + checkNumber(0));
        System.out.println("Is Spring Season (3, 25): " + isSpringSeason(3, 25));
        System.out.println("Sum of 10 natural numbers: " + sumOfNaturalNumbers(10));

        int[] smallLarge = findSmallestAndLargest(10, 5, 20);
        System.out.println("Smallest: " + smallLarge[0] + ", Largest: " + smallLarge[1]);

        int[] qr = findRemainderAndQuotient(2
