import java.util.*;

public class PracticeProblems {

    static Scanner sc = new Scanner(System.in);

    // ---------- 1. Number Guessing Game ----------
    public static void numberGuessingGame() {
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback = "";
        System.out.println("Think of a number between 1 and 100!");
        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it high, low, or correct? ");
            feedback = sc.next();
            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Computer guessed your number!");
    }

    // ---------- 2. Maximum of Three Numbers ----------
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void maxOfThreeNumbers() {
        System.out.print("Enter three integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Maximum is: " + findMax(a, b, c));
    }

    // ---------- 3. Prime Number Checker ----------
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void primeChecker() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + (isPrime(n) ? " is Prime" : " is Not Prime"));
    }

    // ---------- 4. Fibonacci Sequence Generator ----------
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void fibonacci() {
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);
    }

    // ---------- 5. Palindrome Checker ----------
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }
    public static void palindromeChecker() {
        System.out.print("Enter a string: ");
        sc.nextLine(); // clear buffer
        String str = sc.nextLine();
        System.out.println(str + (isPalindrome(str) ? " is a Palindrome" : " is Not a Palindrome"));
    }

    // ---------- 6. Factorial Using Recursion ----------
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void factorialRecursion() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }

    // ---------- 7. GCD and LCM Calculator ----------
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void gcdLcmCalculator() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    // ---------- 8. Temperature Converter ----------
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static void temperatureConverter() {
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F)? ");
        char unit = sc.next().toUpperCase().charAt(0);
        if (unit == 'C') {
            System.out.println("Converted: " + fahrenheitToCelsius(temp) + " °C");
        } else {
            System.out.println("Converted: " + celsiusToFahrenheit(temp) + " °F");
        }
    }

    // ---------- 9. Basic Calculator ----------
    public static void calculator() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Choose operation (+ - * /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = (b != 0) ? a / b : Double.NaN;
            default -> System.out.println("Invalid operation!");
        }
        System.out.println("Result: " + result);
    }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Practice Menu =====");
            System.out.println("1. Number Guessing Game");
            System.out.println("2. Maximum of Three Numbers");
            System.out.println("3. Prime Number Checker");
            System.out.println("4. Fibonacci Sequence");
            System.out.println("5. Palindrome Checker");
            System.out.println("6. Factorial (Recursion)");
            System.out.println("7. GCD & LCM Calculator");
            System.out.println("8. Temperature Converter");
            System.out.println("9. Basic Calculator");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> numberGuessingGame();
                case 2 -> maxOfThreeNumbers();
                case 3 -> primeChecker();
                case 4 -> fibonacci();
                case 5 -> palindromeChecker();
                case 6 -> factorialRecursion();
                case 7 -> gcdLcmCalculator();
                case 8 -> temperatureConverter();
                case 9 -> calculator();
                case 10 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice, try again!");
            }
        }
    }
}
