import java.util.Scanner;

public class FindDay {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter year :");
		int year=scanner.nextInt();
		System.out.print("\nEnter month :");
		int month=scanner.nextInt();
		System.out.print("\nEnter day :");
		int day=scanner.nextInt();
		int count=0;
		boolean flag=false;
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			flag=true;
		}
		for(int i=1;i<year;i++) {
			if((i%4==0) && (i%100!=0) || (i%400==0)) {
				count+=366;
			}else {
				count+=365;
			}
		}
		for(int j=1;j<month;j++) {
			if(j==1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12) {
				count+=31;
			}else if(j==4 || j==6 || j==9 || j==11) {
				count+=30;
			}else if(flag==true && j==2) {
				count+=29;
			}else {
				count+=28;
			}
		}
		count+=day;
		int res=count%7;
		System.out.println("\nFind Day...");
		switch (res) {
		case 0: 
			System.out.println("Sunday");
			break;
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}
