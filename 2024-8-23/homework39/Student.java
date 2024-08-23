package homework39;

public class Student extends Person {
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String say() {
        return "我是学生，请给我钱";
    }

    public String toSay() {
        return super.say();
    }
}
