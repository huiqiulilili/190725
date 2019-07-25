class Outer7{
    private static String msg = "Hello World";

    //定义一个内部类
    static class Inner7{
        public void print(){
            System.out.println(msg);
        }
    }

    //在外部类中定义一个方法，该方法负责产生内部类对象并调用print方法
    public void fun(){
        Inner7 in = new Inner7();
        in.print();
    }
}
public class Practice7 {
    public static void main(String[] args) {
       Outer7.Inner7 in = new Outer7.Inner7();
       in.print();
    }
}
