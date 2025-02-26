import java.util.Scanner;

public class RemoveDuplicate1 {
    static String removeDuplicate(String s){
        String newString="";
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            boolean flag=false;
            for(int j=0;j<newString.length();j++){
                if(newString.charAt(j)==temp){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                newString+=temp;
            }
        }
        return newString;
    }  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=scan.next();
        System.out.print("\nOld String : "+s);
        System.out.print("\nNew String : "+removeDuplicate(s));
    }  
}
