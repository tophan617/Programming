import java.util.Scanner;

public class MatrixInversion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter row value : ");
        int row=scan.nextInt();
        System.out.print("\nEnter column value : ");
        int col=scan.nextInt();
        int[][] arr1=new int[row][col];
        System.out.print("\nEnter elements in array : ");
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scan.nextInt();
            }
            System.out.println();
        }

        System.out.println("Inversion of Matrix.");
        int[][] newArray=new int[row][col];
        for(int x=0;x<row;x++){
            for(int y=0;y<col;y++){
                System.out.print(" "+(newArray[x][y]=arr1[row-1-x][col-1-y])+" ");
            }
            System.out.println();
        }
    }
}
