class A{
    private String name = "A类的私有区域";
    public String getName(){
        return name;
    }
}

class B{
    private int age = 20;
    public int getAge(){
        return age;
    }
}

class Outter{
    private class InnerClassA extends A{
        public String name(){
            return super.getName();
        }
    }
    private class InnerClassB extends B{
        public int age(){
            return super.getAge();
        }
    }
    public String name(){
        return new InnerClassA().name();
    }
    public int age(){
        return new InnerClassB().age();
    }
}
public class Practice4 {
    public static void main(String[] args) {
        Outter outter = new Outter();
        System.out.println(outter.name());
        System.out.println(outter.age());
    }
}
