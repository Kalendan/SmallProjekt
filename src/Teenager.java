public class Teenager extends Person {

    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    double calcAverage() {
        return 0;
    }

    @Override
    public void personInfo() {
        super.personInfo();
    }
}




