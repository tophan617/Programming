final public class ImmutableClass {
	private final int x;
	public ImmutableClass(int x) {
		this.x=x;
	}
	@Override
	public String toString() {
		return ""+x;
	}
}
