package modifier;

public class ClassModifier2 {
	public static void m1() {
		System.out.println("classmodifier 2 m1");
	}
	public static void main(String[] args) {
		ClassModifier1.m1();
		m1();
		 // default can be accessed within the package only
	}

}
