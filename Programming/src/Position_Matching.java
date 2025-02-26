import java.util.Scanner;

public class Position_Matching {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size=scanner.nextInt();
		System.out.println();
		int[] arr=new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println();
		System.out.println("Match position value to element");
		for(int i=0;i<arr.length;i++) {
			int pos=i+1;
			if(pos==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
}
