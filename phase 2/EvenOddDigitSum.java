import java.util.Scanner;
public class EvenOddDigitSum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        int temp = Math.abs(n); // Handle negative numbers
        do {
            int digit = temp % 10;
            if(digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            temp /= 10;
        } while(temp > 0);
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        sc.close();
    }
}