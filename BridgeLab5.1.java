import java.util.*;

public class L1 {
    static Scanner sc = new Scanner(System.in);

    // ---------- Compare Strings using charAt ----------
    static boolean cmpStr(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    // ---------- Create Substring using charAt ----------
    static String subStr(String s, int st, int en) {
        String r = "";
        for (int i = st; i < en; i++) r += s.charAt(i);
        return r;
    }

    // ---------- Convert to char[] manually ----------
    static char[] toChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    static boolean cmpArr(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    // ---------- Uppercase Conversion ----------
    static String toUpper(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') r += (char)(c - 32);
            else r += c;
        }
        return r;
    }

    // ---------- Lowercase Conversion ----------
    static String toLower(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') r += (char)(c + 32);
            else r += c;
        }
        return r;
    }

    // ---------- NullPointerException ----------
    static void genNPE() {
        String t = null;
        System.out.println(t.length()); // crash
    }
    static void handleNPE() {
        try {
            String t = null;
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NPE: " + e);
        }
    }

    // ---------- StringIndexOutOfBoundsException ----------
    static void genSIOOBE(String s) {
        System.out.println(s.charAt(s.length())); // crash
    }
    static void handleSIOOBE(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled SIOOBE: " + e);
        }
    }

    // ---------- IllegalArgumentException ----------
    static void genIAE(String s) {
        System.out.println(s.substring(3, 1)); // crash
    }
    static void handleIAE(String s) {
        try {
            System.out.println(s.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IAE: " + e);
        }
    }

    // ---------- NumberFormatException ----------
    static void genNFE(String s) {
        int n = Integer.parseInt(s); // crash
        System.out.println(n);
    }
    static void handleNFE(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Handled NFE: " + e);
        }
    }

    // ---------- ArrayIndexOutOfBoundsException ----------
    static void genAIOOBE() {
        String[] a = {"one","two","three"};
        System.out.println(a[5]); // crash
    }
    static void handleAIOOBE() {
        try {
            String[] a = {"one","two","three"};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled AIOOBE: " + e);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        // 1. Compare Strings
        System.out.print("Enter str1: ");
        String s1 = sc.next();
        System.out.print("Enter str2: ");
        String s2 = sc.next();
        boolean r1 = cmpStr(s1, s2);
        boolean r2 = s1.equals(s2);
        System.out.println("cmpStr result: " + r1 + " | equals result: " + r2);

        // 2. Substring
        System.out.print("Enter text: ");
        String txt = sc.next();
        System.out.print("Enter start: ");
        int st = sc.nextInt();
        System.out.print("Enter end: ");
        int en = sc.nextInt();
        String r3 = subStr(txt, st, en);
        String r4 = txt.substring(st, en);
        System.out.println("Manual: " + r3 + " | Built-in: " + r4 + " | Equal? " + cmpStr(r3,r4));

        // 3. toCharArray
        System.out.print("Enter word: ");
        String w = sc.next();
        char[] a1 = toChars(w);
        char[] a2 = w.toCharArray();
        System.out.println("cmpArr result: " + cmpArr(a1,a2));

        // 4. Exceptions
        // Uncomment one by one to test
        // genNPE();
        handleNPE();
        // genSIOOBE("hi");
        handleSIOOBE("hi");
        // genIAE("java");
        handleIAE("java");
        // genNFE("abc");
        handleNFE("abc");
        // genAIOOBE();
        handleAIOOBE();

        // 5. Uppercase
        System.out.print("Enter text for upper: ");
        sc.nextLine();
        String u = sc.nextLine();
        String mu = toUpper(u);
        String bu = u.toUpperCase();
        System.out.println("Manual: " + mu + " | Built-in: " + bu + " | Equal? " + cmpStr(mu,bu));

        // 6. Lowercase
        System.out.print("Enter text for lower: ");
        String l = sc.nextLine();
        String ml = toLower(l);
        String bl = l.toLowerCase();
        System.out.println("Manual: " + ml + " | Built-in: " + bl + " | Equal? " + cmpStr(ml,bl));
    }
}
