import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        for(;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            if (age < 18) {
                System.out.println("你还未成年");
            } else {
                System.out.println("你已经成年了！可以去网吧消费了");
                break;
            }
        }
    }
}
