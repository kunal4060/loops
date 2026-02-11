import java.util.Scanner;
public class Factorial {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while(i <= n);
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}