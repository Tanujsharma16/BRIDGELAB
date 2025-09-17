import java.util.*;

class Subject {
    String subjectName;
    int marks;
    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
}

class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void addSubject(Subject subject) {
        subjects.add(subject);
    }
    List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.getSubjects()) {
            total += s.marks;
        }
        int avg = total / student.getSubjects().size();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }
}

class Product {
    String productName;
    int quantity;
    double pricePerUnit;
    Product(String productName, int quantity, double pricePerUnit) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    List<Product> products = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }
    void addProduct(Product product) {
        products.add(product);
    }
    List<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);
        System.out.println(student.name + "'s Grade: " + grade);

        Customer customer = new Customer("Alice");
        customer.addProduct(new Product("Apples", 2, 3));
        customer.addProduct(new Product("Milk", 1, 2));
        BillGenerator billGen = new BillGenerator();
        double totalBill = billGen.generateBill(customer);
        System.out.println(customer.name + "'s Total Bill: $" + totalBill);
    }
}
