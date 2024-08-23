package homework39;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public String say(){
        return "I am a human being";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }else if (obj instanceof Person) {
            //这里先进行向下转型
            Person person = (Person) obj;
            return this.name.equals(person.name) && this.age == person.age;
            //无敌了这idea
        }
        return false;
    }
}
