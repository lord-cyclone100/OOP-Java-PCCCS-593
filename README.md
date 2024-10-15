# OOP-Java-PCCCS-593

## Assignment-1

#### Write a program to print your name.

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

#### Write a program to read the price of an item in the decimal form (like 75.95) and print the output in paise (like 7595 paise).

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price in Rupees:");
        double n = scanner.nextDouble();
        System.out.println("Price in paise : " + n*100);
    }
}
```

#### Write a program to convert the given temperature in Fahrenheit to Celsius using the following conversion formula: C = (F-32)/1.8

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Farenheit:");
        double f = scanner.nextDouble();
        double c = (f-32)/1.8;
        System.out.println("Equivalent Celcius Temperature : " + c);
    }
}
```

#### Write a program to determine sum of the following series for given value of n: 1 + 1/2^2 + 1/3^2 + ..... + 1/n^2

```java
import java.util.Scanner;

public class Test{
    static double squareCalculate(int n){
        return n * n;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum += 1/(squareCalculate(i));
        }
        System.out.println("Sum of series : " + sum);
    }
}
```

#### Write a program to find the sum of digits of a given integer number (i) using static i/p and (ii) using command-line argument.


###### Using Static Input
```java
import java.util.Scanner;

public class Test{
    static int calculateSum(int n){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        System.out.println("Sum of the digits : " + calculateSum(n));
    }
}
```
###### Using Command line Arguments

```java
public class Test{
    static int calculateSum(int n){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Sum of the digits : " + calculateSum(Integer.parseInt(args[0])));
    }
}
```

#### Write a Java Program to take two inputs (name and college name) through command line argument and print as follows: <em> name </em> is a B.Tech student of <em>college name</em> college.

```java
public class Test{
    public static void main(String[] args){
        System.out.println(args[0] + " is a student of " + args[1] + " college");
    }
}
```

#### Write a program to find the reverse of a given integer number (i) using static i/p and (ii) using command-line argument

###### Using static input

```java
import java.util.Scanner;
public class Test{
    static int findReverse(int n){
        int reversedNumber = 0;
        while(n != 0){
            int rem = n%10;
            reversedNumber = reversedNumber*10 + rem;
            n = n/10;
        }
        return reversedNumber;
    }

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("Reversed number : " + findReverse(num));
    }
}
```

###### Using Command Line Arguments

```java
public class Test{
    static int findReverse(int n){
        int reversedNumber = 0;
        while(n != 0){
            int rem = n%10;
            reversedNumber = reversedNumber*10 + rem;
            n = n/10;
        }
        return reversedNumber;
    }

    public static void main(String[] args){
        System.out.println("Reversed number : " + findReverse(Integer.parseInt(args[0])));
    }
}
```

#### Write a program to check whether a given integer number is palindrome or not (i) using static i/p and (ii) using command-line argument.

###### Using Static Input

```java
import java.util.Scanner;

public class Test{
    static void checkPalindrome(int n){
        int initialNumber = n;
        int reversedNumber = 0;
        while(n != 0){
            int rem = n%10;
            reversedNumber = reversedNumber*10 + rem;
            n = n/10;
        }
        if(reversedNumber == initialNumber){
            System.out.println(initialNumber + " is a palindrome");
        }
        else{
            System.out.println(initialNumber + " is not a palindrome");
        }
    }

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        checkPalindrome(n);
    }
}
```

###### Using Command Line Arguments

```java
public class Test{
    static void checkPalindrome(int n){
        int initialNumber = n;
        int reversedNumber = 0;
        while(n != 0){
            int rem = n%10;
            reversedNumber = reversedNumber*10 + rem;
            n = n/10;
        }
        if(reversedNumber == initialNumber){
            System.out.println(initialNumber + " is a palindrome");
        }
        else{
            System.out.println(initialNumber + " is not a palindrome");
        }
    }

    public static void main(String[] args){
        checkPalindrome(Integer.parseInt(args[0]));
    }
}
```

#### Write a Java Program to demonstrate arithmetic operations between two numbers using command line arguments.

```java
public class Test{
    public static void main(String[] args){
        System.out.println("a + b = " + (Integer.parseInt(args[0]) +  Integer.parseInt(args[1])));
        System.out.println("a - b = " + (Integer.parseInt(args[0]) -  Integer.parseInt(args[1])));
        System.out.println("a * b = " + (Integer.parseInt(args[0]) *  Integer.parseInt(args[1])));
        try{
            System.out.println("a / b = " + (Integer.parseInt(args[0]) /  Integer.parseInt(args[1])));
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}
```

#### Write a java program to check whether a number is even or odd

```java
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
```

#### Write a Java Program to swap two numbers using the bitwise operator.

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("Before swapping : "+ num1 + " and " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping : "+ num1 + " and " + num2);
    }
}
```

#### Write a java program to check leap year

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if(year%400 == 0){
            System.out.println(year+" is a leap year");
        }
        else if(year%100 == 0){
            System.out.println(year+" is not a leap year");
        }
        else if(year%4 == 0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
```

#### Write a Java Program to multiply a number by 2 and divide the same number by 4 using shift operator.

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = scanner.nextInt();
        System.out.println("Multiplied by 2 : " + (num << 1));
        System.out.println("Divided by 4 : " + (num >> 2));
    }
}
```

#### Write a program to find the facrorial of an integer number using recursion

```java
import java.util.Scanner;

public class Test{
    static int findFactorial(int num){
        int fact = 1;
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num*findFactorial(num-1);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Factorial of "+num+" : "+findFactorial(num));
    }
}
```

#### Write a program to find the factorial of a given integer number using dynamic programming.

```java
import java.util.Scanner;

public class Test{
    static int findFactorial(int num){
        int arr[] = new int[num+1];
        for(int i=0;i<=num;i++){
            arr[i] = 1;
        }
        for(int i=1;i<=num;i++){
            arr[i] = i * arr[i-1];
        }
        return arr[num];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Factorial of "+num+" : "+findFactorial(num));
    }
}
```

#### Write a Program of Sum of Series (1+x+x^2+x^3+x^4+............ up to n-th terms).

```java
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
```

## Assignment-2

#### Add two numbers by taking input using Command Line Input, Scanner class and BufferedReader class.

###### Using Command Line Arguments

```java
public class Test{
    public static void main(String[] args){
        System.out.println("Sum : "+ (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
}
```

###### Using Scanner class

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println("Sum : "+ (n1 + n2));
    }
}
```

###### Using BufferedReader class

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number : ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println("Enter 2nd number : ");
        int n2 = Integer.parseInt(br.readLine());
        
        System.out.println("Sum : "+ (n1+n2));
    }
}
```

#### Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input.

###### Keyboard Input

```java
import java.util.Scanner;

class Cylinder{
    double radius;
    double height;
    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        System.out.println("Volume of cylinder : " + (Math.PI * radius * radius * height));
        System.out.println("Surface Area of cylinder : " + (2 * Math.PI * radius * (radius + height)));
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of cylinder : ");
        double r = scanner.nextDouble();
        System.out.println("Enter height of cylinder : ");
        double h = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(r,h);

    }
}
```

###### Using Command Line Arguments

```java
class Cylinder{
    double radius;
    double height;
    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        System.out.println("Volume of cylinder : " + (Math.PI * radius * radius * height));
        System.out.println("Surface Area of cylinder : " + (2 * Math.PI * radius * (radius + height)));
    }
}

public class Test{
    public static void main(String[] args){
        double r = Integer.parseInt(args[0]);
        double h = Integer.parseInt(args[1]);
        Cylinder cylinder = new Cylinder(r,h);

    }
}
```

#### Write a program to find Area and Volume of Cone Using Constructors - Keyboard Input or Command Line Input.

###### Using Keyboard Inputs

```java
import java.util.Scanner;

class Cone{
    double radius;
    double height;
    Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
        System.out.println("Volume of cone : " + ((1.0/3.0) * Math.PI * radius * radius * height));
        double l = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        System.out.println("Surface Area of cone : " + (Math.PI * radius * (radius + l)));
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of cone : ");
        double r = scanner.nextDouble();
        System.out.println("Enter height of cone : ");
        double h = scanner.nextDouble();
        Cone cone = new Cone(r,h);
    }
}
```

###### Using Command Line Arguments

```java
class Cone{
    double radius;
    double height;
    Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
        System.out.println("Volume of cone : " + ((1.0/3.0) * Math.PI * radius * radius * height));
        double l = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        System.out.println("Surface Area of cone : " + (Math.PI * radius * (radius + l)));
    }
}

public class Test{
    public static void main(String[] args){
        double r = Integer.parseInt(args[0]);
        double h = Integer.parseInt(args[1]);
        Cone cone = new Cone(r,h);
    }
}
```

#### Create a class First, make instance variable [int x], method [void show ()] and also put main method inside that class and use the instance variable and method from main.

```java
public class First{
    int x = 10;
    void show(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        First first = new First();
        System.out.println(first.x);
        first.show();
    }
}
```

#### Create a class; make its instance variable and method. Use them from main, declared in different class.

```java
class Demo{
    int x = 10;
    void show(){
        System.out.println("Hello World");
    }
}

class Task{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.x);
        d1.show();
    }
}

public class Test{
    public static void main(String[] args){
        Demo d2 = new Demo();
        System.out.println(d2.x);
        d2.show();
    }
}
```

#### Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object, (b) pass different class’s object

```java
class Assignment{
    void meet(){
        System.out.println("Hey There");
    }
}

class Demo{
    void show(){
        System.out.println("Hello World");
    }

    void greet(Demo d){
        d.show();
    }

    Assignment a = new Assignment();

    void brother(Assignment a){
        a.meet();
    }
}

public class Test{
    public static void main(String[] args){
        Demo demo = new Demo();
        demo.greet(demo);
        Assignment asmnt = new Assignment();
        demo.brother(asmnt);
    }
}
```