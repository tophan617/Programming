import java.util.Scanner;

public class Find_Smallest_Element {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size=scanner.nextInt();
		System.out.println();
		int[] arr=new int[size];
		System.out.print("Enter elements of an array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println();
		System.out.print("Find smallest element in an array : ");
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		System.out.print(small);
	}
}
