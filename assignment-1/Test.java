// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class SharedLock{
    public synchronized void displayMessage(String name){
        System.out.print("Hello ");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){}
        System.out.println(name);
    }
}

class MyThread extends Thread{
    SharedLock sl;
    String name;
    MyThread(SharedLock sl, String name){
        this.sl = sl;
        this.name = name;
    }

    public void run(){
        sl.displayMessage(name);
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        SharedLock s = new SharedLock();

        MyThread t1 = new MyThread(s, "Thread 1");
        MyThread t2 = new MyThread(s, "Thread 2");
        MyThread t3 = new MyThread(s, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
        
    }
}









// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Test {
//     public static void main(String[] args) {
//         File myFile1 = new File("file1.txt");
//         File myFile2 = new File("file2.txt");
//         Scanner scanner = null;
//         String data = "";
//         try {
//             scanner = new Scanner(myFile1);
//             while (scanner.hasNextLine()) {
//                 data = data+scanner.nextLine();
//             }

//             scanner = new Scanner(myFile2);
//             while (scanner.hasNextLine()) {
//                 data = data+"\n"+scanner.nextLine();
//             }
//         }
//         catch (FileNotFoundException fnfe) {}
//         finally {
//             if (scanner != null) {
//                 scanner.close();
//             }
//         }
//         FileWriter myFile3 = null;
//         try{
//             myFile3 = new FileWriter("file3.txt");
//             myFile3.write(data);
//         }
//         catch(IOException ioe){}
//         finally{
//             if (myFile3 != null) {
//                 try {
//                     myFile3.close();
//                 } catch (IOException ioe) {
//                     System.out.println("Error closing FileWriter: " + ioe.getMessage());
//                 }
//             }
//         }
//     }
// }