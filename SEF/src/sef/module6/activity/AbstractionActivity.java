package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setBreadth(6);
		r.setColor("red");
		
		Rectangle square = new Rectangle();
		square.setLength(5);
		square.setBreadth(5);
		square.setColor("green");
	
	
		System.out.println("---------------------------");
		System.out.println("Rectangle length : " + r.getLength());
		System.out.println("Rectangle breadth : " + r.getBreadth());
		System.out.println("Rectangle area : " + r.getCalculateArea());
		System.out.println("Rectangle perimeter : " + r.getCalculatePerimeter());
		System.out.println("Rectangle color : " + r.getColor());

		System.out.println("---------------------------");
		System.out.println("Square length : " + square.getLength());
		System.out.println("Square breadth : " + square.getBreadth());
		System.out.println("Square area : " + square.getCalculateArea());
		System.out.println("Square perimeter : " + square.getCalculatePerimeter());
		System.out.println("Square color : " + square.getColor());
	}
}
