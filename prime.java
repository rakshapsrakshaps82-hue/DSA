import java.util.Scanner;
public class prime {
    public static <T extends Number> void isprime(T num){
        
        int n = num . intValue();

        if(n<2){
            System.out.println(n + " is not a prime number.");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(n + " is not a prime number.");
                return;
            }
        
        }
        System.out.println(n + " is a prime number.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        isprime(num);
    }
    
}
