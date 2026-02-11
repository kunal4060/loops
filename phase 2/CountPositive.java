import java.util.Scanner;
public class CountPositive {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num;
        do {
            System.out.print("Enter number (negative to stop): ");
            num = sc.nextInt();
            if(num > 0) {
                count++;
            }
        } while(num >= 0);
        System.out.println("Positive numbers entered: " + count);
        sc.close();
    }
}