import java.util.Scanner;

public class Factorial {
    static int findFactorial(int n){
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=scan.nextInt();
        System.out.println("\n"+n+" factorial is "+findFactorial(n));
    }
}
