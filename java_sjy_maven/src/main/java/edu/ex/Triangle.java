package edu.ex;

public class Triangle implements Shape{
	private double width;
	private double height;
	
	public Triangle() {}
	
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
		double area = height*height*0.5;
		System.out.println("가로 "+width+ "세로 "+height+"인 삼각형의 넓이 : " + area);		
	}

}