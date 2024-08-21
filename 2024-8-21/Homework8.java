public class Homework8 {
    public static void main(String[] args) {
        boolean b = true;
        if (b == false) // ①
            System.out.println("a");
        else if (b) // ②
            System.out.println("b");
        else if (!b) // ③
            System.out.println("c");
        else
            System.out.println("d");

    }
}
