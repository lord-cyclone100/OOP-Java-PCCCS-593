// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class MyRunnable implements Runnable{
    // MyThread(String name) {
    //     super(name);
    // }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);
        Thread t5 = new Thread(r);

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        t4.setPriority(7);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}