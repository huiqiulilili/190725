class HelloA{
    //静态代码块

    static {
        System.out.println("A父类静态代码块");
    }

    //构造方法
    public HelloA(){
       System  .out.println("HelloA!父类构造方法");
    }

    //非静态代码块
    {
        System.out.println("A的父类非静态代码块");
    }


}

class HelloB extends HelloA{

    //构造方法
    public HelloB(){
        System  .out.println("HelloB!构造方法");
    }

    //非静态代码块
    {
        System.out.println("B的非静态代码块");
    }

    //静态代码块

    static {
        System.out.println("B的静态代码块");
    }
}
public class Practice {
    public static void main(String[] args) {
        System.out.println("----start----");
        new HelloB();
//        new HelloB();
        System.out.println("----end----");
    }
}
