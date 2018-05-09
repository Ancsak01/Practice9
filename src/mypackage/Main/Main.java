package mypackage.Main;

import mypackage.Cilinder;
import mypackage.Cuboid;

public class Main {

	public static void main(String[] args) {
		
		Cilinder x = new Cilinder(10, 20);
		System.out.println(x);
		System.out.println(x.getVolume());
		
		Cuboid y = new Cuboid(10, 3, 5);
		System.out.println(y);
		System.out.println(y.getVolume());
		
		System.out.println(x.isBiggerThan(y));

	}

}
