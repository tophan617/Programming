public class Test_mm {
	static void test(StringBuffer sb) {
		System.out.println(sb.hashCode());
		sb=sb.append(" Giri");
		System.out.println(sb.hashCode());
	}
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Tophan");
		System.out.println(sb);
		test(sb);
		System.out.println(sb);
	}
}
