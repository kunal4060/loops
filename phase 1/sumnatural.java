import java.util.Scanner;
public class sumnatural {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while(i <= n);
        System.out.println("Sum: " + sum);
        sc.close();
    }
}