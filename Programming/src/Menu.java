import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int num1=scanner.nextInt();
		System.out.print("\nEnter 2nd number :");
		int num2=scanner.nextInt();
		while(true) {
			System.out.println("!!!Welcome to my Menu driven program!!!");
			System.out.println("1 :- Addition");
			System.out.println("2 :- Subtraction");
			System.out.println("3 :- Multiplication");
			System.out.println("4 :- Division");
			System.out.println("5 :- Reminder");
			System.out.println("Enter your choice...");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Addition");
				int add=num1+num2;
				System.out.println("Addition of num1 and num2 is "+add);
				break;
			}
			case 2: {
				System.out.println("Subtraction");
				int sub=num1-num2;
				System.out.println("Subtraction of num1 and num2 is "+sub);
				break;
			}
			case 3: {
				System.out.println("Multiplication");
				int mul=num1*num2;
				System.out.println("Multiplication of num1 and num2 is "+mul);
				break;
			}
			case 4: {
				System.out.println("Division");
				int div=num1/num2;
				System.out.println("Division of num1 and num2 is "+div);
				break;
			}
			case 5: {
				System.out.println("Reminder");
				int rem=num1%num2;
				System.out.println("Reminder of num1 and num2 is "+rem);
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
