class Outter5{
    private String outName;
    private int outAge;

     class Inner5{
//         private int InnerAge;
         public Inner5(){
             Outter5.this.outName = "I am Outter5 class";
             Outter5.this.outAge = 20;
         }
         public void display(){
             System.out.println(outName);
             System.out.println(outAge);
         }
     }
}
public class Practice5 {
    public static void main(String[] args) {
        Outter5.Inner5 inner = new Outter5().new Inner5();
        inner.display();
    }
}
