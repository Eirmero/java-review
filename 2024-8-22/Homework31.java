class Person{
    String name;
    int age;

    public void copyPerson(Person person){
        this.name = person.name;
        this.age = person.age;
    }

    public void printPerson(){
        System.out.print(this.name + " ");
        System.out.println(this.age);
    }

}

public class Homework31 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 41;
        p1.name = "KOBE";
        p1.printPerson();

        Person p2 = new Person();
        p2.copyPerson(p1);
        p2.printPerson();

        p2.age = 40;
        p2.printPerson();
        p1.printPerson();
    }
}


