import java.util.Scanner;

public class Convert_Lower_to_Upper {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=scanner.next();
		System.out.println("\nConvert lower to upper case of a String ");
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a') {
				char temp=(char) (s.charAt(i)-'a');
				char upper=(char)('A'+temp);
				res+=upper;
			}else {
				res+=s.charAt(i);
			}
		}
		System.out.println("Upper String is "+res);
	}
}
