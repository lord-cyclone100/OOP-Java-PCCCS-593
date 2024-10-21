// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

interface Interf1{
    void method1();
    void method2();
}

interface Interf2{
    void method3();
    void method4();
}

interface Interf3 extends Interf1, Interf2{
    void method5();
}

class Demo{
    public void method6(){
        System.out.println("Method6");
    }
}

class Task extends Demo implements Interf3{
    public void method1(){
        System.out.println("Method1");
    }
    public void method2(){
        System.out.println("Method2");
    }
    public void method3(){
        System.out.println("Method3");
    }
    public void method4(){
        System.out.println("Method4");
    }
    public void method5(){
        System.out.println("Method5");
    }
}

public class Test{
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
       Task task = new Task();
       task.method1();
       task.method2();
       task.method3();
       task.method4();
       task.method5();
       task.method6();
    }
}