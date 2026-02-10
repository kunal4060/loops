import java.util.Scanner;
public class smallestdigit {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int smallest = 9;
        while(n > 0){
            int digit = n % 10;
            if(digit < smallest){
                smallest = digit;
            }
            n /= 10;
        }
        System.out.println("Smallest digit: " + smallest);
        sc.close();
    }
}