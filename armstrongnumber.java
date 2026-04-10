import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int sum = 0;
        int digits = 0;
        
        // Count digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        
        temp = num;
        
        // Calculate sum of digits raised to power
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp = temp / 10;
        }
        
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        
        sc.close();
    }
}