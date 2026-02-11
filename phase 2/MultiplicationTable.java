import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(n + " × " + i + " = " + (n*i));
            i++;
        } while(i <= 10);
        sc.close();
    }
}