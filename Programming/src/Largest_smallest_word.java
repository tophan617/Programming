public class Largest_smallest_word {
	static void find_Large_and_small(String s){
		String temp=s;
		int len=s.length();
		int lar=len;
		int small=0;
		if(len>lar) {
			System.out.println(temp);
		}else{
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		String s="Hii Good morning";
		String sub="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				sub+=c;
			}else {
				find_Large_and_small(sub);
				sub="";
			}
		}
		find_Large_and_small(sub);
	}
}
