import java.util.Scanner;

public class SquareRoot {
	static int find_square_root(int n) {
		int temp=n;
		int num=1;
		int count=0;
		while(num<=temp) {
			int sub=temp-num;
			num+=2;
			temp=sub;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=scanner.nextInt();
		System.out.println();
		System.out.println("Square root of "+num+" is "+find_square_root(num));
	}
}
