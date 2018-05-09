package mypackage.Base;

import mypackage.Cilinder;
import mypackage.Prism;

public class Database {
	
	Prism[] prismArray;

	public Database(int numberOfElements) {
		super();
		prismArray = new Prism[numberOfElements];
	}
	
	public int getNumberOfPrisms(){
		return prismArray.length;
	}
	
	public void setPrism(int index, Prism prism){
		prismArray[index] = prism;
	}

	public Prism[] getPrismArray() {
		return prismArray;
	}
	
	public Prism getPrismByIndex(int index){
		return prismArray[index];
	}
	
	public int getNumberOfNulls(){
		int counter = 0;
		
		for (Prism prism : prismArray) {
			if (prism != null) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public double getAverageOfVolume(){
		double avg=0;
		
		for (Prism prism : prismArray) {
			if (prism != null) {
				avg+=prism.getVolume();
			}
		}
		
		return avg / getNumberOfNulls();
	}
	
	public int getNumberOfCylinder(){
		int counter=0;
		
		for (Prism prism : prismArray) {
			if (prism instanceof Cilinder) {
				counter++;
			}
		}
		
		return counter;
	}

}




















