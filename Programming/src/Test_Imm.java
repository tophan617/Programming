public class Test_Imm {
	static void test(String s) {
		System.out.println(s.hashCode());
		s=s+"iii";
		System.out.println(s.hashCode());
	}
	public static void main(String[] args) {
		String s="Hii";
		System.out.println(s);
		test(s);
		System.out.println(s);
	}
}
