import java.util.Scanner;

public class Equal_Matrixs {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter row value : ");
		int row1=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col1=scanner.nextInt();
		System.out.println();
		int[][] matrix1=new int[row1][col1];
		System.out.println("\nEnter elements in matrix : ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				matrix1[i][j]=scanner.nextInt();
			}
		}
		
		System.out.print("Enter row value : ");
		int row2=scanner.nextInt();
		System.out.print("\nEnter column value : ");
		int col2=scanner.nextInt();
		System.out.println();
		int[][] matrix2=new int[row2][col2];
		System.out.println("\nEnter elements in matrix : ");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				matrix2[i][j]=scanner.nextInt();
			}
		}
		boolean flag=false;
		if(row1==row2 && col1==col2) { 
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					if(matrix1[i][j]==matrix2[i][j]) {
						flag=true;
					}else {
						flag=false;
						break;
					}
				}
				
			}
		}
		if(flag==true) {
			System.out.println("Both are equal");
		}else {
			System.out.println("not equal");
		}
		
	}
}
