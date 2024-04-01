package edu.ex;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle() {}

	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void getArea() {
		double area = height*height;
		System.out.println("가로 "+width+ "세로 "+height+"인 사각형의 넓이 : " + area);		
	}
}