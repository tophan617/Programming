public class EnumDemo1 {
	public static void main(String[] args) {
		Apple apple;
		System.out.println("Here are all Apple constant.");
		Apple allApple[]=Apple.values();
		for(Apple a:allApple) {
			System.out.println(a);
		}
		apple=Apple.valueOf("RedDel");
		System.out.println("apple contains "+apple);
	}
}
