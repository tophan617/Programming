import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first matrix row value : ");
        int row1=scan.nextInt();
        System.out.print("\nEnter first matrix column value : ");
        int col1=scan.nextInt();
        int[][] arr1=new int[row1][col1];
        System.out.print("\nEnter elements in first matrix : ");
        System.out.println();
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.print("Enter second matrix row value : ");
        int row2=scan.nextInt();
        System.out.print("\nEnter second matrix column value : ");
        int col2=scan.nextInt();
        int[][] arr2=new int[row2][col2];
        System.out.print("\nEnter elements in second matrix : ");
        for(int x=0;x<row2;x++){
            for(int y=0;y<col2;y++){
                arr2[x][y]=scan.nextInt();
            }
            System.out.println();
        }

        int[][] newMatrix=new int[row1][col2];
        if(col1 != row2){
            System.out.println("Matrix multiplication is not possible.");
            return;
        }else{
            System.out.println("Multiplication of Matrix");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    newMatrix[i][j]=0;
                    for(int k=0;k<col1;k++){
                        newMatrix[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
        }
        System.out.println("Display the new matrix.");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(" "+newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
