import java.util.Scanner;

public class Piramida3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col=scanner.nextInt();
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