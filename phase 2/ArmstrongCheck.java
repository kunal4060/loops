import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        int temp = Math.abs(n); // Handle negative numbers
        do {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        } while(temp > 0);
        
        if(Math.abs(original) == sum){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}