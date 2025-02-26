public class SOP_Finally_return_Try {
	static int display() {
		try {
			return 10;
		}finally {
			System.out.println("Finally block.");
		}
	}
	public static void main(String[] args) {
		System.out.println(display());
	}
}
