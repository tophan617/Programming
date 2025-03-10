import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of elements you want:");
		int n=scan.nextInt();
		int[] bubblSort=new int[n];
		System.out.println("\nTake input from user : ");
		for(int i=0;i<n;i++) {
			bubblSort[i]=scan.nextInt();
		}
		
		System.out.println("Bubble sort in ascending order.");
		int temp=0;
		for(int i=0;i<bubblSort.length;i++) {
			for(int j=1;j<bubblSort.length;j++) {
				if(bubblSort[j-1]>bubblSort[j]) {
					temp=bubblSort[j-1];
					bubblSort[j-1]=bubblSort[j];
					bubblSort[j]=temp;
				}
			}
		}
		
		System.out.println("Print the sorted elements.");
		for(int i=0;i<n;i++) {
			System.out.print(bubblSort[i]+" ");
		}
		
		System.out.println("\nBubble sort in Descending order.");
		for(int i=0;i<bubblSort.length;i++) {
			for(int j=1;j<bubblSort.length;j++) {
				if(bubblSort[j-1]<bubblSort[j]) {
					temp=bubblSort[j-1];
					bubblSort[j-1]=bubblSort[j];
					bubblSort[j]=temp;
				}
			}
		}
		
		System.out.println("Print the sorted elements.");
		for(int i=0;i<n;i++) {
			System.out.print(bubblSort[i]+" ");
		}
	}
}
