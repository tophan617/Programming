public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main method started.");
		ImmutableClass im=new ImmutableClass(10);
		System.out.println(im);
		System.out.println(im.hashCode());
		im=new ImmutableClass(20);
		System.out.println(im);
		System.out.println(im.hashCode());
		System.out.println("Main method ended.");
	}
}
