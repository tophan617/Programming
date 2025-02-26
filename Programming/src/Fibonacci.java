public class Fibonacci {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2);
		for(int i=1;i<10-1;i++) {
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(" "+num2);
		}
	}
}
