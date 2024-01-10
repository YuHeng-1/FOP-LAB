package lab10;

public abstract class Employee {

    private String name, type;
    private double salary;

    public void setEmployee(String n, String t) {
        name = n;
        type = t;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void display() {
        System.out.println(name + " " + type);
        System.out.println("Salary is " + salary);
    }

    public abstract double computeSalary();
    // abstract method - method declared without providing an implementation
}
