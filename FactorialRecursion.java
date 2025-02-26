import java.util.Scanner;

public class FactorialRecursion {
    static int findFactorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*findFactorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=scan.nextInt();
        int result=findFactorial(n);
        System.out.print("\nFactorial is "+result);
    }
}
