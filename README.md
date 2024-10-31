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

#### Write a program to find Area and Volume of Cylinder Using Constructors - Keyboard Input or Command Line Input.

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

#### Create a class; put a method inside this class which will return a class reference return same class and/or different class object.

```java
class Tutorial{
    void namaskar(){
        System.out.println("Nice to meet you");
    }
}

class Demo{
    void greet(){
        System.out.println("Hello World!");
    }
    Demo method(){
        return this;
    }
    Tutorial tutor(){
        return new Tutorial();
    }
}

public class Test{
    public static void main(String[] args){
        Demo demo = new Demo();
        Demo d = demo.method();
        d.greet();
        Tutorial tutorial = demo.tutor();
        tutorial.namaskar();
    }
}
```

#### Write a JAVA Program to make a Student class with proper attributes like roll no, name, stream, and college.

```java
import java.util.Scanner;

class Student{
    String name;
    long roll;
    String stream;
    String collegeName;

    Student(String name, long roll, String stream, String collegeName){
        this.name = name;
        this.roll = roll;
        this.stream = stream;
        this.collegeName = collegeName;
    }

    void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Stream: "+stream);
        System.out.println("College Name: "+collegeName);
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student roll:");
        long roll = scanner.nextLong();
        System.out.println("Enter student stream:");
        String stream = scanner.next();
        System.out.println("Enter college name:");
        String collegeName = scanner.next();

        Student student = new Student(name, roll, stream, collegeName);
        student.showDetails();
    }
}
```

#### Design a class to represent a Bank Account. Include the following things:
##### Fields
+ Name of the depositor
+ Account number
+ Type of account
+ Balance amount in the account 
##### Methods
+ To assign initial values
+ To deposit an amount
+ To withdraw an amount after checking balance
+ To display the name and balance

```java
import java.util.Scanner;

class Bank{
    String depositorName;
    long accountNumber;
    String accountType;
    long balanceAmount;

    Bank(String depositorName, long accountNumber, String accountType, long balanceAmount){
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
        System.out.println("Account created");
    }

    void depositAmount(long amount){
        System.out.println("Current balance: "+balanceAmount);
        if(amount <= 0){
            System.out.println("Please enter a valid amount");
        }
        else{
            balanceAmount += amount;
            System.out.println(amount + " deposited successfully");
            System.out.println("New balance: "+ balanceAmount);
        }
    }

    void withdrawAmount(long amount){
        System.out.println("Current balance: "+balanceAmount);
        if(amount <= 0){
            System.out.println("Please enter a valid amount");
        }
        else if(amount > balanceAmount){
            System.out.println("Insufficient balance");
        }
        else{
            balanceAmount -= amount;
            System.out.println(amount + " withdrawn successfully");
            System.out.println("New balance: "+ balanceAmount);
        }
    }

    void checkBalance(){
        System.out.println("Name: "+depositorName);
        System.out.println("Current Balance: "+balanceAmount);
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter account number:");
        long accNumber = scanner.nextLong();
        System.out.println("Enter account type:");
        String accType = scanner.next();
        System.out.println("Enter initial Deposit amount:");
        long depositAmt = scanner.nextLong();

        Bank bank = new Bank(name, accNumber, accType, depositAmt);
        int choice;
        do{
            System.out.println("What would you like to do");
            System.out.println("1.) Deposit");
            System.out.println("2.) Withdraw");
            System.out.println("3.) Check Balance");
            System.out.println("0.) Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    long depoAmt = scanner.nextLong();
                    bank.depositAmount(depoAmt);
                    break;
                
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    long withAmt = scanner.nextLong();
                    bank.withdrawAmount(withAmt);
                    break;

                case 3:
                    bank.checkBalance();
                    break;

                case 0:
                    System.out.println("Thanks for using our service");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while(choice != 0);
    }
}
```
## Assignment-3

#### Create a class and test if method overloading holds good for return type of method or not.

```java
class Demo{
    int addValues(int a, int b){
        return a+b;
    }

    double addValues(double a, double b){
        return a+b;
    }

    // void addValues(int a, int b){
    //     System.out.println (a+b);
    // }
}

public class Test{
    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println(demo.addValues(2,3));
        // demo.addValues(2, 3);
    }
}
```

#### Overload the constructors for class Box for cube and cone and also display its volume.

```java
import java.util.Scanner;

class Box{
    double side;
    double height;
    double radius;

    Box(double side){
        this.side = side;
        System.out.println("Volume of cube : "+(side*side));
    }

    Box(double radius, double height){
        this.radius = radius;
        this.height = height;
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
        
        Box cube = new Box(side);

        Box cone = new Box(radius, height);
    }
}
```

#### Do the previous problem using method overloading

```java
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
```

#### Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () { } in every class where you describe about the class and from main create object of each class and print each object.

```java
class EMP {
    String name;
    int id;

    EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "EMP [Name: " + name + ", ID: " + id + "]";
    }
}

class Scientist extends EMP {
    int no_of_publication;
    int experience;

    Scientist(String name, int id, int no_of_publication, int experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    public String toString() {
        return "Scientist [Name: " + name + ", ID: " + id + ", Publications: " + no_of_publication + ", Experience: " + experience + " years]";
    }
}

class Dscientist extends Scientist {
    String award;

    Dscientist(String name, int id, int no_of_publication, int experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    public String toString() {
        return "Dscientist [Name: " + name + ", ID: " + id + ", Publications: " + no_of_publication + ", Experience: " + experience + " years, Award: " + award + "]";
    }
}

public class Test {
    public static void main(String[] args) {
        EMP emp = new EMP("Alice", 101);
        Scientist scientist = new Scientist("Bob", 102, 50, 10);
        Dscientist dscientist = new Dscientist("Charlie", 103, 100, 20, "Nobel Prize");

        System.out.println(emp);
        System.out.println(scientist);
        System.out.println(dscientist);
    }
}
```

#### Now do the same program using Dynamic Method Dispatch

```java
class EMP {
    String name;
    int id;

    EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EMP [Name: " + name + ", ID: " + id + "]";
    }
}

class Scientist extends EMP {
    int no_of_publication;
    int experience;

    Scientist(String name, int id, int no_of_publication, int experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Scientist [Name: " + name + ", ID: " + id + ", Publications: " + no_of_publication + ", Experience: " + experience + " years]";
    }
}

class Dscientist extends Scientist {
    String award;

    Dscientist(String name, int id, int no_of_publication, int experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    @Override
    public String toString() {
        return "Dscientist [Name: " + name + ", ID: " + id + ", Publications: " + no_of_publication + ", Experience: " + experience + " years, Award: " + award + "]";
    }
}

public class Test {
    public static void main(String[] args) {
        EMP emp = new EMP("Alice", 101);
        EMP scientist = new Scientist("Bob", 102, 50, 10);
        EMP dscientist = new Dscientist("Charlie", 103, 100, 20, "Nobel Prize");

        System.out.println(emp);
        System.out.println(scientist);
        System.out.println(dscientist);
    }
}
```

#### Create a class with a method void show () and make 3 subclasses of it and all subclasses have void show () method overridden and call those methods using their class references.

```java
class Base {
    void show() {
        System.out.println("This is the Base class.");
    }
}

class SubClass1 extends Base {
    void show() {
        System.out.println("This is SubClass1.");
    }
}

class SubClass2 extends Base {
    void show() {
        System.out.println("This is SubClass2.");
    }
}

class SubClass3 extends Base {
    void show() {
        System.out.println("This is SubClass3.");
    }
}

public class Test {
    public static void main(String[] args) {
        Base base1 = new SubClass1();
        Base base2 = new SubClass2();
        Base base3 = new SubClass3();

        base1.show(); // Calls SubClass1's show method
        base2.show(); // Calls SubClass2's show method
        base3.show(); // Calls SubClass3's show method
    }
}
```

## Assignment-4

#### Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s from another class having main method.

```java
abstract class Demo{
    void display(){
        System.out.println("Hello World");
    }
}

class Task extends Demo{}

public class Test{
    public static void main(String[] args){
        Demo d = new Task();
        d.display();
    }
}
```

#### Create an abstract class with three abstract methods check whether you can we override only few methods (not all methods) in sub-class or not.

```java
abstract class Demo{
    abstract void display();
    abstract void show();
    abstract void print();
}

abstract class Task extends Demo{
    public void display(){
        System.out.println("This is a display method");
    }

    public void print(){
        System.out.println("This is a print method");
    }
}

class Tutorial extends Task{
    public void show(){
        System.out.println("This is a show method");
    }
}

public class Test{
    public static void main(String[] args){
        Tutorial t = new Tutorial();
        t.display();
        t.print();
        t.show();
    }
}
```

#### Assume that a bank maintains two kinds of account for its customers, one called savings account and other called current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance (say Rs. 1000) and if the balance falls below this level a service charge is imposed (say Rs. 100).

#### Create a class Account that stores customer name, account number and type of account. From this class derive two classes Curr_Acct and Savn_Acct respectively to make them more specific to their requirements. Include the necessary methods to achieve the following tasks and use constructors to initialize the class members.
+ Accept deposit from a customer and update the balance.
+ Display the balance.
+ Compute and deposit interest.
+ Permit withdrawal and update the balance.
+ Check for minimum balance, impose penalty, if necessary, and update the balance.

```java
abstract class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    Account(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void displayBalance();
    abstract void computeAndDepositInterest();
    abstract void withdraw(double amount);
    abstract void checkMinimumBalance();
}

class Curr_Acct extends Account {
    static final double MIN_BALANCE = 1000;
    static final double PENALTY = 100;

    Curr_Acct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    @Override
    void computeAndDepositInterest() {
        // No interest for current accounts
    }

    void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkMinimumBalance();
            displayBalance();
        }
    }

    void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Balance below minimum. Penalty imposed: " + PENALTY);
        }
    }
}

class Savn_Acct extends Account {
    static final double INTEREST_RATE = 0.04; // 4% annual interest rate

    Savn_Acct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void computeAndDepositInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest deposited: " + interest);
        displayBalance();
    }

    void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        }
    }

    void checkMinimumBalance() {
        // No minimum balance requirement for savings accounts
    }
}

public class Test {
    public static void main(String[] args) {
        Curr_Acct currentAccount = new Curr_Acct("John Doe", "C12345", 1500);
        Savn_Acct savingsAccount = new Savn_Acct("Jane Doe", "S12345", 2000);

        System.out.println("Current Account:");
        currentAccount.deposit(500);
        currentAccount.withdraw(2000);
        currentAccount.withdraw(100);

        System.out.println("\nSavings Account:");
        savingsAccount.deposit(500);
        savingsAccount.computeAndDepositInterest();
        savingsAccount.withdraw(1000);
    }
}
```

## Assignment-5

#### Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of the two classes and calculate their area.

```java
import java.util.Scanner;

interface Shape{
    double pie = 3.14;
    void findArea();
}

class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void findArea(){
        System.out.println("Area of circle is: "+pie*radius*radius);
    }
}

class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void findArea(){
        System.out.println("Area of Rectangle is: "+length*breadth);
    }
}

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length, breadth);

        circle.findArea();
        rectangle.findArea();
    }
}
```

#### Create a class which contains an inner class. Show that inner class can use member of outer class directly, but Outer class can use member of Inner class only through its object. Check the name of class file, you created.

```java
class Outer{
    public void display(){
        System.out.println("Hello");
    }
    int x = 10;

    class Inner{
        public void greet(){
            System.out.println("Welcome");
        }
        int y = 50;
        public void displayOuterDetails(){
            System.out.println(x);
            display();
        }
    }

    public void displayInnerDetails(){
        Inner inner = new Inner();
        inner.greet();
        System.out.println(inner.y);
    }
}

public class Test{
    public static void main(String[] args){
       Outer o = new Outer();
       Outer.Inner in = o.new Inner();
       in.displayOuterDetails();
    // new Outer().new Inner().displayOuterDetails();
    o.displayInnerDetails();
    }
}
```

#### Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. In main (), create an object of derived class and call the methods. [do all without package statement]

```java
interface Interf1{
    void method1();
    void method2();
}

interface Interf2{
    void method3();
    void method4();
}

interface Interf3 extends Interf1, Interf2{
    void method5();
}

class Demo{
    public void method6(){
        System.out.println("Method6");
    }
}

class Task extends Demo implements Interf3{
    public void method1(){
        System.out.println("Method1");
    }
    public void method2(){
        System.out.println("Method2");
    }
    public void method3(){
        System.out.println("Method3");
    }
    public void method4(){
        System.out.println("Method4");
    }
    public void method5(){
        System.out.println("Method5");
    }
}

public class Test{
    public static void main(String[] args){
       Task task = new Task();
       task.method1();
       task.method2();
       task.method3();
       task.method4();
       task.method5();
       task.method6();
    }
}
```

#### Write a program to demonstrate anonymous inner class (using super class and interface)

```java
class Demo{
    public void display(){
        System.out.println("Hello");
    }
}

interface Interf{
    void greet();
}

public class Test{
    public static void main(String[] args){
       Demo d1 = new Demo(){
        public void display(){
            System.out.println("Konichiwa");
        }
       };
       d1.display();

       Interf i = new Interf(){
        public void greet(){
            System.out.println("Namaste");
        }
       };
       i.greet();

       Demo d3 = new Demo();
       d3.display();
    }
}
```

## Assignment-6

#### Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/inherited block).

```java
class Demo{
    Demo(){
        System.out.println("Inside Demo constructor");
    }
    {
        System.out.println("Inside non static block 1");
    }
    {
        System.out.println("Inside non static block 2");
    }
}

class Tutorial extends Demo{
    Tutorial(){
        System.out.println("Inside Tutorial constructor");
    }
    {
        System.out.println("Inside non static block 3");
    }
}

public class Test{
    public static void main(String[] args){
       Tutorial t = new Tutorial();
    }
}
```

#### Show that static block is executed at the time of class loading and also the order of execution of these blocks (for multiple blocks/inherited block).

```java
class Demo{
    Demo(){
        System.out.println("Inside Demo constructor");
    }
    static{
        System.out.println("Inside static block 1");
    }
    static{
        System.out.println("Inside static block 2");
    }
}

class Tutorial extends Demo{
    Tutorial(){
        System.out.println("Inside Tutorial constructor");
    }
    static{
        System.out.println("Inside static block 3");
    }
}

public class Test{
    public static void main(String[] args){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Tutorial t = new Tutorial();
    }
}
```

#### Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under package pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of previous class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s members.

###### Creating pOne

```java
package pOne;

public class Cut{
    public int x = 10;
    public static double y = 20.3;
    public void method1(){
        System.out.println("Inside method1");
    }
    public static void method2(){
        System.out.println("Inside method2");
    }
}
```
Run the file with `javac -d. Cut.java` to create the package

###### Creating pTwo

```java
package pTwo;
import pOne.Cut;

public class Copy{
    public void method3(){
        Cut cut = new Cut();
        System.out.println(cut.x + " <----> " + cut.y);
        cut.method1();
        cut.method2();
    }
}
```
Run the file with `javac -d. Copy.java` to create the package

###### Main file

```java
import pTwo.Copy;

public class Test{
    public static void main(String[] args){
        Copy cpy = new Copy();
        cpy.method3();
    }
}
```

#### Create an interface containing three methods, in a package ‘pkgOne’. Implement the interface from a class under package pkgTwo. From main, under working directory, create object of the class and call methods of interface.

###### Creating pkgOne

```java
package pkgOne;

public interface College{
    void students();
    void theoryFaculty();
    void labFaculty();
}
```
Run the file with `javac -d. College.java` to create the package

###### Creating pkgTwo

```java
package pkgTwo;
import pkgOne.College;

public class Units implements College{
    public void students(){
        System.out.println("Students");
    }
    public void theoryFaculty(){
        System.out.println("Theory Faculty");
    }
    public void labFaculty(){
        System.out.println("Lab Faculty");
    }
}
```
Run the file with `javac -d. Units.java` to create the package

###### Main file

```java
import pkgTwo.Units;

public class Test{
    public static void main(String[] args){
        Units unt = new Units();
        unt.students();
        unt.theoryFaculty();
        unt.labFaculty();
    }
}
```

#### Take a sting from keyboard and convert into character array (new one).
```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        char[] charStr = str.toCharArray();
        for(int i=0;i<charStr.length;i++){
            System.out.print(charStr[i]+" ");
        }
    }
}
```

#### Take a string from keyboard and a char array (of length 5). Now append the string to that char array.

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        char[] charStr = new char[5];
        System.out.println("Enter 5 characters");
        for(int i=0;i<charStr.length;i++){
            charStr[i] = scanner.next().charAt(0);
        }

        char[] joinedCharArray = new char[charStr.length+str.length()];
        for(int i=0;i<charStr.length;i++){
            joinedCharArray[i] = charStr[i];
        }

        for(int i=0;i<str.length();i++){
            joinedCharArray[5+i] = str.charAt(i);
        }

        System.out.println(joinedCharArray);
    }
}
```

#### Find length of a string taken from keyboard and also find the length of that string except front and end spaces.

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with front and end spaces :");
        String str = scanner.nextLine();

        System.out.println("Length of original string : "+str.length());
        System.out.println("Length of string excluding spaces: "+str.trim().length());
    }
}
```

#### Check if "Tech" presents in "University of Technology" or not. If yes return its position.

```java
public class Test{
    public static void main(String[] args){
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
```

#### Generate password from initials of one’s first_name, middle_name, last_name and with last four digit of your roll_no.(if middlename not presents ,it won't come)

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name :");
        String fname = scanner.next();
        System.out.println("Enter middle name. (Enter 'nil' if no middle name) :");
        String mname = scanner.next();
        System.out.println("Enter last name :");
        String lname = scanner.next();
        System.out.println("Enter roll number :");
        long roll = scanner.nextLong();

        String rollNumber = Long.toString(roll);
        String numExtract = rollNumber.substring(rollNumber.length() - 4);
        if(mname.toLowerCase().equals("nil")){
            System.out.println("Yopr password : "+fname.charAt(0)+lname.charAt(0)+numExtract);
        }
        else{
            System.out.println("Your password : "+fname.charAt(0)+mname.charAt(0)+lname.charAt(0)+numExtract);
        }
    }
}
```

#### Show that the String object is immutable but StringBuffer type object is mutable.

```java
public class Test {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        str.concat(" World");
        System.out.println("After concat (String): " + str);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);
        stringBuffer.append(" World");
        System.out.println("After append (StringBuffer): " + stringBuffer);
    }
}
```

#### Write a program in Java which will read a string and rewrite it in the alphabetical order. For example, the word STRING should be written as GINRST.

```java
import java.util.Scanner;
import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.next();
        char[] strArray = str.toCharArray();

        Arrays.sort(strArray);

        String sortedStr = new String(strArray);
        System.out.println("Sorted string: " + sortedStr);
    }
}
```

#### Write a program in Java to extract a portion of a character string and print the extracted string. Assume that m characters are extracted, starting with the n-th character.

```java
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
            System.out.println("Wrong index");
        }
    }
}
```

#### Write your own method called deleteMe(String str, int m) that returns the input string with the m-th element removed.

```java
import java.util.Scanner;

public class Test{

    static void deleteMe(String str, int m){
        StringBuffer sb = new StringBuffer();
        try{
            sb.append(str.substring(0,m));
            sb.append(str.substring(m+1));
        }
        catch(StringIndexOutOfBoundsException sioobe){
            System.out.println("Wrong index");
        }
        System.out.println("New string : "+sb);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();
       
        System.out.println("Enter a starting index:");
        int idx = scanner.nextInt();
        deleteMe(str,idx);
    }
}
```

#### Write a program to do the following:
1. To output the question “Who is the inventor of Java”?
2. To accept an answer.
3. To print out “Good” and then stop, if the answer is correct.
4. To output the message “Try Again” and then stop, if the answer is wrong.
5. To display the correct answer when the answer is wrong even at the third attempts and stop.

```java
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
```

#### Write a program to handle the ArithmeticException.

```java
public class Test{

    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Division by 0 not allowed");
        }
    }
}
```

#### Write a program for multiple catch to fire ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException both.

```java
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
```

#### Write a program to fire the NegativeArraySize exception.

```java
public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        try{
            int[] num = new int[-5];
        }
        catch(NegativeArraySizeException nase){
            System.out.println("Array index is negative");
        }
    }
}
```

#### Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.

```java
class Demo{
    void m(){
        System.out.println("Hello World");
    }
}

public class Test{
    public static void main(String[] args){
        Demo d = new Demo();
        d = null;
        try{
            d.m();
        }
        catch(NullPointerException npe){
            System.out.println("Null pointer Exception encountered");
        }
    }
}
```

#### Write a program to fire any checked exception manually using ‘throw’ keyword.

```java
import java.io.IOException;

class Demo {
    void m() throws IOException {
        throw new IOException("Manually thrown IOException");
    }
}

public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.m();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

#### Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a person is less than Rs. 10,000 /-) and fire the exception.

```java
import java.util.Scanner;

class PayOutOfBoundsException extends RuntimeException{
    PayOutOfBoundsException(String str){
        super(str);
    }
}

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a salary value : ");
        int salary = scanner.nextInt();

        if(salary < 10000){
            throw new PayOutOfBoundsException("Salary is too low");
        }
        else{
            System.out.println("Salary is valid");
        }
    }
}
```

#### Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).

```java
import java.util.Scanner;

class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}

class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}

class Demo{
    void f() throws MyException{
        try{
            g();
        }
        catch(CustomException ce){
            System.out.println(ce.getMessage());
            throw new MyException("my exception caught");
        }
    }
    void g() throws CustomException{
        throw new CustomException("custom exception caught");
    }
}

public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Demo d = new Demo();
        try{
            d.f();
        }
        catch (MyException me){
            System.out.println(me.getMessage());
        }
    }
}
```