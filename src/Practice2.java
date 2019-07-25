class Outer{
    private String msg = "Hello World";

    public String getMsg() {
        return msg;
    }

    class Inner{//定义一个内部类
        public void print(){//定义一个普通方法
            System.out.println(msg);
        }
    }

    public void fun(){//在外部类中，定义一个方法
        Inner in = new Inner();
        in.print();
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
    }
}
