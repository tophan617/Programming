import java.util.Scanner;

public class Nth_Prime_Number {
	
	static int find_nth_Prime_number(int n) {
		int res=0;
		int count=0;
		for(int i=2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				res++;
			}
			count=0;
			if(res==n) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter nth value : ");
		int n=scanner.nextInt();
		System.out.println(find_nth_Prime_number(n));
	}
}
