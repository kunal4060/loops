import java.util.Scanner;
public class palindrome {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        while(n > 0){
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        if(original == reversed){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}