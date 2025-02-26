import java.util.Scanner;

public class Binary_Search {
	static int search(int[] arr,int data,int size) {
		int l=0,r=size-1;
		while(l<r) {
			int mid=(l+r)/2;
			if(data==arr[mid]) {
				return mid;
			}else if(data<arr[mid]) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return -1;
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
		int data=scanner.nextInt();
		int res=search(arr,data,size);
		if(res>=0) {
			System.out.println("Element found at index : "+res);
		}else {
			System.out.println("Element not found!!!");
		}
	}
}
