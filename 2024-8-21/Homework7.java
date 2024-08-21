import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        for(;;) {
            System.out.println("请输入马保国同志的中国信用分");
            Scanner scanner = new Scanner(System.in);
            int score = scanner.nextInt();
            if (score > 100 & score < 0) {
                System.out.println("违规输入分数是违法行为");
            } else if (score >= 80 & score < 100) {
                System.out.println("你真是一个好人");
            } else if (score == 100) {
                System.out.println("主席你来当");
            } else if (score < 80 && score >= 60) {
                System.out.println("你是一位好公民");
            } else if (score > 0 && score < 60) {
                System.out.println("请遵守法律法规，停止违法违纪行为");
            } else if (score == 0) {
                System.out.println("执行死刑");
                break;
            }
        }
    }
}
