import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter row value : ");
        int row=scan.nextInt();
        System.out.print("\nEnter column value : ");
        int col=scan.nextInt();
        int[][] arr1=new int[row][col];
        System.out.print("\nEnter elements in 1st array : ");
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scan.nextInt();
            }
            System.out.println();
        }

        int[][] arr2=new int[row][col];
        System.out.println("Enter elements in 2nd array : ");
        for(int x=0;x<row;x++){
            for(int y=0;y<col;y++){
                arr2[x][y]=scan.nextInt();
            }
            System.out.println();
        }

        int[][] sum=new int[row][col];
        System.out.println("Addition of  Matrix.");
        for(int a=0;a<row;a++){
            for(int b=0;b<col;b++){
                System.out.print(" "+(sum[a][b]=arr1[a][b]+arr2[a][b])+" ");
            }
            System.out.println();
        }
    }
}
