import java.util.ArrayList;
import java.util.List;

public class Homework73 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("string串 : " + i);
        }
        System.out.println(list);
        list.add(2, "hsp");
        System.out.println(list);
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6, "modified");
        System.out.println(list);

    }
}
