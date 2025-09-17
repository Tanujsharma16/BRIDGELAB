import java.util.*;

public class Level3Programs {

    // 1️⃣ BMI Calculator
    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4]; // weight, height, BMI, status
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0; // convert cm to m
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // 2️⃣ Unique Characters
    static char[] uniqueCharacters(String text) {
        char[] result = new char[text.length()];
        int size = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[size++] = c;
        }
        return Arrays.copyOf(result, size);
    }

    // 3️⃣ First Non-Repeating Character
    static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '-'; // not found
    }

    // 4️⃣ Frequency of Characters (ASCII)
    static String[][] charFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) list.add(new String[]{String.valueOf((char)i), String.valueOf(freq[i])});
        }
        return list.toArray(new String[0][0]);
    }

    // 5️⃣ Palindrome Check
    static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    static boolean isPalindromeRec(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRec(text, start + 1, end - 1);
    }

    // 6️⃣ Anagram Check
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (char c : s1.toCharArray()) freq1[c]++;
        for (char c : s2.toCharArray()) freq2[c]++;
        return Arrays.equals(freq1, freq2);
    }

    // 7️⃣ Calendar Display
    static void displayCalendar(int month, int year) {
        String[] months = {"", "January","February","March","April","May","June",
                            "July","August","September","October","November","December"};
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        // leap year check
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) days[2] = 29;

        // Gregorian Calendar Algorithm
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + 31*m0/12) % 7;

        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < d0; i++) System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d0) % 7 == 0) || (i == days[month])) System.out.println();
        }
    }

    // 8️⃣ Deck of Cards
    static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) throw new IllegalArgumentException("Not enough cards!");
        String[][] result = new String[players][cards];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: BMI
        double[][] team = {{60,170},{80,180},{45,160}}; // weight, height
        String[][] bmi = calculateBMI(team);
        System.out.println("Weight | Height | BMI | Status");
        for (String[] row : bmi) {
            System.out.println(Arrays.toString(row));
        }

        // Example: Unique chars
        System.out.println("Unique chars: " + Arrays.toString(uniqueCharacters("hello world")));

        // Example: First non-repeating
        System.out.println("First non-repeating: " + firstNonRepeating("swiss"));

        // Example: Char Frequency
        String[][] freq = charFrequency("banana");
        for (String[] row : freq) System.out.println(row[0] + " -> " + row[1]);

        // Example: Palindrome
        System.out.println("Palindrome? " + isPalindrome("madam"));
        System.out.println("Palindrome Rec? " + isPalindromeRec("madam",0,"madam".length()-1));

        // Example: Anagram
        System.out.println("Anagram? " + isAnagram("listen","silent"));

        // Example: Calendar
        displayCalendar(9, 2025);

        // Example: Deck of Cards
        String[] deck = initDeck();
        shuffleDeck(deck);
        String[][] players = distribute(deck, 4, 5);
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + ": " + Arrays.toString(players[i]));
        }
    }
}
