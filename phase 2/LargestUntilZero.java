import java.util.Scanner;
public class LargestUntilZero {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;
        do {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();
            if(num != 0 && num > max){
                max = num;
            }
        } while(num != 0);
        System.out.println("Largest: " + max);
        sc.close();
    }
}