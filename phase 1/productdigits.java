import java.util.Scanner;
public class productdigits {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int product = 1;
        while(n > 0){
            product *= (n % 10);
            n /= 10;
        }
        System.out.println("Product of digits: " + product);
        sc.close();
    }
}