import java.util.Scanner;

public class Patteren3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col=scanner.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=col;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
