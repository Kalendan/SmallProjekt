
public class Worker extends Person implements AvailableTowork {


    @Override
    double calcAverage() {

        double maxSalary = getMaxSalary();
        double minSalary = getMinSalary();
        double result = Util.averageVelue1(minSalary,maxSalary);
        return result;
    }

    @Override
    public void goTowork() {
        System.out.println("Я счастливо шагаю на работу");
    }
}
