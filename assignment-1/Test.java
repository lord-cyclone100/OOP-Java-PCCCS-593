// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}