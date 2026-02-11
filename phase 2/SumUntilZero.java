import java.util.Scanner;
public class SumUntilZero {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();
            sum += num;
        } while(num != 0);
        System.out.println("Sum: " + sum);
        sc.close();
    }
}