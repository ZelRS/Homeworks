package pro.sky.java.course2.homework2;

public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 82, 38,
                        85, 42, 73),
                new Gryffindor("Гермиона Грейнджер", 85, 70,
                        45, 70, 64),
                new Gryffindor("Рон Уизли", 89, 42,
                        38, 47, 64)
        };

        Slytherin[] slytherin = {
                new Slytherin("Драко Малфой", 64, 58,
                        83, 53, 69, 30, 82),
                new Slytherin("Грэхэм Монтегю", 63, 86,
                        55, 81, 68, 33, 43),
                new Slytherin("Грегори Гойл", 76, 73,
                        86, 37, 54, 32, 41)
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария Смит", 48, 40,
                        86, 62, 75),
                new Hufflepuff("Седрик Диггори", 66, 35,
                        51, 54, 41),
                new Hufflepuff("Джастин Финч-Флетчли", 52, 33,
                        59, 51, 37)
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 32, 49,
                        43, 69, 55, 40),
                new Ravenclaw("Падма Патил", 46, 39,
                        72, 47, 76, 47),
                new Ravenclaw("Маркус Белби", 36, 50,
                        58, 42, 82, 67)
        };

        InfoService infoService = new InfoService();
        infoService.printStudentInf(slytherin, "Драко Малфой");
        separator();

        infoService.compareTwoStudentsOfFaculty(gryffindor, "Гарри Поттер", "Гермиона Грейнджер");
        infoService.compareTwoStudentsOfFaculty(slytherin, "Драко Малфой", "Грэхэм Монтегю");
        infoService.compareTwoStudentsOfFaculty(hufflepuff, "Захария Смит", "Седрик Диггори");
        infoService.compareTwoStudentsOfFaculty(ravenclaw, "Чжоу Чанг", "Маркус Белби");
        separator();

        infoService.compareTwoStudentsOfHogwarts(ravenclaw, "Падма Патил", slytherin, "Грегори Гойл");

    }

    private static void separator() {
        System.out.println("=========================================");
    }
}
