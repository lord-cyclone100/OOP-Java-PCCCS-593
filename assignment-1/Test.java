// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).
import java.util.Scanner;

public class Test{
    static int findSeriesSum(int x,int i){
        return (int)Math.pow(x,i);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += findSeriesSum(x,i);
        }
        System.out.println("Sum of the series is: "+sum);
    }
}