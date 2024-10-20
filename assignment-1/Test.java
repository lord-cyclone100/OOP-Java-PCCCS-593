// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

// import java.util.Scanner;

abstract class Demo{
    abstract void display();
    abstract void show();
    abstract void print();
}

abstract class Task extends Demo{
    public void display(){
        System.out.println("This is a display method");
    }

    public void print(){
        System.out.println("This is a print method");
    }
}

class Tutorial extends Task{
    public void show(){
        System.out.println("This is a show method");
    }
}

public class Test{
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        Tutorial t = new Tutorial();
        t.display();
        t.print();
        t.show();
    }
}