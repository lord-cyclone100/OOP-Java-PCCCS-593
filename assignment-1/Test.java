// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who is the Inventor of Java?");
        int chances = 0;
        int i = 0; 

        for(i=0;i<3;i++){
            System.out.println("Your answer : ");
            String ans = scanner.nextLine();
            if(ans.toLowerCase().equals("james gosling")){
                System.out.println("You are correct. Good.");
                break;
            }
            else{
                System.out.println("Incorrect answer.");
                chances++;
            }
        }
        if(i == 3){
            System.out.println("The correct answer is James Gosling");
        }
    }
}