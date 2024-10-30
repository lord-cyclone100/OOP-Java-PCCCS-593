// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class Demo{
    void m(){
        System.out.println("Hello World");
    }
}

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Demo d = new Demo();
        d = null;

        try{
            d.m();
        }
        catch(NullPointerException npe){
            System.out.println("Null pointer Exception encountered");
        }
    }
}