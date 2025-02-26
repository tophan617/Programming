public class Return_Try_Final {
	static int display() {
		try {
			return 5;
		}
		finally{
			return 10;
		}
	}
	public static void main(String[] args) {
		System.out.println(display());
	}
}
