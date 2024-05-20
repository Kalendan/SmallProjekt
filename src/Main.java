import java.time.LocalDate;
import java.util.Random;

    public class Main {
        public static void main(String[] args) {

            PensionFund pensionFund = new PensionFund(200000, LocalDate.of(1990, 06, 12), "National Fund");
            Teenager teenager = new Teenager();
            Worker worker = new Worker();
            Retired retired = new Retired();

            teenager.calcAverage();
            worker.goTowork();
            retired.goTowork();}

    }

