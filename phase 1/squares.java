import java.util.Scanner;
public class squares {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Squares:");
        for(int i = 1; i <= n; i++){
            System.out.println(i + "² = " + (i*i));
        }
        sc.close();
    }
}