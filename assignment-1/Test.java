// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

// import java.util.Scanner;

// class MyRunnable implements Runnable{
//     // MyThread(String name) {
//     //     super(name);
//     // }

//     public void run(){
//         System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
//     }
// }

// public class Test{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);

//         MyRunnable r = new MyRunnable();

//         Thread t1 = new Thread(r);
//         Thread t2 = new Thread(r);
//         Thread t3 = new Thread(r);
//         Thread t4 = new Thread(r);
//         Thread t5 = new Thread(r);

//         t1.setPriority(1);
//         t2.setPriority(5);
//         t3.setPriority(10);
//         t4.setPriority(7);
//         t5.setPriority(3);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
//     }
// }









import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File myFile1 = new File("file1.txt");
        File myFile2 = new File("file2.txt");
        Scanner scanner = null;
        String data = "";
        try {
            scanner = new Scanner(myFile1);
            while (scanner.hasNextLine()) {
                data = data+scanner.nextLine();
            }

            scanner = new Scanner(myFile2);
            while (scanner.hasNextLine()) {
                data = data+"\n"+scanner.nextLine();
            }
        }
        catch (FileNotFoundException fnfe) {}
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        FileWriter myFile3 = null;
        try{
            myFile3 = new FileWriter("file3.txt");
            myFile3.write(data);
        }
        catch(IOException ioe){}
        finally{
            if (myFile3 != null) {
                try {
                    myFile3.close();
                } catch (IOException ioe) {
                    System.out.println("Error closing FileWriter: " + ioe.getMessage());
                }
            }
        }
    }
}