import java.util.Scanner;

public class ReverseStringRecursion {
 static String reverse(String s){
    if(s.isEmpty()){
        return s;
    }else{
        return reverse(s.substring(1))+s.charAt(0);
    }
 }
 
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a string : ");
    String s=scan.next();
    String rev=reverse(s);
    System.out.print("\nReversed String is "+rev);
 }
}
