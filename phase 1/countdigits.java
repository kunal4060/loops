import java.util.Scanner;
public class countdigits {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // int count = 0;
        // while(n > 0){
        //     count++;
        //     n /= 10;12
        // }
        int count = Integer.toString(n).length();
        // int count2 = String.valueOf(n).length();
        

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}