import java.util.Scanner;
public class ReverseNumber {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reversed = 0;
        int temp = Math.abs(n); // Handle negative numbers
        do {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        } while(temp > 0);
        
        if(n < 0) {
            reversed = -reversed; // Preserve sign
        }
        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}