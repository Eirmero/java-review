//public class Homework15 {
//    public static void main(String[] args) {
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i; j++){
//                System.out.println(i + "\t*\t" + j + "\t=\t" + i*j);
//            }
//            System.out.println("\n");
//        }
//    }
//}

public class Homework15 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i; j++){
                System.out.print(j + " * " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}

//public class Homework15 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {  // 控制行数
//            for (int j = 1; j <= i; j++) {  // 控制每行的输出
//                System.out.print(j + " * " + i + " = " + (i * j) + "\t");  // 使用 \t 为每个等式之间添加制表符
//            }
//            System.out.println();  // 每行结束后换行
//        }
//    }
//}
