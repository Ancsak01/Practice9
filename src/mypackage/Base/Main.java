package mypackage.Base;

import mypackage.Cilinder;
import mypackage.Cuboid;
import mypackage.Prism;

public class Main {

	public static void main(String[] args) {
		
		Database data = new Database(5);
		Prism cuboid = new Cuboid(4, 2, 3);
		
		Prism cylinder1 = new Cilinder(4, 6);
		Cilinder cylinder2 = new Cilinder(4, 3);
		
		data.setPrism(0, cuboid);
		data.setPrism(2, cylinder1);
		data.setPrism(4, cylinder2);
		
		for (int i = 0; i < data.getNumberOfPrisms(); i++) {
			System.out.println(data.getPrismByIndex(i));
		}
		
		System.out.println(data.getAverageOfVolume());
		System.out.println(data.getNumberOfCylinder());
		
	}

}
