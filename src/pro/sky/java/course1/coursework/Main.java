package pro.sky.java.course1.coursework;

public class Main {
    private static final Employee[] employees = new Employee[10];

    private static void registerOfEmployees() {
        employees[0] = new Employee(1, "Груздев Пётр Евгеньевич", 104_777);
        employees[1] = new Employee(1, "Пивоваров Иван Дмитриевич", 108_753);
        employees[2] = new Employee(2, "Ким Виктор Петрович", 103_123);
        employees[3] = new Employee(2, "Краснов Степан Иванович", 110_916);
        employees[4] = new Employee(3, "Прокофьев Алексеей Алекссевич", 111_556);
        employees[5] = new Employee(3, "Суздальцев Константин Захарович", 100_761);
        employees[6] = new Employee(4, "Харитонов Денис Павлович", 106_943);
        employees[7] = new Employee(4, "Перевязенцев Михаил Романович", 101_887);
        employees[8] = new Employee(5, "Матвеев Вадим Михайлович", 100_901);
        employees[9] = new Employee(5, "Бук Андрей Денисович", 111_116);
    }

    public static void main(String[] args) {
        registerOfEmployees();

        employees[1].setSalary(102_420);
        employees[4].setNumOfDepartment(5);

        separator();
        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ КОМПАНИИ: ");
        separator();
        getListOfEmployees();


        separator();
        System.out.println("ПОЛНАЯ ИНФОРМАЦИЯ ПО ВСЕМ СОТРУДНИКАМ КОМПАНИИ:");
        separator();
        indexSalary(10);
        printAllInformationOfEmployees();

        separator();
        System.out.println("СТАТИСТИКА КОМПАНИИ");
        separator();

        calculateSum();
        findMaxSalary();
        findMinSum();
        System.out.println();
        separator();
    }

    public static void printAllInformationOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void indexSalary(int percentIndexation) {
        if (percentIndexation < 0) {
            throw new IllegalArgumentException("Нельзя индексировать зарплату отрицательным числом!");
        }
        if (percentIndexation > 0) {
            System.out.println("(зарплата проиндексирована на " + percentIndexation + " процентов)");
            float index = percentIndexation / 100f;
            for (Employee employee : employees) {
                int newSalary = employee.getSalary();
                newSalary = (int) (newSalary + (newSalary * index));
                employee.setSalary(newSalary);
            }
        }
    }

    public static void calculateSum() {
        int sum = 0;
        int midSum;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        midSum = sum / employees.length;
        System.out.println("Сумма зарплат в компании: " + sum + " руб.\nСредняя сумма зарплат в компании: " + midSum + " руб.");
    }

    public static void findMaxSalary() {
        int maxSalary = 0;
        String name = "";
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println("Максимальная зарплата в компании у сотрудника по имени " + name);
    }

    public static void findMinSum() {
        int minSalary = 1_000_000;
        String name = "";
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println("Минимальная зарплата в компании у сотрудника по имени " + name);
    }

    public static void getListOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ". " + employee.getName());
        }
    }

    public static void separator() {
        System.out.println("==========================================================");
    }
}
