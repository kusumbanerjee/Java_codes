import java.util.Scanner;

public class firstCode {
    public static void main(String[] args) {

        // Printing the statement
        System.out.println("Hello Coders");

        // add,sub,mul,div taking user input
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = num.nextInt();
        System.out.println("Enter second number");
        int b = num.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        
        /* Simple Interest
         FORMULA :  p*r*t/100
        */ 

        System.out.println("NEXT, we gotta Calculate Simple interest");

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int p = num1.nextInt();

        System.out.println("Enter second number");
        int d = num1.nextInt();
       
        float R = 6.3f;
        int T = 2;
        double SI = p*R*T/100;
        System.out.println("simple interest is :" + SI);

    }
}

