import java.util.*;

public class Level3Programs {

    // ---------- Football Heights ----------
    public static int sum(int[] arr) {
        int s = 0;
        for (int val : arr) s += val;
        return s;
    }

    public static double meanHeight(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void footballTeamHeights() {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 - 250
        }
        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + shortestHeight(heights));
        System.out.println("Tallest Height: " + tallestHeight(heights));
        System.out.println("Mean Height: " + meanHeight(heights));
    }


    // ---------- NumberChecker Utility ----------
    static class NumberChecker {

        public static int countDigits(int n) {
            return String.valueOf(n).length();
        }

        public static int[] digitsArray(int n) {
            String s = String.valueOf(n);
            int[] arr = new int[s.length()];
            for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
            return arr;
        }

        public static boolean isDuckNumber(int n) {
            int[] digits = digitsArray(n);
            for (int d : digits) {
                if (d == 0) return true;
            }
            return false;
        }

        public static boolean isArmstrong(int n) {
            int[] digits = digitsArray(n);
            int len = digits.length;
            int sum = 0;
            for (int d : digits) {
                sum += Math.pow(d, len);
            }
            return sum == n;
        }

        public static int[] largestAndSecondLargest(int[] digits) {
            int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
            for (int d : digits) {
                if (d > largest) {
                    second = largest;
                    largest = d;
                } else if (d > second && d != largest) {
                    second = d;
                }
            }
            return new int[]{largest, second};
        }

        public static int[] smallestAndSecondSmallest(int[] digits) {
            int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
            for (int d : digits) {
                if (d < smallest) {
                    second = smallest;
                    smallest = d;
                } else if (d < second && d != smallest) {
                    second = d;
                }
            }
            return new int[]{smallest, second};
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        // Football team heights
        footballTeamHeights();

        // Number Checker examples
        int num = 153;
        System.out.println("\nNumber: " + num);
        System.out.println("Digit Count: " + NumberChecker.countDigits(num));
        System.out.println("Digits Array: " + Arrays.toString(NumberChecker.digitsArray(num)));
        System.out.println("Duck Number? " + NumberChecker.isDuckNumber(num));
        System.out.println("Armstrong Number? " + NumberChecker.isArmstrong(num));

        int[] digits = NumberChecker.digitsArray(num);
        System.out.println("Largest & 2nd Largest: " + Arrays.toString(NumberChecker.largestAndSecondLargest(digits)));
        System.out.println("Smallest & 2nd Smallest: " + Arrays.toString(NumberChecker.smallestAndSecondSmallest(digits)));
    }
}
