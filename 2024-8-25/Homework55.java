enum Week{
    Monday("星期一"),Tuesday("星期二"),Wednesday("星期三"),Thirsday("星期四"),
    Friday("星期五"),Saturday("星期六"),Sunday("星期日");

    private String name;

    Week(String string) {
        this.name = string;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Homework55 {
    public static void main(String[] args) {
        Week weeks[] = Week.values();
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
