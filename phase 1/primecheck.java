import java.util.Scanner;
public class primecheck {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime && n > 1){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}