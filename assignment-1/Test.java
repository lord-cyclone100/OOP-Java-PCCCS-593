// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

// import java.util.Scanner;

// class SharedLock{
//     public synchronized void displayMessage(String name){
//         System.out.print("Hello ");
//         try{
//             Thread.sleep(1000);
//         }
//         catch(InterruptedException ie){}
//         System.out.println(name);
//     }
// }

// class MyThread extends Thread{
//     SharedLock sl;
//     String name;
//     MyThread(SharedLock sl, String name){
//         this.sl = sl;
//         this.name = name;
//     }

//     public void run(){
//         sl.displayMessage(name);
//     }
// }

// public class Test{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);

//         SharedLock s = new SharedLock();

//         MyThread t1 = new MyThread(s, "Thread 1");
//         MyThread t2 = new MyThread(s, "Thread 2");
//         MyThread t3 = new MyThread(s, "Thread 3");

//         t1.start();
//         t2.start();
//         t3.start();
        
//     }
// }









import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String text;
        try{
            FileWriter fw = new FileWriter("file4.txt");
            do{
                System.out.println("Enter a string (or 'q' to quit):");
                text = scanner.nextLine();
                if(!text.equals("q")){
                    str += text + " ";
                    fw.write(text+"\n");
                }
            }
            while(!text.equals("q"));
            fw.close();
        }
        catch(IOException ioe){};
    }
}