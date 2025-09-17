package com.example.relationships;

import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.enroll(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}


class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }
}


class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        System.out.println(name + " consulted " + p.getName());
        patients.add(p);
        p.addDoctor(this);
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public String getName() {
        return name;
    }
}

class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }
}


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order by " + customer.getName());
        for (Product p : products) {
            System.out.println("- " + p.getName());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        System.out.println(name + " is teaching " + course.getName());
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun");
        Student s2 = new Student("Meera");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        School school = new School("City School");

        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);
        school.addStudent(s1);
        school.addStudent(s2);
        school.showStudents();
        s1.showCourses();
        c1.showStudents();

        University uni = new University("Global Uni");
        uni.addDepartment(new Department("Computer Science"));
        uni.addDepartment(new Department("Physics"));
        uni.addFaculty(new Faculty("Prof. Raman"));
        uni.addFaculty(new Faculty("Prof. Iyer"));
        uni.showDetails();

        Doctor d1 = new Doctor("Dr. Smith");
        Patient p1 = new Patient("Anita");
        d1.consult(p1);

        Customer cust = new Customer("Rahul");
        Order order = new Order(cust);
        order.addProduct(new Product("Laptop", 60000));
        order.addProduct(new Product("Mouse", 500));
        order.showOrder();

        Professor prof = new Professor("Prof. Mehta");
        prof.assignCourse(c2);
    }
}
