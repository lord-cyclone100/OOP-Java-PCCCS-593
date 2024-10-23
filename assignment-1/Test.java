// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

// import java.util.Scanner;

class Outer{
    public void display(){
        System.out.println("Hello");
    }
    int x = 10;

    class Inner{
        public void greet(){
            System.out.println("Welcome");
        }
        int y = 50;
        public void displayOuterDetails(){
            System.out.println(x);
            display();
        }
    }

    public void displayInnerDetails(){
        Inner inner = new Inner();
        inner.greet();
        System.out.println(inner.y);
    }
}

public class Test{
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
       Outer o = new Outer();
       Outer.Inner in = o.new Inner();
       in.displayOuterDetails();
    // new Outer().new Inner().displayOuterDetails();
    o.displayInnerDetails();
    }
}