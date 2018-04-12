package JavaMentorProgram;
import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {

        double a;
        double b;
        String operation;
        double c;      // result of any opreation

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number");
            a = input.nextDouble();

            System.out.println("Enter the second number");
            b = input.nextDouble();

            Scanner op = new Scanner(System.in);
            System.out.println("Enter the Operation");
            operation = op.next();

            if (operation.equals("+")) {
                c = a + b;
                System.out.println("Your result is: c = " + c);
            } else if (operation.equals("-")) {
                c = a - b;
                System.out.println("Your result is: c = " + c);
            } else if (operation.equals("*")) {
                c = a * b;
                System.out.println("Your result is: c =  " + c);
            } else if (operation.equals("/")) {
                if (b == 0) {
                    System.out.println("You cannot devide by 0");
                } else {
                    c = a / b;
                    System.out.println("Your result is: c =  " + c);
                }
            } else {
                System.out.println("You entered wrong operation");
            }
    }
}

