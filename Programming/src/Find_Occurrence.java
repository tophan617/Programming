import java.util.Scanner;

public class Find_Occurrence {
	static void find_Occurrenece_elements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(num==arr[j]) {
					count++;
				}
			}
			System.out.println("Occurrence of "+arr[i]+" is "+count);
			count=0;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		System.out.print("\nEnter elements in an array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		find_Occurrenece_elements(arr);
	}
}
