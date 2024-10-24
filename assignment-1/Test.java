// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

// import java.util.Scanner;

class Demo{
    Demo(){
        System.out.println("Inside Demo constructor");
    }
    static{
        System.out.println("Inside static block 1");
    }
    static{
        System.out.println("Inside static block 2");
    }
}

class Tutorial extends Demo{
    Tutorial(){
        System.out.println("Inside Tutorial constructor");
    }
    static{
        System.out.println("Inside static block 3");
    }
}

public class Test{
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Tutorial t = new Tutorial();
    }
}