import java.util.Scanner;

public class Sum_Of_All_Elements {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Element size of an array : ");
		int size=scanner.nextInt();
		System.out.println();
		System.out.print("Enter elements in an array : ");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println();
		System.out.print("Sum of all elements : ");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.print(sum);
	}
}
