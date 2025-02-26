public class ToStringMethod {
	String s;
	public static void main(String[] args) {
		ToStringMethod tsm=new ToStringMethod();
		String s1="Tophan"; 
		System.out.println("Without constructor : "+s1);
		System.out.println("Default value of String member variable : "+tsm.s);
		String s2=new String("tophan");
		System.out.println("With constructor : "+s2);
	}
}
