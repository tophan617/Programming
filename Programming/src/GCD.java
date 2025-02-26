import java.util.Scanner;

public class GCD {
	static int findGcd(int a,int b) {
		int smallNumber=0;
		int gcd=0;
		if(a<b) {
			smallNumber=a;
		}else {
			smallNumber=b;
		}
		for(int i=1;i<=smallNumber;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1=scan.nextInt();
		System.out.print("Enter second number : ");
		int num2=scan.nextInt();
		System.out.println();
		System.out.println("Gcd of "+num1+" and "+num2+" is : "+findGcd(num1, num2));
	}
}
