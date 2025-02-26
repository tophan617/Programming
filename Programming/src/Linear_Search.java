import java.util.Scanner;

public class Linear_Search {
	static void search(int[] arr,int n) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Element found at index : "+i);
				break;
			}
			count++;
		}
		if(count==arr.length) {
			System.out.println("Element not found!!!!");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		System.out.println("\nEnter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.print("Enter search element : ");
		int s=scanner.nextInt();
		search(arr, s);
	}
}
