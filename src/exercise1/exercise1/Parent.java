package exercise1;

public class Parent {

    private String disease;
    private int age;
    private String name;

    // default constructor
    Parent() {

    }

    public Parent(String name, int age, String disease) {
        super();
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    // getter methods

    public String getDisease() {
        return disease;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // setter methods

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name" + name + " " + " age " + age + " " + "disease" + disease;
    }

}
