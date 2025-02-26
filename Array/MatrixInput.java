import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter row value : ");
        int row=scan.nextInt();
        System.out.print("\nEnter Column value : ");
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        System.out.print("\nEnter elements in 2D array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }

        System.out.print("Display the 2D array");
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("  "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}