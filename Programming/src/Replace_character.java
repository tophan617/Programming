public class Replace_character {
	public static void main(String[] args) {
		String s="Hello Good Morning";
		char c='a';
		char r='o';
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==r) {
				ch=c;
				res+=ch;
			}else {
				res+=ch;
			}
		}
		System.out.println(res);
	}
}
