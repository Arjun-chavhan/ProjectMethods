package modifier1;

 class Def2 {
	public static void main(String[] args) {    // default modifier accessed within package
		Def1.m1();                              // inheritance also possible within package
		Def1 obj=new Def1();
		obj.m2();
	}

}
