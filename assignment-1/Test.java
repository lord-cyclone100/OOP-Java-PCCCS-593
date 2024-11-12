// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class MyRunnable implements Runnable{
    MyRunnable(){
        System.out.println("This is my runnable");
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.currentThread().sleep(2000);
            }
            catch(InterruptedException ie){}
        }
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        // System.out.println(currentThread().getName());
        // for(int i=0;i<3;i++){
        //     System.out.println(Thread.currentThread().getName());
        //     // try{
        //     //     Thread.currentThread().sleep(2000);
        //     // }
        //     // catch(InterruptedException ie){}
        // }
    }
}