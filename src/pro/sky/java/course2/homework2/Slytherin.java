package pro.sky.java.course2.homework2;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            System.out.println("Ваше число некорректно! Значение должно быть в интервале от 0 до 100.");
            return;
        }
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return getName() + "\nФакультет: Слизерин\n\nСила магии: " + getPowerOfMagic() + "\nДистанция трансгрессии: " +
                getTransgressionDistance() + "\nХитрость: " + cunning +
                "\nРешительность: " + determination +
                "\nАмбициозность: " + ambition + "\nНаходчивость: " + resourcefulness + "\nЖажда власти: " + lustForPower;
    }

}
