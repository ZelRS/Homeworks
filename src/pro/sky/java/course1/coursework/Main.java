package pro.sky.java.course1.coursework;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

//      Добавление сотрудников и удаление
        employeeBook.createEmployee(1, "Груздев Пётр Евгеньевич", 104_777);
        employeeBook.createEmployee(1, "Пивоваров Иван Дмитриевич", 108_753);
        employeeBook.createEmployee(2, "Ким Виктор Петрович", 103_123);
        employeeBook.createEmployee(2, "Краснов Степан Иванович", 110_916);
        employeeBook.createEmployee(3, "Прокофьев Алексеей Алекссевич", 111_556);
        employeeBook.createEmployee(3, "Суздальцев Константин Захарович", 100_761);
        employeeBook.createEmployee(4, "Харитонов Денис Павлович", 106_943);
        employeeBook.createEmployee(4, "Перевязенцев Михаил Романович", 101_887);
        employeeBook.createEmployee(5, "Матвеев Вадим Михайлович", 100_901);
        employeeBook.createEmployee(5, "Бук Андрей Денисович", 111_116);
        employeeBook.removeEmployee(5);
        employeeBook.createEmployee(5, "Исмаилов Степан Харитонович", 103_457);
//      Изменение номера отдела выбранного сотрудника
        employeeBook.changeNumOfDepOfEmployee("Бук Андрей Денисович", 3);
//      Изменение зарплаты выбранного сотрудника
        employeeBook.changeSalaryOfEmployee("Бук Андрей Денисович", 111_115);
//      Список сотрудников по отделам
        employeeBook.printEmployeesByDep();
        separator();
//      Список всех сотрудников без учета отдела
        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ КОМПАНИИ:");
        employeeBook.getListOfEmployees();
        separator();
//      Список полной информации по всем сотрудникам с учетом общей индексации и индексации внутри отдела
        System.out.println("ИНФОРМАЦИЯ ПО ВСЕМ СОТРУДНИКАМ КОМПАНИИ:");
        employeeBook.indexSalary(5);
        employeeBook.indexSalaryOfDep(7, 5);
        employeeBook.printAllInformationOfEmployees();
        separator();
//      Общая сумма и средняя сумма всех зарплат, минимальная и максимальнная зарплата среди всех сотрудников
        System.out.println("СТАТИСТИКА ПО ВСЕМ СТОРУДНИКАМ КОМПАНИИ:");
        employeeBook.calculateSum();
        employeeBook.findMaxSalary();
        employeeBook.findMinSalary();
        separator();
        separator();
//      Список полной информации среди сотрудников выбранного отдела
        employeeBook.printListOfEmployeesOfDep(5);
        separator();
//      Общая сумма и средняя сумма всех зарплат, минимальная и максимальнная зарплата среди сотрудников выбранного отдела
        System.out.println("СТАТИСТИКА ПО ОТДЕЛАМ:");
        employeeBook.calculateSumOfDep(5);
        employeeBook.findMinSalaryOfDep(5);
        employeeBook.findMaxSalaryOfDep(5);
        separator();
//      Сотрудники с зарплатой меньше указанной суммы
        employeeBook.findEmployeesWithSalaryLess(110_000);
        separator();
//      Сотрудники с зарплатой больше указанной суммы
        employeeBook.findEmployeesWithSalaryMore(110_000);
        separator();
    }

    private static void separator() {
        System.out.println("=========================================================================================");
    }
}
