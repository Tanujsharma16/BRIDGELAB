import java.util.*;

public class Level1ArrayAll {

    static void voteCheck() {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            age[i] = sc.nextInt();
        }
        for (int a : age) {
            if (a < 0) System.out.println("Invalid age " + a);
            else if (a >= 18) System.out.println("Student age " + a + " can vote");
            else System.out.println("Student age " + a + " cannot vote");
        }
    }

    static void posNegArr() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++) {
            System.out.print("Enter num " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " Positive Even");
                else System.out.println(n + " Positive Odd");
            } else if (n < 0) System.out.println(n + " Negative");
            else System.out.println("Zero");
        }
        if (arr[0] == arr[4]) System.out.println("First and Last Equal");
        else if (arr[0] > arr[4]) System.out.println("First > Last");
        else System.out.println("First < Last");
    }

    static void mulTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] res = new int[10];
        for (int i=1; i<=10; i++) {
            res[i-1] = n * i;
            System.out.println(n + " * " + i + " = " + res[i-1]);
        }
    }

    static void arrSum() {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        int idx = 0;
        while (true) {
            System.out.print("Enter number (<=0 to stop): ");
            double x = sc.nextDouble();
            if (x <= 0 || idx == 10) break;
            arr[idx++] = x;
        }
        for (int i=0; i<idx; i++) sum += arr[i];
        System.out.println("Numbers:");
        for (int i=0; i<idx; i++) System.out.print(arr[i] + " ");
        System.out.println("\nSum = " + sum);
    }

    static void mul6to9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] res = new int[4];
        for (int i=6; i<=9; i++) {
            res[i-6] = n * i;
            System.out.println(n + " * " + i + " = " + res[i-6]);
        }
    }

    static void meanHeight() {
        Scanner sc = new Scanner(System.in);
        double[] h = new double[11];
        double sum = 0;
        for (int i=0; i<11; i++) {
            System.out.print("Enter height of player " + (i+1) + ": ");
            h[i] = sc.nextDouble();
            sum += h[i];
        }
        double mean = sum / 11;
        System.out.println("Mean Height = " + mean);
    }

    static void oddEvenArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int[] even = new int[n/2+1];
        int[] odd = new int[n/2+1];
        int ei=0, oi=0;
        for (int i=1; i<=n; i++) {
            if (i%2==0) even[ei++] = i;
            else odd[oi++] = i;
        }
        System.out.print("Odd: ");
        for (int i=0; i<oi; i++) System.out.print(odd[i]+" ");
        System.out.print("\nEven: ");
        for (int i=0; i<ei; i++) System.out.print(even[i]+" ");
    }

    static void factorsArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int max = 10, idx = 0;
        int[] f = new int[max];
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                if (idx == max) {
                    max *= 2;
                    int[] tmp = new int[max];
                    System.arraycopy(f, 0, tmp, 0, f.length);
                    f = tmp;
                }
                f[idx++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i=0; i<idx; i++) System.out.print(f[i]+" ");
    }

    static void copy2Dto1D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Cols: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.print("Enter val: ");
                mat[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[r*c];
        int idx=0;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                arr[idx++] = mat[i][j];
            }
        }
        System.out.println("1D Array:");
        for (int x: arr) System.out.print(x+" ");
    }

    static void fizzBuzzArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not positive");
            return;
        }
        String[] res = new String[n+1];
        for (int i=1; i<=n; i++) {
            if (i%15==0) res[i]="FizzBuzz";
            else if (i%3==0) res[i]="Fizz";
            else if (i%5==0) res[i]="Buzz";
            else res[i]=String.valueOf(i);
        }
        for (int i=1; i<=n; i++) {
            System.out.println("Position " + i + " = " + res[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.VoteCheck 2.PosNeg 3.MulTable 4.ArrSum 5.Mul6to9");
        System.out.println("6.MeanHeight 7.OddEvenArr 8.FactorsArr 9.Copy2Dto1D 10.FizzBuzzArr");
        System.out.print("Choose option: ");
        int ch = sc.nextInt();
        switch(ch) {
            case 1: voteCheck(); break;
            case 2: posNegArr(); break;
            case 3: mulTable(); break;
            case 4: arrSum(); break;
            case 5: mul6to9(); break;
            case 6: meanHeight(); break;
            case 7: oddEvenArr(); break;
            case 8: factorsArr(); break;
            case 9: copy2Dto1D(); break;
            case 10: fizzBuzzArr(); break;
            default: System.out.println("Invalid choice");
        }
    }
}
