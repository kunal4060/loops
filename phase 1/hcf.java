import java.util.Scanner;
public class hcf {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int smaller = (a < b) ? a : b;
        int hcf = 1;
        for(int i = 1; i <= smaller; i++){
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF: " + hcf);
        sc.close();
    }
}