package mypackage;

public class Cilinder extends Prism{
	
	private double radius;
	
	public Cilinder(int height, double radius) {
		super(height);
		this.radius = radius;
	}

	public double getBaseArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "Cilinder [radius=" + radius + ", getHeight()=" + getHeight() + "]";
	}

	
}
