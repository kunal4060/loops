public class prime100 {
    public static void main(String arg[]){
        System.out.println("Prime numbers 1 to 100:");
        for(int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}