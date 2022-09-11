package exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent("Vinay", 12, "Fever");
        Parent p2 = new Parent("Priyansh", 22, "Corona");
        Parent p3 = new Parent("Shivam", 24, "Corona");
        List<Parent> list = Arrays.asList(p1, p2, p3);
        list.stream().filter(p -> p.getDisease().equals("Corona") && p.getAge() > 22).forEach(System.out::println);
    }

}
