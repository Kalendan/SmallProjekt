import java.util.Random;

public class Retired extends Person implements AvailableTowork {
    private  static final int CONSTANT_MEDIUM = 2000;
    String a = "Я вообще-то на пенсии";
    String b = "Ладно, немного поработаю";
    Random random = new Random();
    public void setRandom(Random random) {
        this.random = random;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    double calcAverage() {

        double maxSalary = getMaxSalary();
        double minSalary = getMinSalary();
        double result = Util.averageVelue2(minSalary,maxSalary,CONSTANT_MEDIUM);
        return result;
    }

    @Override
    public String toString() {
        return "Retired{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    @Override
    public void goTowork() {
        random.nextInt();

    }


}