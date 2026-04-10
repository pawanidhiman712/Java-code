import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("Largest number is: " + a);

        if (b > a && b > c)
            System.out.println("Largest number is: " + b);

        if (c > a && c > b)
            System.out.println("Largest number is: " + c);
    }
}
        
    
