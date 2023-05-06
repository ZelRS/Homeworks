package pro.sky.java.course1.coursework;

public class EmployeeBook {
    private final int DEP_COUNT = 5;
    private final int EMPLOYEE_SIZE = 10;
    private final Employee[] employees = new Employee[EMPLOYEE_SIZE];

    public void createEmployee(int numOfDepartment, String name, int salary) {
        int index = findFreeIndex();
        if (index == -1) {
            System.out.println("Хранилище заполнено! Нельзя создать нового сотрудника.");
        } else {
            employees[index] = new Employee(numOfDepartment, name, salary);
        }

    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeSalaryOfEmployee(String name, int salary) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (name.equals(employee.getName())) {
                    employee.setSalary(salary);
                }
            }
        }
    }

    public void changeNumOfDepOfEmployee(String name, int numOfDepartment) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (name.equals(employee.getName())) {
                    employee.setNumOfDepartment(numOfDepartment);
                }
            }
        }
    }

    public void printEmployeesByDep() {
        for (int i = 1; i <= DEP_COUNT; i++) {
            System.out.println("------");
            System.out.println("Отдел " + i + ": ");
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getNumOfDepartment() == i) {
                        System.out.println("Сотрудник: " + employee.getName());
                    }
                }
            }
        }
    }

    public void getListOfEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getId() + ". " + employee.getName());
            }
        }
    }

    public void printAllInformationOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public void indexSalary(int percentIndexation) {
        if (percentIndexation < 0) {
            throw new IllegalArgumentException("Нельзя индексировать зарплату отрицательным числом!");
        }
        if (percentIndexation > 0) {
            System.out.println("(зарплата всех сотрудников проиндексирована на " + percentIndexation + " процентов)");
            float index = percentIndexation / 100f;
            for (Employee employee : employees) {
                if (employee != null) {
                    int newSalary;
                    newSalary = employee.getSalary();
                    newSalary = (int) (newSalary + (newSalary * index));
                    employee.setSalary(newSalary);
                }
            }
        }
    }

    public void findMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary.getSalary() > employee.getSalary()) {
                    minSalary = employee;
                }
            }
        }
        System.out.println("Минимальная зарплата в компании у сотрудника по имени " + minSalary.getName());
    }

    public void findMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary.getSalary() < employee.getSalary()) {
                    maxSalary = employee;
                }
            }
        }
        System.out.println("Максимальная зарплата в компании у сотрудника по имени " + maxSalary.getName());
    }

    public void calculateSum() {
        int sum = 0;
        int midSum;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        midSum = sum / employees.length;
        System.out.println("Сумма зарплат в компании: " + sum + " руб.\nСредняя сумма зарплат в компании: " + midSum + " руб.");
    }

    public void printListOfEmployeesOfDep(int numOfDep) {
        if (numOfDep <= 0 || numOfDep > 5) {
            throw new IllegalArgumentException("В компании нет " + numOfDep + "-го отдела!");
        }
        System.out.println("ИНФОРМАЦИЯ ПО СОТРУДНИКАМ " + numOfDep + "-ГО ОТДЕЛА:");
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getNumOfDepartment() == numOfDep) {
                    counter++;
                    System.out.println(counter + ". " + employee.getName() + " | Зарпалата: " +
                            employee.getSalary() + " руб.");
                }
            }
        }
    }

    public void findMinSalaryOfDep(int numOfDep) {
        Employee minSalary = employees[0];
        if (numOfDep <= 0 || numOfDep > 5) {
            throw new IllegalArgumentException("В компании нет " + numOfDep + "-го отдела!");
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary.getSalary() > employee.getSalary() && employee.getNumOfDepartment() == numOfDep) {
                    minSalary = employee;
                }
            }
        }
        System.out.println("Минимальная зарплата в " + numOfDep + "-м отделе у сотрудника по имени " + minSalary.getName());
    }

    public void findMaxSalaryOfDep(int numOfDep) {
        Employee maxSalary = employees[0];
        if (numOfDep <= 0 || numOfDep > 5) {
            throw new IllegalArgumentException("В компании нет " + numOfDep + "-го отдела!");
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary.getSalary() < employee.getSalary() && employee.getNumOfDepartment() == numOfDep) {
                    maxSalary = employee;
                }
            }
        }
        System.out.println("Ммаксимальная зарплата в " + numOfDep + "-м отделе у сотрудника по имени " + maxSalary.getName());
    }

    public void calculateSumOfDep(int numOfDep) {
        int sum = 0;
        int midSum;
        int counter = 0;
        if (numOfDep <= 0 || numOfDep > 5) {
            throw new IllegalArgumentException("В компании нет " + numOfDep + "-го отдела!");
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getNumOfDepartment() == numOfDep) {
                    counter++;
                    sum += employee.getSalary();
                }
            }
        }
        midSum = sum / counter;
        System.out.println("Сумма зарплат в " + numOfDep + "-м отделе: " + sum + " руб.\nСредняя сумма зарплат в " +
                numOfDep + "-м отделе: " + midSum + " руб. ");
    }

    public void indexSalaryOfDep(int percentIndexation, int numOfDep) {
        if (percentIndexation < 0) {
            throw new IllegalArgumentException("Нельзя индексировать зарплату отрицательным числом!");
        }
        if (numOfDep <= 0 || numOfDep > 5) {
            throw new IllegalArgumentException("В компании нет " + numOfDep + "-го отдела!");
        }

        if (percentIndexation > 0) {
            System.out.println("(зарплата сотрудников " + numOfDep + "-го отдела проиндексирована на " +
                    percentIndexation + " процентов)");
            float index = percentIndexation / 100f;
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getNumOfDepartment() == numOfDep) {
                        int newSalary = employee.getSalary();
                        newSalary = (int) (newSalary + (newSalary * index));
                        employee.setSalary(newSalary);
                    }
                }
            }
        }
    }

    public void findEmployeesWithSalaryLess(int salary) {
        System.out.println("РАБОТНИКИ С ЗАРПЛАТОЙ МЕНЬШЕ " + salary + " РУБ.:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < salary) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void findEmployeesWithSalaryMore(int salary) {
        System.out.println("РАБОТНИКИ С ЗАРПЛАТОЙ БОЛЬШЕ " + salary + " РУБ.:");
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > salary) {
                    System.out.println(employee);
                }
            }
        }
    }

    private int findFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

}
