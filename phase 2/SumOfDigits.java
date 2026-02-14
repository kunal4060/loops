import java.util.Scanner;
class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){

            int n = sc.nextInt();
            int sum = 0;
            do{
                int a = n % 10 ;
                sum = sum + a ;
                n = n / 10 ;




            }while(n>0);
            System.out.println(sum);
            System.out.println("exit == s");
            String s = sc.nextLine();
            if ( s == "s"){

                break ;

            }
        }


    }

}