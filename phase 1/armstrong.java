import java.util.Scanner;
public class armstrong {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = Integer.toString(n).length();
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if(original == sum){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}