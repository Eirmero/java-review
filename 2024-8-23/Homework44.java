import homework39.Person;

public class Homework44 {
    public static void main(String[] args) {
        Person person1 = new Person("李达康",18);
        Person person2 = new Person("李达康",18);

        boolean i = person1.equals(person2);
        System.out.println(i);
    }
}
