package pro.sky.java.course1.coursework;

public class Employee {
    private static int count = 1;
    private final int id;
    private int numOfDepartment;
    private final String name;
    private int salary;

    public Employee(int numOfDepartment, String name, int salary) {
        this.id = count++;
        this.numOfDepartment = numOfDepartment;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public int getNumOfDepartment() {
        return numOfDepartment;
    }

    public void setNumOfDepartment(int numOfDepartment) {
        if (numOfDepartment < 1 || numOfDepartment > 5) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        this.numOfDepartment = numOfDepartment;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ". (" + numOfDepartment + " отдел) " + name + " | Зарплата: " + salary + " руб.";
    }
}
