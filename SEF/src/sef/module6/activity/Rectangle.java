package sef.module6.activity;

public class Rectangle extends Shape {

	private double length;
	private double breadth;
	
	public Rectangle(){ 
		System.out.println("I'm a Rectangle constructor"); 
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
		
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getCalculateArea () {
		return length * breadth;
	}
	
	public double getCalculatePerimeter () {
		return 2*length + 2*breadth;
	}
	

}
