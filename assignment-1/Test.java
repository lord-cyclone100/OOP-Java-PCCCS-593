// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;
import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();
       
        System.out.println("Enter a starting index:");
        int idx = scanner.nextInt();

        System.out.println("Enter number of extracted characters:");
        int ext = scanner.nextInt();

        try{
            System.out.println(str.substring(idx,(ext+idx)));
        }
        catch(StringIndexOutOfBoundsException sioobe){
            System.out.println("Wrong");
        }
    }
}