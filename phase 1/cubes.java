import java.util.Scanner;
public class cubes {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Cubes:");
        for(int i = 1; i <= n; i++){
            System.out.println(i + "³ = " + (i*i*i));
        }
        sc.close();
    }
}