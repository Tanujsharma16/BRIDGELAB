class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber +
                ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", 1, 85);
        s.display();
    }
}
