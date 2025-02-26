import java.util.Scanner;

public class Bubble_Sort {
	static void sort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=1;j<len;j++) {
				int temp=0;
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Print the sorted array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		System.out.println("\nEnter array elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		sort(arr);
	}
}
