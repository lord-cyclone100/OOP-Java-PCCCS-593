// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

public class Test{

    static double calcDiscriminant(double a, double b, double c){
        return ((b*b) - (4*a*c));
    }

    static void calcRoots(double a, double b, double c){
        double d = calcDiscriminant(a,b,c);
        if(d==0){
            System.out.println("The roots are real and equal. Each of the roots is : "+((b*(-1))/(2*a)));
        }
        else if (d > 0){
            double root1 = ((b*(-1))+(Math.sqrt(d)))/(2*a);
            double root2 = ((b*(-1))-(Math.sqrt(d)))/(2*a);
            System.out.println("The roots are real and distinct. The roots are : "+root1+" and "+root2);
        }
        else{
            double real = ((b*(-1))/(2*a));
            double image = ((Math.sqrt(d*(-1)))/(2*a));
            System.out.println("The roots are real and imaginary. The roots are : "+real+" + "+image+"i and "+real+" - "+image+"i");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient of x^2 : ");
        double a = scanner.nextDouble();
        
        System.out.println("Enter the coefficient of x : ");
        double b = scanner.nextDouble();
        
        System.out.println("Enter the constant term : ");
        double c = scanner.nextDouble();

        System.out.println("Roots of the equation are : ");
        calcRoots(a,b,c);
    }
}