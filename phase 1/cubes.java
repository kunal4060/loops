import java.util.Scanner;
public class cubes {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Cubes:");
        int cube = (int) Math.pow(n,3);
        System.out.println(n + " = " + cube);
    //     for(int i = 1; i <= n; i++){
    //         System.out.println(i + " = " + (i*i*i));
    //     }
    //     sc.close();
    }
}