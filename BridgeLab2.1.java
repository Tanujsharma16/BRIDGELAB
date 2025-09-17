import java.util.*;

public class Level2Programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Level 2 Programs Menu ---");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Area of Triangle (cm → sq in & sq cm)");
            System.out.println("3. Side of Square from Perimeter");
            System.out.println("4. Distance (Feet → Yards & Miles)");
            System.out.println("5. Total Purchase Price");
            System.out.println("6. Quotient & Remainder");
            System.out.println("7. Integer Operations");
            System.out.println("8. Double Operations");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();

            if (ch == 0) break;

            switch (ch) {
                case 1: // Basic Calculator
                    System.out.print("Enter number1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Enter number2: ");
                    double n2 = sc.nextDouble();
                    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                            + n1 + " and " + n2 + " is "
                            + (n1 + n2) + ", " + (n1 - n2) + ", " + (n1 * n2) + ", and " + (n1 / n2));
                    break;

                case 2: // Area of Triangle
                    System.out.print("Enter base (cm): ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height (cm): ");
                    double h = sc.nextDouble();
                    double areaCm = 0.5 * b * h;
                    double areaIn = areaCm / (2.54 * 2.54);
                    System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
                    break;

                case 3: // Side of Square
                    System.out.print("Enter perimeter: ");
                    double peri = sc.nextDouble();
                    double side = peri / 4;
                    System.out.println("The length of the side is " + side + " whose perimeter is " + peri);
                    break;

                case 4: // Feet to Yards & Miles
                    System.out.print("Enter distance in feet: ");
                    double ft = sc.nextDouble();
                    double yd = ft / 3;
                    double mi = yd / 1760;
                    System.out.println("The distance in yards is " + yd + " while the distance in miles is " + mi);
                    break;

                case 5: // Total Purchase Price
                    System.out.print("Enter unit price: ");
                    double up = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int q = sc.nextInt();
                    System.out.println("The total purchase price is INR " + (up * q) + " if the quantity " + q + " and unit price is INR " + up);
                    break;

                case 6: // Quotient & Remainder
                    System.out.print("Enter number1: ");
                    int x = sc.nextInt();
                    System.out.print("Enter number2: ");
                    int y = sc.nextInt();
                    int quo = x / y;
                    int rem = x % y;
                    System.out.println("The Quotient is " + quo + " and Remainder is " + rem + " of two numbers " + x + " and " + y);
                    break;

                case 7: // Integer Operations
                    System.out.print("Enter a: ");
                    int a = sc.nextInt();
                    System.out.print("Enter b: ");
                    int bb = sc.nextInt();
                    System.out.print("Enter c: ");
                    int cc = sc.nextInt();
                    int r1 = a + bb * cc;
                    int r2 = a * bb + cc;
                    int r3 = cc + a / bb;
                    int r4 = a % bb + cc;
                    System.out.println("The results of Int Operations are " + r1 + ", " + r2 + ", " + r3 + ", " + r4);
                    break;

                case 8: // Double Operations
                    System.out.print("Enter a: ");
                    double da = sc.nextDouble();
                    System.out.print("Enter b: ");
                    double db = sc.nextDouble();
                    System.out.print("Enter c: ");
                    double dc = sc.nextDouble();
                    double dr1 = da + db * dc;
                    double dr2 = da * db + dc;
                    double dr3 = dc + da / db;
                    double dr4 = da % db + dc;
                    System.out.println("The results of Double Operations are " + dr1 + ", " + dr2 + ", " + dr3 + ", " + dr4);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
