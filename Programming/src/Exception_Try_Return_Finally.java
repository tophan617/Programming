public class Exception_Try_Return_Finally {
	static int display() {
		try {
			throw new RuntimeException("Run time exception.");
		}finally {
			return 10;
		}
	}
	public static void main(String[] args) {
		System.out.println(display());
	}
}
