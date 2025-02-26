public class Test_Builder {
	static void test(StringBuilder sb) {
		System.out.println(sb.hashCode());
		sb=sb.append(" Giri");
		System.out.println(sb.hashCode());
	}
	
	public static void main(String[] args) {
		StringBuilder sbb=new StringBuilder("Tophan");
		System.out.println(sbb);
		test(sbb);
		System.out.println(sbb);
	}
}
