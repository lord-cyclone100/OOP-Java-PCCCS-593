// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line argument).

import java.util.Scanner;

class Box{
    void findVolume(double side){
        System.out.println("Volume of cube : "+(side*side));
    }

    void findVolume(double radius, double height){
        System.out.println("Volume of cone : "+((1.0/3.0)*Math.PI*radius*radius*height));
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side : ");
        double side = scanner.nextDouble();
        System.out.println("Enter radius : ");
        double radius = scanner.nextDouble();
        System.out.println("Enter height : ");
        double height = scanner.nextDouble();
        
        Box box = new Box();
        box.findVolume(side);
        box.findVolume(radius, height);
    }
}