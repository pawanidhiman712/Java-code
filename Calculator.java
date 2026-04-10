import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation: +  -  *  /");
        char operator = sc.next().charAt(0);

        double result = 0;

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Subtraction = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}