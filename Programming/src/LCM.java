import java.util.Scanner;

public class LCM {
	static int findLCM(int a,int b) {
		int larageNumber=0;
		if(a>b) {
			larageNumber=a;
		}else {
			larageNumber=b;
		}
		while(true) {
			if(larageNumber%a==0 && larageNumber%b==0) {
				break;
			}
			larageNumber+=larageNumber;
		}
		return larageNumber;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1=scan.nextInt();
		System.out.print("\nEnter second number : ");
		int num2=scan.nextInt();
		System.out.print("\nLCM of "+num1+" and "+num2+" is : "+findLCM(num1, num2));
		
	}
 }
