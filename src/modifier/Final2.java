package modifier;

 final class Final2   {
	public static void main(String[] args) {
		Final1.m1();
		Final1 obj=new Final1();
		obj.m2();                             // accessible within the package only *not inheritance applied
	}                                        // calling methods by association

}
