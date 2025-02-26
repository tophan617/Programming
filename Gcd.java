import java.util.Scanner;

public class Gcd {
  static int findGcd(int a,int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
  } 
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    int num1=scan.nextInt();
    System.out.print("\nEnter 2nd number : ");
    int num2=scan.nextInt();
    System.out.print("\nGCD of "+num1+" and "+num2+" : "+findGcd(num1, num2));
  }
}
