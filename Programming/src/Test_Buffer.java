public  class Test_Buffer implements Runnable{
	static synchronized StringBuffer test(StringBuffer sb) {
		sb.append(" Tophan");
		return sb;
	}
	
	@Override
	public void run() {
		System.out.println(test(new StringBuffer("Hello")));
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Test_Buffer tb=new Test_Buffer();
		Thread t1=new Thread(tb,"Thread1");
		t1.start();
		Thread t2=new Thread(tb,"Thread2");
		t2.start();
		
		
	}
}
