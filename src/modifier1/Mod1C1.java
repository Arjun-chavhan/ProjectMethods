package modifier1;

import modifier.ModC1;                              //jvm suggested import applied to import class from another package 
public class Mod1C1 {
public static void main(String[] args) { //accessed another package method in this package
	ModC1 obj =new ModC1();
	obj.m1();
	ModC1.m2();
}
}
