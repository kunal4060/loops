import java.util.Scanner;
public class sumfactors {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        System.out.println("Sum of factors: " + sum);
        sc.close();
    }
}