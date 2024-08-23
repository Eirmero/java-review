package homework39;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("张献忠", 35, 666, 100000);
        System.out.println(student.say());
        System.out.println(student.toSay());
    }
}
