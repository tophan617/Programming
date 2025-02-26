public class Largest_Palindrome_String {
	public static void main(String[] args) {
		String s="mam tcact";
		String sub="";
		String rev="";
		int len=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				sub+=c;
				rev=c+rev;
			}else {
				if(sub.equals(rev)) {
					
				}
			}
		}
	}
}
