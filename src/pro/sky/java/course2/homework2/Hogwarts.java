package pro.sky.java.course2.homework2;

public abstract class Hogwarts {
    private final String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        if (powerOfMagic < 0 || powerOfMagic > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance < 0 || transgressionDistance > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.transgressionDistance = transgressionDistance;
    }


}
