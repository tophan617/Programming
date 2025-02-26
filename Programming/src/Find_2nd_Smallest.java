import java.util.Scanner;

public class Find_2nd_Smallest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size=scanner.nextInt();
		System.out.println();
		int[] arr=new int[size];
		System.out.print("Enter elements in an array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println();
		System.out.print("Find 2nd smallest element of an array is ");
		int small1=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(small1>arr[i]) {
				small1=arr[i];
			}
		}
		int small2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=small1 && arr[i]<small2) {
				small2=arr[i];
			}
		}
		System.out.print(small2);
	}
}
