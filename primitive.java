import java.util.Scanner;

public class primitive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Float input
        System.out.print("Enter a float number: ");
        float decimal = sc.nextFloat();

        // Boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean();

        // Char input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Printing values
        System.out.println("Integer: " + num);
        System.out.println("Float: " + decimal);
        System.out.println("Boolean: " + value);
        System.out.println("Character: " + ch);

        sc.close();
    }
}