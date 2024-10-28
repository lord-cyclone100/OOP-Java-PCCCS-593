// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = {1,2,3,4,5};
        String str = "Java";
        try{
            System.out.println(num[10]);
        }
        catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Array index exceeded");
        }
        catch(StringIndexOutOfBoundsException sioobe){
            System.out.println("String index exceeded");
        }
    }
}