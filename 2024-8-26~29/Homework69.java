//将字符串中指定部分进行反转 比如abcdef换成aedcbf

import java.util.Scanner;

public class Homework69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("=======交换前的字符串=====");
        System.out.println(str);
        try {
            str = reverse(str, 0, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=======交换后的字符串=====");
    }

    public static String reverse(String str, int start, int end){
        //完成主要方法后开始写限制条件
        if(!(str != null && start >= 0 && end < str.length() &&  end > start)){
            throw new RuntimeException("参数有误");
        }

        char chars[] = str.toCharArray();
        for(int i = start, j = end; i < j; i++, j--){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars重构一个String返回即可
        return new String(chars);

    }
}


