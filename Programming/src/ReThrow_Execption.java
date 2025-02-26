public class ReThrow_Execption {
	static void display() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("Exception is handled.");
		}finally {
			System.out.println("Finally block re throw the exception.");
			throw new RuntimeException();
		}
	}
	public static void main(String[] args) {
		display();
	}
}
