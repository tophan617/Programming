import java.util.Scanner;

public class CircularArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		int len=arr.length;
		System.out.println();
		System.out.print("Enter how many elements do you want to insert : ");
		int ele=scanner.nextInt();
		System.out.print("Enter array elements : ");
		for(int i=0;i<ele;i++) {
			arr[i%size]=scanner.nextInt();
		}
		System.out.println();
		System.out.println("Display");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]);
		}
	}
}
