import java.util.Scanner;
public class SumOfDigits {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = Math.abs(n); // Handle negative numbers
        do {
            sum += temp % 10;
            temp /= 10;
        } while(temp > 0);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}