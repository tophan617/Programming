import java.util.Scanner;

public class Intersection {
    static void findCommonDigit(int num1,int num2){
        while(num1>0){
            int digit1=num1%10;
            num1/=10;
            int temp=num2;
            while(temp>0){
                int digit2=temp%10;
                if(digit1==digit2){
                    System.out.println(digit1);
                    break;
                }
                temp/=10;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1=scan.nextInt();
        System.out.print("\nEnter 2nd number : ");
        int num2=scan.nextInt();
        findCommonDigit(num1, num2);
    }
}
