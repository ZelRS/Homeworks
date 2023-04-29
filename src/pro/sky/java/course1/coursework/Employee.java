package pro.sky.java.course1.coursework;

public class Employee {
    private static int count;
    private final int id;
    private int numOfDepartment;
    private final String name;
    private int salary;

    public Employee(int numOfDepartment, String name, int salary) {
        this.id = ++count;
        this.numOfDepartment = numOfDepartment;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return this.id;
    }

    public int getNumOfDepartment() {
        return this.numOfDepartment;
    }

    public void setNumOfDepartment(int numOfDepartment) {
        if (numOfDepartment < 1 || numOfDepartment > 5) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        this.numOfDepartment = numOfDepartment;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id + ". (" + this.numOfDepartment + " отдел) " + this.name + " | Зарплата: " + this.salary + " руб.";
    }
}
