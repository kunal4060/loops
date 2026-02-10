import java.util.Scanner;
public class fibonacci {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        sc.close();
    }
}