package pTwo;
import pOne.Cut;

public class Copy{
    public void method3(){
        Cut cut = new Cut();
        System.out.println(cut.x + " <----> " + cut.y);
        cut.method1();
        cut.method2();
    }
}