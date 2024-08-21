import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alpha = input.next().charAt(0);
        switch (alpha) {
            case 'a':
                System.out.println("今天周一，打剿灭");
                break;
                case 'b':
                    System.out.println("今天周二，玩黑神话悟空");
                    break;
                    case 'c':
                        System.out.println("今天周三，玩命运2");
                        break;
                        default:
                            System.out.println("你输入的日子不太对，你得去打工");

        }
        System.out.println("完成你的选择，那么出发吧");
    }
}
