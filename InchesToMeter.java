import java.util.Scanner;

public class InchesToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in inches: ");
        double inches = sc.nextDouble();

        double meters = inches * 0.0254;   // 1 inch = 0.0254 meter

        System.out.println("Value in meters: " + meters);

        sc.close();
    }
}