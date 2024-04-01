package edu.ex;

public class Circle implements Shape{
	private double radius;
		
	public Circle() {}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void getArea() {
		double result = radius*radius*Math.PI;
		System.out.println("반지름이 "+radius+ "인 원 넓이 : " + result);		
	}
}