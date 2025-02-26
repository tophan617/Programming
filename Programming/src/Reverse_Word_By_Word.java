import java.util.Scanner;

public class Reverse_Word_By_Word {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=scanner.nextLine();
		String sub="";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				sub+=rev+" ";
				rev="";
			}else {
				rev=ch+rev;
			}	
		}
		sub+=rev;
		System.out.println("Reverse String word by word : "+sub);
	}
}
