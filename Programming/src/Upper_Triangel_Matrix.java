import java.util.Scanner;

public class Upper_Triangel_Matrix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col=scanner.nextInt();
		System.out.println();
		int[][] matrix=new int[row][col];
		System.out.println("Enter elements in matrix : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Display Upper triangle matrix ");
		for(int i=0;i<row;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<col;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
