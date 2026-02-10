import java.util.Scanner;
public class multiplication {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " × " + i + " = " + (n*i));
        }
        sc.close();
    }
}