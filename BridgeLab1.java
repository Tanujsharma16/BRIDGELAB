import java.util.Scanner;

public class BridgelabzPrograms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uncomment the method you want to run
        
        //welcomeMessage();
        // addTwoNumbers(scanner);
        // celsiusToFahrenheit(scanner);
        // areaOfCircle(scanner);
        // volumeOfCylinder(scanner);
        // calculateSimpleInterest(scanner);
        // perimeterOfRectangle(scanner);
        // powerCalculation(scanner);
        // averageOfThreeNumbers(scanner);
        // kilometersToMiles(scanner);

        scanner.close();
    }

    // 1. Welcome Message
    public static void welcomeMessage() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public static void addTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    // 3. Celsius to Fahrenheit Conversion
    public static void celsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    // 4. Area of a Circle
    public static void areaOfCircle(Scanner scanner) {
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    // 5. Volume of a Cylinder
    public static void volumeOfCylinder(Scanner scanner) {
        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }

    // Self Problem 1: Calculate Simple Interest
    public static void calculateSimpleInterest(Scanner scanner) {
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    // Self Problem 2: Perimeter of a Rectangle
    public static void perimeterOfRectangle(Scanner scanner) {
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Self Problem 3: Power Calculation
    public static void powerCalculation(Scanner scanner) {
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }

    // Self Problem 4: Average of Three Numbers
    public static void averageOfThreeNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }

    // Self Problem 5: Convert Kilometers to Miles
    public static void kilometersToMiles(Scanner scanner) {
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}
