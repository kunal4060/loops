import java.util.Scanner;
public class HCF {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int smaller = (a < b) ? a : b;
        int hcf = 1;
        int i = 1;
        do {
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
            i++;
        } while(i <= smaller);
        System.out.println("HCF: " + hcf);
        sc.close();
    }
}