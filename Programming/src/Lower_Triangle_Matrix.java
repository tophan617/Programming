import java.util.Scanner;

public class Lower_Triangle_Matrix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter col value : ");
		int col=scanner.nextInt();
		System.out.println();
		int[][] matrix=new int[row][col];
		System.out.println("Enter elements in matrix : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Display lower triangle matrix.");
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
