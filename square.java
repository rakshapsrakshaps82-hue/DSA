import java.util.Scanner;
public class square {
    void <t> square(t num){
        t,num;
        a=num;

        return num*num ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        t num = sc.nextInt();
        t result = square(num);
        System.out.println("Square of " + num + " is: " + result);
    
    }
}