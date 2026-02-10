import java.util.Scanner;
public class divisible7 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Numbers divisible by 7:");
        for(int i = a; i <= b; i++){
            if(i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}