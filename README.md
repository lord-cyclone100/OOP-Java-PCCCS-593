# OOP-Java-PCCCS-593


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