import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {
    private String street;
    private int number;
    private int index;
    private String country;
    private double maxSalary;
    private double minSalary;
    private String name;
    private int age;
    private double height;
    private LocalDate birthday;
    private int amountOfchildren;
    private static final int MIN_AGE = 18;


    // getter and setter

    public double getMaxSalary() {
        return maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private void setIndex(int index) {
        this.index = index;
    }

    private void setCountry(String country) {
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getAmountOfchildren() {
        return amountOfchildren;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getExperience() {
        int experience = age - MIN_AGE;
        return experience;


    }

    // Methods
    public void personInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("Children:" + amountOfchildren);
        System.out.println("Birthday:" + birthday);


    }

    public void greetings() {
        System.out.println("Hallo, my name is Peter, nice to meet you!");

    }

    //konstruktor

    public Person(double maxSalary, double minSalary) {
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }


    public Person(String street, int number, int index, String country) {
        this.street = street;
        this.number = number;
        this.index = index;
        this.country = country;
    }

    public Person(String name, int age, double height, int amountOfchildren, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfchildren = amountOfchildren;
        this.birthday = birthday;
    }

    abstract double calcAverage();

    public Person() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return number == person.number && index == person.index && Double.compare(maxSalary, person.maxSalary) == 0 && Double.compare(minSalary, person.minSalary) == 0 && age == person.age && Double.compare(height, person.height) == 0 && amountOfchildren == person.amountOfchildren && Objects.equals(street, person.street) && Objects.equals(country, person.country) && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, index, country, maxSalary, minSalary, name, age, height, birthday, amountOfchildren);
    }

    @Override
    public String toString(){
        return "Person{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", index=" + index +
                ", country='" + country + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birthday=" + birthday +
                ", amountOfchildren=" + amountOfchildren +
                '}';
    }
}
