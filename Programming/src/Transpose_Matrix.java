import java.util.Scanner;

public class Transpose_Matrix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col=scanner.nextInt();
		System.out.println();
		int[][] matrix=new int[row][col];
		System.out.println("Enter elemnets in matrix : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=scanner.nextInt();		
			}
		}
		
		int[][] transposeMatrix=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=i;k<=i;k++) {
					transposeMatrix[i][j]=matrix[j][k];
				}
			}
		}
		
		System.out.println("Display the Transpose matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(transposeMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
