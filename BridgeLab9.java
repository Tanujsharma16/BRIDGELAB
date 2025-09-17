// Level 1 Practice Programs with OOP Concepts
// Constructors, Instance vs Class Variables, and Access Modifiers

// ================== Constructors ==================
class Book {
    String title;
    String author;
    double price;
    boolean availability;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
}

class Circle {
    double radius;

    // Default constructor using chaining
    public Circle() {
        this(1.0); // default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}

class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double RATE_PER_DAY = 1000.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * RATE_PER_DAY;
    }
}

// ================== Instance vs Class Variables ==================
class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

// ================== Access Modifiers ==================
class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("PG Student: " + name + " (Roll: " + rollNumber + "), Specialization: " + specialization);
    }
}

class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookLibrary {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void display() {
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title);
    }
}

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void display() {
        System.out.println("Savings Account of " + accountHolder + " (Acc No: " + accountNumber + ")");
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void display() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department);
    }
}

// ================== Main Class ==================
public class Level1Practice {
    public static void main(String[] args) {
        // Example runs
        Book b1 = new Book("Java Programming", "James Gosling", 499);
        b1.borrowBook();

        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        Person p1 = new Person("Alice", 22);
        Person p2 = new Person(p1);

        CarRental rental = new CarRental("Bob", "SUV", 3);
        System.out.println("Car Rental Cost: " + rental.calculateCost());

        Product p = new Product("Laptop", 55000);
        p.displayProductDetails();
        Product.displayTotalProducts();

        PostgraduateStudent pg = new PostgraduateStudent(101, "Raj", 8.5, "AI");
        pg.display();

        EBook eb = new EBook("12345", "OOP Concepts", "Author X");
        eb.display();

        SavingsAccount sa = new SavingsAccount(1001, "John", 5000);
        sa.display();

        Manager m = new Manager(201, "IT", 80000);
        m.display();
    }
}
