interface MyInterface{
    void test();
}

class Outter9{
    private int num;

    public void display(int para){
        //匿名内部类
        new MyInterface(){
            public void test(){
                System.out.println("匿名内部类"+para);
            }
        }.test();
    }
}
public class Practice9 {
    public static void main(String[] args) {
        Outter8 outter = new Outter8();
        outter.display(20);
    }
}
