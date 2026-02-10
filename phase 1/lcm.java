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
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM: " + lcm);
        sc.close();
    }
}