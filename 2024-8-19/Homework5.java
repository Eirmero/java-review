import java.util.Scanner;
import java.util.SortedMap;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Man!: ");
        String man = input.next();
        int age = input.nextInt();
        String word = input.nextLine();
        System.out.println(man + " " + age + " " + word);
        System.out.println(word);

    }
}
