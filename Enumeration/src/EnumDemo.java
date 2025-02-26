public class EnumDemo {
	public static void main(String[] args) {
		Apple apple;
		apple=Apple.RedDel;
		System.out.println("Value of apple : "+apple);
		apple=Apple.GoldenDel;
		if(apple==Apple.GoldenDel) {
			System.out.println("apple contains GoldenDel.");
		}
		switch (apple) {
		case Jonathan:
			System.out.println("Jonathan is red.");
			break;
		case GoldenDel:
			System.out.println("GoldenDel is yellow.");
			break;
		case RedDel:
			System.out.println("RedDel is red.");
			break;
		case Winesap:
			System.out.println("Winesap is red.");
		case Cortland:
			System.out.println("Cortland is red.");
		default:
			System.out.println("Invalid Enum.");
		}
	}
}
