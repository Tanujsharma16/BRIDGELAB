import java.util.*;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------- Program 1: Bonus of 10 Employees -------------------
        double[] sal = new double[10];
        double[] yrs = new double[10];
        double[] bon = new double[10];
        double[] nsal = new double[10];
        double totBon = 0, totOld = 0, totNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Emp " + (i+1) + " salary: ");
            double s = sc.nextDouble();
            System.out.print("Emp " + (i+1) + " yrs of service: ");
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, enter again.");
                i--; 
                continue;
            }
            sal[i] = s;
            yrs[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (yrs[i] > 5) bon[i] = sal[i] * 0.05;
            else bon[i] = sal[i] * 0.02;
            nsal[i] = sal[i] + bon[i];
            totBon += bon[i];
            totOld += sal[i];
            totNew += nsal[i];
        }

        System.out.println("\n--- Bonus Report ---");
        System.out.println("Total Bonus: " + totBon);
        System.out.println("Total Old Salary: " + totOld);
        System.out.println("Total New Salary: " + totNew);

        // ------------------- Program 2: Youngest & Tallest -------------------
        int[] age = new int[3];
        int[] ht = new int[3];
        String[] nm = {"Amar","Akbar","Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print(nm[i] + " age: ");
            age[i] = sc.nextInt();
            System.out.print(nm[i] + " height: ");
            ht[i] = sc.nextInt();
        }

        int minAge = age[0], idxA = 0;
        int maxHt = ht[0], idxH = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) { minAge = age[i]; idxA = i; }
            if (ht[i] > maxHt) { maxHt = ht[i]; idxH = i; }
        }

        System.out.println("\nYoungest: " + nm[idxA] + " (" + minAge + ")");
        System.out.println("Tallest: " + nm[idxH] + " (" + maxHt + ")");

        // ------------------- Program 3: Digits Largest & 2nd Largest -------------------
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        int[] dig = new int[10];
        int idx = 0;

        while (num != 0 && idx < 10) {
            dig[idx] = num % 10;
            num /= 10;
            idx++;
        }

        int max1 = -1, max2 = -1;
        for (int i = 0; i < idx; i++) {
            if (dig[i] > max1) {
                max2 = max1;
                max1 = dig[i];
            } else if (dig[i] > max2 && dig[i] != max1) {
                max2 = dig[i];
            }
        }

        System.out.println("Largest digit: " + max1);
        if (max2 != -1) System.out.println("2nd Largest digit: " + max2);
        else System.out.println("No 2nd largest digit found.");
    }
}

