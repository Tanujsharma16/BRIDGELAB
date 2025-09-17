import java.util.*;

public class Level2Programs {

    // 1️⃣ Find length of string without using length()
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // 2️⃣ Split string into words without split()
    static String[] splitWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) words.add(sb.toString());

        return words.toArray(new String[0]);
    }

    // 3️⃣ Split words + return 2D array with word and length
    static String[][] wordsWithLength(String text) {
        String[] words = splitWords(text);
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // 4️⃣ Find shortest & longest word
    static void findShortestLongest(String text) {
        String[][] arr = wordsWithLength(text);
        String shortest = arr[0][0], longest = arr[0][0];

        for (String[] row : arr) {
            if (findLength(row[0]) < findLength(shortest)) shortest = row[0];
            if (findLength(row[0]) > findLength(longest)) longest = row[0];
        }

        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }

    // 5️⃣ Count vowels & consonants
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // 6️⃣ Trim leading & trailing spaces
    static String trimSpaces(String str) {
        int start = 0, end = findLength(str) - 1;

        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(str.charAt(i));

        return sb.toString();
    }

    // 7️⃣ Voting eligibility
    static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // 8️⃣ Rock Paper Scissors
    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "User";
        return "Computer";
    }

    // 9️⃣ Student Marks & Grades
    static String gradeFromPercentage(double per) {
        if (per >= 90) return "A+";
        else if (per >= 75) return "A";
        else if (per >= 60) return "B";
        else if (per >= 45) return "C";
        else return "F";
    }

    // ========================== MAIN ==========================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example Run
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length
        System.out.println("Length (custom): " + findLength(str));
        System.out.println("Length (built-in): " + str.length());

        // Split Words
        System.out.println("Words: " + Arrays.toString(splitWords(str)));

        // Words with length
        String[][] arr = wordsWithLength(str);
        System.out.println("Word  | Length");
        for (String[] row : arr) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        // Shortest & Longest
        findShortestLongest(str);

        // Vowel & Consonant Count
        int[] counts = countVowelsConsonants(str);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);

        // Trim
        System.out.println("Trimmed: '" + trimSpaces("   " + str + "   ") + "'");

        // Voting
        int[] ages = {12, 18, 20, 15, 30};
        String[][] voting = checkVoting(ages);
        System.out.println("Age | Voting");
        for (String[] row : voting) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        // Rock-Paper-Scissors Example
        String user = "rock";
        String comp = getComputerChoice();
        System.out.println("User: " + user + " | Computer: " + comp + " | Winner: " + findWinner(user, comp));

        // Grade Example
        double per = 82.5;
        System.out.println("Grade for " + per + "% = " + gradeFromPercentage(per));
    }
}
