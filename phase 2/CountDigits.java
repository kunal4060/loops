import java.util.Scanner;
public class CountDigits {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = Math.abs(n); // Handle negative numbers
        if(temp == 0) {
            count = 1; // Special case for 0
        } else {
            do {
                count++;
                temp /= 10;
            } while(temp > 0);
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}