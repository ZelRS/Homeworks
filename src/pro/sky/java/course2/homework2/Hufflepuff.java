package pro.sky.java.course2.homework2;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance,
                      int hardworking, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        if (hardworking < 0 || hardworking > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getName() + "\nФакультет: Пуффендуй\n\nСила магии: " + getPowerOfMagic() + "\nДистанция трансгрессии: " +
                getTransgressionDistance() + "\nТрудолюбие: " + hardworking +
                "\nВерность: " + loyalty +
                "\nЧестность: " + honesty;
    }

}
