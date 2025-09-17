package com.bridgelabz.oops.inbuiltfunction;

class BankAccount {
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        BankAccount.getTotalAccounts();

        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}

class Book {
    private static String libraryName;
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

class Library {
    public static void main(String[] args) {
        Book.setLibraryName("Egmore Library");
        Book.displayLibraryName();
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        book1.displayBookDetails();
    }
}

class Company {
    private static String companyName;
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    public Company(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Company) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Company.setCompanyName("Tech Solutions Inc.");
        Company emp1 = new Company("Thamarai", 101, "Software Engineer");
        Company emp2 = new Company("Rohan", 102, "Project Manager");
        Company.displayTotalEmployees();
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}

class Product {
    private static double discount = 0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        }
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        }
    }

    public static void main(String[] args) {
        Product.updateDiscount(10.0);
        Product product1 = new Product("P001", "Laptop", 1200.00, 5);
        Product product2 = new Product("P002", "Smartphone", 800.00, 10);
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}

class Student {
    private static String universityName;
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        }
    }

    public static void main(String[] args) {
        Student.setUniversityName("Global University");
        Student student1 = new Student("Hemashree", 101, 'A');
        Student student2 = new Student("Sharmila", 102, 'B');
        Student.displayTotalStudents();
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student2.updateGrade('A');
        student2.displayStudentDetails();
    }
}

class Vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        }
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);
        Vehicle vehicle1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price danish", "SUV", "XYZ789");
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}

class Patient {
    private static String hospitalName;
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient.setHospitalName("City Hospital");
        Patient patient1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient patient2 = new Patient("Lidiya", 45, "Fracture", "P002");
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
    }
}
