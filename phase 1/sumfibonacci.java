import java.util.Scanner;
public class sumfibonacci {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        for(int i = 1; i <= n; i++){
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of Fibonacci: " + sum);
        sc.close();
    }
}