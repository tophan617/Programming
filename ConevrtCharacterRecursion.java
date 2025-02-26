import java.util.Scanner;

public class ConevrtCharacterRecursion {
    static String convert(String s,boolean flag){
        if(flag==true){
            return upperCase(s);
        }else{
            return lowerCase(s);
        }
    }
    static String upperCase(String s){
        if(s.isEmpty()){
            return s;
        }else{
            int index=0;
            char currentChar=s.charAt(index);
            return Character.toUpperCase(currentChar)+upperCase(s.substring(index+1));
        }
    }

    static String lowerCase(String s){
        if(s.isEmpty()){
            return s;
        }else{
            int index=0;
            char currentChar=s.charAt(index);
            return Character.toLowerCase(currentChar)+lowerCase(s.substring(index+1));
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
        System.out.print("Enter a String : ");
        String s=scan.next();
        System.out.print("\nEnter flag value : ");
        boolean flag=scan.nextBoolean();
        String result=convert(s, flag);
        System.out.println("result "+result);
    }
}
