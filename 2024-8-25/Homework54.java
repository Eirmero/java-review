enum Test{
    test1(1), test2, test3(666);
    int id;

    Test(int id){
        this.id = id;
        System.out.println("调用了有参构造喔 id= " + id);
    }

    Test(){
        System.out.println("调用了无参构造喔~");
    }
}

public class Homework54 {
    public static void main(String[] args) {
        Test t1 = Test.test1;


    }

}

