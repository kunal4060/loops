import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = Math.abs(n); // Work with absolute value
        int reversed = 0;
        int temp = original;
        do {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        } while(temp > 0);
        
        if(original == reversed){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}