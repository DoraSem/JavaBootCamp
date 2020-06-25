package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape() {
		System.out.println("I'am a Shape Constructor");
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	public abstract double getCalculateArea();
	public abstract double getCalculatePerimeter();
	
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	

}
