import java.util.Scanner;

public class Dimond2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col=scanner.nextInt();
		System.out.println();
		for(int i=1;i<=(row/2)+1;i++) {
			for(int j=i;j<=(row/2);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=(row/2);i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<=(row/2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=(row/2)+1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=col-i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=(row/2);i++) {
			for(int j=i;j<=(col/2);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
