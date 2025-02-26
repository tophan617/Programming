import java.util.Scanner;

public class Find_2nd_Largest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size=scanner.nextInt();
		System.out.println();
		int[] arr=new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println();
		System.out.print("Find 2nd largest element of an array : ");
		int lar1=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(lar1<arr[i]) {
				lar1=arr[i];
			}
		}
		int lar2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=lar1 && arr[i]>lar2) {
				lar2=arr[i];
			}
		}
		System.out.print(lar2);
	}
}
