import java.util.*;

public class Level1Programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // System.out.println("\n--- Level 1 Programs Menu ---");
            // System.out.println("1. Harry's Age");
            // System.out.println("2. Sam's Average Marks");
            // System.out.println("3. KM to Miles (10.8 km)");
            // System.out.println("4. Profit and Profit %");
            // System.out.println("5. Pens Division");
            // System.out.println("6. University Discount (fixed)");
            // System.out.println("7. Volume of Earth");
            // System.out.println("8. KM to Miles (input)");
            // System.out.println("9. Fee Discount (input)");
            // System.out.println("10. Height cm to ft & in");
            // System.out.println("11. Calculator");
            // System.out.println("12. Area of Triangle");
            // System.out.println("13. Side of Square");
            // System.out.println("14. Feet to Yards & Miles");
            // System.out.println("15. Total Price");
            // System.out.println("16. Max Handshakes");
            // System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();

            if (ch == 0) break;

            switch (ch) {
                case 1:
                    int by = 2000, cy = 2024;
                    System.out.println("Harry's age in " + cy + " is " + (cy - by));
                    break;

                case 2:
                    int m = 94, p = 95, c = 96;
                    System.out.println("Sam’s average mark in PCM is " + ((m + p + c) / 3.0));
                    break;

                case 3:
                    double km1 = 10.8;
                    System.out.println("The distance " + km1 + " km in miles is " + (km1 / 1.6));
                    break;

                case 4:
                    int cp = 129, sp = 191, prof = sp - cp;
                    double pp = (prof * 100.0) / cp;
                    System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp);
                    System.out.println("The Profit is INR " + prof + " and the Profit Percentage is " + pp);
                    break;

                case 5:
                    int pens = 14, stu = 3;
                    System.out.println("The Pen Per Student is " + (pens / stu) + " and the remaining pen not distributed is " + (pens % stu));
                    break;

                case 6:
                    double fee1 = 125000, d1 = 10;
                    double dis1 = (fee1 * d1) / 100;
                    System.out.println("The discount amount is INR " + dis1 + " and final discounted fee is INR " + (fee1 - dis1));
                    break;

                case 7:
                    double r = 6378;
                    double vkm = (4.0 / 3) * Math.PI * Math.pow(r, 3);
                    double vm = vkm / Math.pow(1.6, 3);
                    System.out.println("The volume of earth in cubic kilometers is " + vkm + " and cubic miles is " + vm);
                    break;

                case 8:
                    System.out.print("Enter km: ");
                    double km2 = sc.nextDouble();
                    System.out.println("The total miles is " + (km2 / 1.6) + " mile for the given " + km2 + " km");
                    break;

                case 9:
                    System.out.print("Enter fee: ");
                    double fee2 = sc.nextDouble();
                    System.out.print("Enter discount %: ");
                    double d2 = sc.nextDouble();
                    double dis2 = (fee2 * d2) / 100;
                    System.out.println("The discount amount is INR " + dis2 + " and final discounted fee is INR " + (fee2 - dis2));
                    break;

                case 10:
                    System.out.print("Enter height in cm: ");
                    double cm = sc.nextDouble();
                    double totIn = cm / 2.54;
                    int ft = (int)(totIn / 12);
                    double inch = totIn % 12;
                    System.out.println("Your Height in cm is " + cm + " while in feet is " + ft + " and inches is " + inch);
                    break;

                case 11:
                    System.out.print("Enter num1: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter num2: ");
                    double b = sc.nextDouble();
                    System.out.println("Add=" + (a + b) + " Sub=" + (a - b) + " Mul=" + (a * b) + " Div=" + (a / b));
                    break;

                case 12:
                    System.out.print("Enter base: ");
                    double b1 = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h1 = sc.nextDouble();
                    double areaIn = 0.5 * b1 * h1;
                    double areaCm = areaIn * 6.4516;
                    System.out.println("Area of triangle is " + areaIn + " sq inches and " + areaCm + " sq cm");
                    break;

                case 13:
                    System.out.print("Enter perimeter: ");
                    double peri = sc.nextDouble();
                    System.out.println("The length of the side is " + (peri / 4) + " whose perimeter is " + peri);
                    break;

                case 14:
                    System.out.print("Enter feet: ");
                    double ft2 = sc.nextDouble();
                    double yd = ft2 / 3;
                    double mi = yd / 1760;
                    System.out.println("The distance is " + ft2 + " feet = " + yd + " yards = " + mi + " miles");
                    break;

                case 15:
                    System.out.print("Enter unit price: ");
                    double up = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int q = sc.nextInt();
                    System.out.println("The total purchase price is INR " + (up * q) + " if the quantity " + q + " and unit price is INR " + up);
                    break;

                case 16:
                    System.out.print("Enter number of students: ");
                    int n = sc.nextInt();
                    int hs = (n * (n - 1)) / 2;
                    System.out.println("The maximum number of handshakes among " + n + " students is " + hs);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
