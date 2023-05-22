package pro.sky.java.course2.homework2;

public class InfoService {

    public void printStudentInf(Hogwarts[] hogwarts, String name) {
        for (int i = 0; i < hogwarts.length; i++) {
            if (name.equals(hogwarts[i].getName())) {
                System.out.println(hogwarts[i]);
            }
        }
    }

    public void compareTwoStudentsOfFaculty(Gryffindor[] gryffindor, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (Gryffindor value : gryffindor) {
            if (value.getName().equals(name1)) {
                sum1 = value.getNobility() + value.getHonor() + value.getBravery();
            }
            if (value.getName().equals(name2)) {
                sum2 = value.getNobility() + value.getHonor() + value.getBravery();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Гриффиндорец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Гриффиндорец, чем " + name1);
        }
    }

    public void compareTwoStudentsOfFaculty(Slytherin[] slytherin, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (Slytherin value : slytherin) {
            if (value.getName().equals(name1)) {
                sum1 = value.getCunning() + value.getAmbition() + value.getDetermination() +
                        value.getLustForPower() + value.getResourcefulness();
            }
            if (value.getName().equals(name2)) {
                sum2 = value.getCunning() + value.getAmbition() + value.getDetermination() +
                        value.getLustForPower() + value.getResourcefulness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Слизеринец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Слизеринец, чем " + name1);
        }
    }

    public void compareTwoStudentsOfFaculty(Hufflepuff[] hufflepuff, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (Hufflepuff value : hufflepuff) {
            if (value.getName().equals(name1)) {
                sum1 = value.getHardworking() + value.getHonesty() + value.getLoyalty();
            }
            if (value.getName().equals(name2)) {
                sum2 = value.getHardworking() + value.getHonesty() + value.getLoyalty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Пуффендуец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Пуффендуец, чем " + name1);
        }
    }

    public void compareTwoStudentsOfFaculty(Ravenclaw[] ravenclaw, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (Ravenclaw value : ravenclaw) {
            if (value.getName().equals(name1)) {
                sum1 = value.getSmart() + value.getWise() + value.getCreativity() +
                        value.getWitty();
            }
            if (value.getName().equals(name2)) {
                sum2 = value.getSmart() + value.getWise() + value.getCreativity() +
                        value.getWitty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Когтевранец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Когтевранец, чем " + name1);
        }
    }

    public void compareTwoStudentsOfHogwarts(Hogwarts[] hogwarts1, String name1, Hogwarts[] hogwarts2, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (Hogwarts hogwarts : hogwarts1) {
            if (hogwarts.getName().equals(name1)) {
                sum1 = hogwarts.getPowerOfMagic() + hogwarts.getTransgressionDistance();
            }
        }
        for (Hogwarts hogwarts : hogwarts2) {
            if (hogwarts.getName().equals(name2)) {
                sum2 = hogwarts.getPowerOfMagic() + hogwarts.getTransgressionDistance();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " по общим навыкам среди всех учеников Хогвардса лучше, чем " + name2);
        } else {
            System.out.println(name2 + " по общим навыкам среди всех учеников Хогвардса лучше, чем " + name1);
        }
    }
}
