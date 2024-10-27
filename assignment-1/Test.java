// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

// import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a string with front and end spaces :");
        String str = "University of Technology";
        String subStr = "Tech";

        int idx = str.indexOf(subStr);

        if(idx == -1){
            System.out.println("Substring not found");
        }
        else{
            System.out.println("Substring found at index " + idx);
        }
    }
}