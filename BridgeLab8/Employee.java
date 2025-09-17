class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 101, 50000);
        emp.displayDetails();
    }
}
