import java.util.Scanner;

public class Convert_Upper_to_Lower {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=scanner.next();
		System.out.println("\nConvert Upper to Lower case of a String ");
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='a') {
				char temp=(char) (s.charAt(i)-'A');
				char lower=(char) (temp+'a');
				res+=lower;
			}else {
				res+=s.charAt(i);
			}
		}
		System.out.println("Lower case String is : "+res);
	}
}
