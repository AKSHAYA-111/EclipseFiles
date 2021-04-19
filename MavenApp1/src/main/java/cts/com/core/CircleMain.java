package cts.com.core;

public class CircleMain {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(10.2f);
		float ar=c.circleArea();
		System.out.println("circle with radius "+c.getRadius()+" area is:"+ar);
		
	}
	

}
