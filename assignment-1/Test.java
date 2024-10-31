// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}

class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}

class Demo{
    void f() throws MyException{
        try{
            g();
        }
        catch(CustomException ce){
            System.out.println(ce.getMessage());
            throw new MyException("my exception caught");
        }
    }
    void g() throws CustomException{
        throw new CustomException("custom exception caught");
    }
}

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Demo d = new Demo();
        try{
            d.f();
        }
        catch (MyException me){
            System.out.println(me.getMessage());
        }
    }
}




// import java.util.Scanner;

// // Define the first custom exception
// class CustomException extends Exception {
//     CustomException(String str) {
//         super(str);
//     }
// }

// // Define the second custom exception
// class MyException extends Exception {
//     MyException(String str) {
//         super(str);
//     }
// }

// class Demo {
//     void f() throws MyException {
//         try {
//             g();
//         } catch (CustomException ce) {
//             System.out.println("Caught in f(): " + ce.getMessage());
//             throw new MyException("MyException thrown from f()");
//         }
//     }

//     void g() throws CustomException {
//         throw new CustomException("CustomException thrown from g()");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         try {
//             d.f();
//         } catch (MyException me) {
//             System.out.println("Caught in main(): " + me.getMessage());
//         }
//     }
// }