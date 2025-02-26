import java.util.Scanner;

public class RemoveDuplicate2 {
    static String removeDuplicate(String s){
        char[] chars=s.toCharArray();
        int length=chars.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(chars[i] == chars[j]){
                    for(int k=j;k<length-1;k++){
                        chars[k]=chars[k+1];
                    }
                    length--;
                    j--;
                }
            }
        }
        return new String(chars,0,length);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=scan.next();
        System.out.print("\nOld String : "+s);
        System.out.print("\nNew String : "+removeDuplicate(s));
    }
}
