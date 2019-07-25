class Outter6{
    public void display(){
        Inner6 inner = new Inner6();
        inner.display();
    }

    class Inner6{
        public void display(){
            System.out.println("I am InnerClass");
        }
    }
}
public class Practice6 {
    public static void main(String[] args) {
        Outter6 out = new Outter6();
        out.display();

    }
}
