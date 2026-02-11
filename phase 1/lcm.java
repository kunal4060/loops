import java.util.Scanner;
public class lcm {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int larger = (a > b) ? a : b;
        int lcm = larger;
        int hcf = 1;
        for(int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                hcf = i;
                
            }
            
        }System.out.println("HCF: " + hcf);
        lcm = (a * b) / hcf;
        
            // while(true){
            //     if(lcm % a == 0 && lcm % b == 0){
            //         break;
            //     }
            //     lcm++;
            // }
        System.out.println("LCM: " + lcm);
        sc.close();
    }
}