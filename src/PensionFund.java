import java.time.LocalDate;
import java.util.Objects;

public class PensionFund {

    private String nameOffund;
    private int numberOfdipositors;
    private LocalDate yearOffundation;
    //getter and setter
    public LocalDate getYearOffundation() {
        return yearOffundation;
    }

    public void setYearOffundation(LocalDate yearOffoundation) {
        this.yearOffundation = yearOffoundation;
    }

    public int getNumberOfdipositors() {
        return numberOfdipositors;
    }

    public void setNumberOfdipositors(int numberOfdipositors) {
        this.numberOfdipositors = numberOfdipositors;
    }

    public String getNameOffund() {
        return nameOffund;
    }

    public void setNameOffund(String nameOffund) {
        this.nameOffund = nameOffund;
    }
    //konstruktor
    public PensionFund(int numberOfdipositors, LocalDate yearOffoundation, String nameOffund) {
        this.numberOfdipositors = numberOfdipositors;
        this.yearOffundation = yearOffoundation;
        this.nameOffund = nameOffund;

    }

    //pension
    public double currentPension(Person person) {

        double pension = person.calcAverage()*70/100;
        return pension;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return numberOfdipositors == that.numberOfdipositors && Objects.equals(nameOffund, that.nameOffund) && Objects.equals(yearOffundation, that.yearOffundation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOffund, numberOfdipositors, yearOffundation);
    }
}





