package pro.sky.java.course2.homework2;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + "\nФакультет: Гриффиндор\n\nСила магии: " + getPowerOfMagic() + "\nДистанция трансгрессии: " +
                getTransgressionDistance() + "\nБлагородство: " + nobility +
                "\nЧесть: " + honor +
                "\nХраборость: " + bravery;
    }
}
