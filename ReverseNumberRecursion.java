import java.util.Scanner;

public class ReverseNumberRecursion {
    static void printReverse(int[] arr,int index){
        if(index < 0){
            return;
        }
        System.out.print(arr[index]+" ");
        printReverse(arr, index-1);
    }

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter n value :");
       int n=scan.nextInt();
       int[] arr=new int[n];
       System.out.print("\nEnter array elements ");
       for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
       }
       printReverse(arr, n-1);
    }
}
