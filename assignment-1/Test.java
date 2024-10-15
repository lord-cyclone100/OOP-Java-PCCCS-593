// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).
// import java.util.Scanner;

class Assignment{
    void meet(){
        System.out.println("Hey There");
    }
}

class Demo{
    void show(){
        System.out.println("Hello World");
    }

    void greet(Demo d){
        d.show();
    }

    Assignment a = new Assignment();

    void brother(Assignment a){
        a.meet();
    }
}

public class Test{
    public static void main(String[] args){
        Demo demo = new Demo();
        demo.greet(demo);
        Assignment asmnt = new Assignment();
        demo.brother(asmnt);
    }
}