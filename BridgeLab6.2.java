import java.util.*;

public class Level2Programs {

    // 1. Factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }
    public static int sumOfSquareOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    // 2. Sum of n natural numbers (recursion + formula)
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    // 3. Leap Year
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 4. Unit Converter
    static class UnitConverter {
        public static double convertKmToMiles(double km) { return km * 0.621371; }
        public static double convertMilesToKm(double miles) { return miles * 1.60934; }
        public static double convertMetersToFeet(double m) { return m * 3.28084; }
        public static double convertFeetToMeters(double ft) { return ft * 0.3048; }
        public static double convertYardsToFeet(double yards) { return yards * 3; }
        public static double convertFeetToYards(double ft) { return ft * 0.333333; }
        public static double convertMetersToInches(double m) { return m * 39.3701; }
        public static double convertInchesToMeters(double in) { return in * 0.0254; }
        public static double convertInchesToCm(double in) { return in * 2.54; }
        public static double convertFahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
        public static double convertCelsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
        public static double convertPoundsToKg(double p) { return p * 0.453592; }
        public static double convertKgToPounds(double kg) { return kg * 2.20462; }
        public static double convertGallonsToLiters(double g) { return g * 3.78541; }
        public static double convertLitersToGallons(double l) { return l * 0.264172; }
    }

    // 5. Student Vote Checker
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    // 6. Youngest & Tallest
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }
    public static int findTallest(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    // 7. Positive/Negative, Even/Odd, Compare
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    // 8. BMI
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    // 9. Quadratic Roots
    public static double[] quadraticRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[]{};
        if (delta == 0) return new double[]{-b / (2 * a)};
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{root1, root2};
    }

    // 10. Random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; // 1000 to 9999
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double)sum / numbers.length;
        return new double[]{avg, min, max};
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example test calls
        int[] factors = findFactors(12);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sumOfFactors(factors));
        System.out.println("Product: " + productOfFactors(factors));
        System.out.println("Sum of squares: " + sumOfSquareOfFactors(factors));

        int n = 5;
        System.out.println("Sum (recursion): " + sumRecursive(n));
        System.out.println("Sum (formula): " + sumFormula(n));

        System.out.println("Leap year (2024): " + isLeapYear(2024));

        System.out.println("10 miles to km: " + UnitConverter.convertMilesToKm(10));

        System.out.println("Vote eligibility (age 16): " + canStudentVote(16));

        int[] ages = {20, 25, 18};
        int[] heights = {170, 180, 160};
        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);

        int[] nums = {5, -2, 7, 10, 5};
        for (int num : nums) {
            if (isPositive(num)) {
                System.out.println(num + " is Positive and " + (isEven(num) ? "Even" : "Odd"));
            } else {
                System.out.println(num + " is Negative");
            }
        }
        System.out.println("Compare first and last: " + compare(nums[0], nums[nums.length - 1]));

        double bmi = calculateBMI(70, 175);
        System.out.println("BMI: " + bmi + " Status: " + bmiStatus(bmi));

        double[] roots = quadraticRoots(1, -3, 2);
        System.out.println("Quadratic roots: " + Arrays.toString(roots));

        int[] randoms = generate4DigitRandomArray(5);
        System.out.println("Randoms: " + Arrays.toString(randoms));
        double[] stats = findAverageMinMax(randoms);
        System.out.println("Average: " + stats[0] + " Min: " + stats[1] + " Max: " + stats[2]);
    }
}
