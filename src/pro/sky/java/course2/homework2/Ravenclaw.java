package pro.sky.java.course2.homework2;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (smart < 0 || smart > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        if (witty < 0 || witty > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + "\nФакультет: Когтевран\n\nСила магии: " + getPowerOfMagic() + "\nДистанция трансгрессии: " +
                getTransgressionDistance() + "\nУм: " + smart +
                "\nМудрость: " + wise +
                "\nОстроумие: " + witty + "\nТворчество: " + creativity;
    }

}
