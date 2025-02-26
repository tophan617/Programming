import java.util.Scanner;

public class Piramida1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col=scanner.nextInt();
		 for(int i=1;i<=row;i++) {
			 for(int j=1;j<=col-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}
}
