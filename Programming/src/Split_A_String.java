import java.util.Scanner;

public class Split_A_String {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=scanner.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				res+=s.charAt(i);
			}else {
				System.out.println(res);
				res="";
			}
		}
		System.out.println(res);
	}
}
