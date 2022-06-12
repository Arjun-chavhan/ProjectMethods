package modifier;

 class Default2  {
	 public  void met() {
		 System.out.println("default modifier accepts inheritance also and limit within package m1");
	 }
public static void main(String[] args) {
	Default2 obj= new Default2();
	Default1 obj1=new Default1();
	obj1.m1(); 
	obj.met();// acceessable within package only *default accept inheritance
	          // final NOT accept inheritance
}
}
