import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, count = 0;
        System.out.print("Fibonacci Series: ");
        if(n >= 1) {
            System.out.print(a + " ");
            count++;
        }
        if(n >= 2) {
            System.out.print(b + " ");
            count += 1;
        }
        if(n > 2) {
            do {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
                count++;
            } while(count < n);
        }
        System.out.println();
        sc.close();
    }
}