class Outter8{
    private int num;//  0

    public void display(int test){
        class Inner8{
            private void fun(){
                num++;
                System.out.println(num);
                System.out.println(test);
            }
        }
        new Inner8().fun();
    }
}
public class Practice8 {
    public static void main(String[] args) {
        Outter8 out = new Outter8();
        out.display(20);
    }
}
