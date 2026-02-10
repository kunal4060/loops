import java.util.Scanner;
public class sumnatural {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}