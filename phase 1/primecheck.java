import java.util.Scanner;
public class primecheck {
    public static void main(String arg[]){

        
        while(true) {
            System.out.print("Enter number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 2;
            while (i < n / 2){
                if ( n % i != 0 ){
                    System.out.println(" Prime");
                    break;
                } else {
                    System.out.println(" Not Prime");
                    break;
                }
            } 
            // sc.close();
            System.out.println("Do you want to continue? (y/n)");
            char ch = sc.next().charAt(0);
            if (ch != 'y') {
                break;
            }
        }        
     
        // boolean isPrime = true;
        // for(int i = 2; i < n; i++){
        //     if(n % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime && n > 1){
        //     System.out.println("Prime");
        // } else {
        //     System.out.println("Not Prime");
        // }
        
    }
}