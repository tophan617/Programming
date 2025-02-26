import java.util.Scanner;

public class CountSubString {
    static int countSubString(String s,String subString){
        int count=0;
        for(int i=0;i<=s.length()-subString.length();i++){
            if(s.charAt(i)==subString.charAt(0) && s.charAt(i+1)==subString.charAt(1) &&
            s.charAt(i+2)==subString.charAt(2)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=scan.next();
        System.out.print("\nEnter sub String : ");
        String subString=scan.next();
        System.out.print("\nTotal sub String are "+countSubString(s, subString));
    }
}
