import java.util.*;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Age of Harry
        int by = 2000, cy = 2024;
        int age = cy - by;
        System.out.println("Harry's age in " + cy + " is " + age);

        // 2. Sam's average marks
        int m = 94, p = 95, c = 96;
        int avg = (m + p + c) / 3;
        System.out.println("Sam’s average mark in PCM is " + avg);

        // 3. Km to miles
        double km1 = 10.8, miles1 = km1 / 1.6;
        System.out.println("The distance " + km1 + " km in miles is " + miles1);

        // 4. Profit and Profit %
        int cp = 129, sp = 191;
        int prof = sp - cp;
        double profPer = (prof * 100.0) / cp;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp +
                "\nThe Profit is INR " + prof + " and the Profit Percentage is " + profPer);

        // 5. Divide pens
        int pens = 14, stu = 3;
        int perStu = pens / stu, rem = pens % stu;
        System.out.println("The Pen Per Student is " + perStu + " and the remaining pen not distributed is " + rem);

        // 6. Fee discount fixed
        double fee = 125000, discPer = 10;
        double disc = fee * discPer / 100;
        double finalFee = fee - disc;
        System.out.println("The discount amount is INR " + disc + " and final discounted fee is INR " + finalFee);

        // 7. Volume of Earth
        double r = 6378;
        double volKm = (4.0 / 3) * Math.PI * r * r * r;
        double volMile = volKm / (1.6 * 1.6 * 1.6);
        System.out.println("The volume of earth in cubic kilometers is " + volKm + " and cubic miles is " + volMile);

        // 8. Km to miles (user input)
        System.out.print("Enter km: ");
        double km2 = sc.nextDouble();
        double miles2 = km2 / 1.6;
        System.out.println("The total miles is " + miles2 + " mile for the given " + km2 + " km");

        // 9. Fee discount (user input)
        System.out.print("Enter fee: ");
        double fee2 = sc.nextDouble();
        System.out.print("Enter discount %: ");
        double d2 = sc.nextDouble();
        double dis2 = fee2 * d2 / 100;
        double finalFee2 = fee2 - dis2;
        System.out.println("The discount amount is INR " + dis2 + " and final discounted fee is INR " + finalFee2);

        // 10. Height in cm to feet+inches
        System.out.print("Enter height in cm: ");
        double h = sc.nextDouble();
        double inch = h / 2.54;
        double ft = (int) (inch / 12);
        double inchRem = inch % 12;
        System.out.println("Your Height in cm is " + h + " while in feet is " + ft + " and inches is " + inchRem);

        // 11. Calculator
        System.out.print("Enter number1: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double n2 = sc.nextDouble();
        System.out.println("Addition: " + (n1 + n2) +
                ", Subtraction: " + (n1 - n2) +
                ", Multiplication: " + (n1 * n2) +
                ", Division: " + (n1 / n2));

        // 12. Area of triangle
        System.out.print("Enter base: ");
        double b = sc.nextDouble();
        System.out.print("Enter height: ");
        double ht = sc.nextDouble();
        double areaIn = 0.5 * b * ht;
        double areaCm = areaIn * 6.4516; // 1 inch^2 = 6.4516 cm^2
        System.out.println("Area of triangle is " + areaIn + " square inches and " + areaCm + " square cm");

        // 13. Side of square from perimeter
        System.out.print("Enter perimeter: ");
        double peri = sc.nextDouble();
        double side = peri / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + peri);

        // 14. Distance feet to yards and miles
        System.out.print("Enter distance in feet: ");
        double ft2 = sc.nextDouble();
        double yd = ft2 / 3;
        double mi = yd / 1760;
        System.out.println("The distance is " + yd + " yards and " + mi + " miles");

        // 15. Purchase total
        System.out.print("Enter unit price: ");
        double up = sc.nextDouble();
        System.out.print("Enter qty: ");
        int q = sc.nextInt();
        double total = up * q;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + q + " and unit price is INR " + up);

        // 16. Handshakes
        System.out.print("Enter number of students: ");
        int ns = sc.nextInt();
        int hs = (ns * (ns - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + hs);

        sc.close();
    }
}
