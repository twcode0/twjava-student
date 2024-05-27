package org.Tw.day07.oop;

public class Circle {
	// 반지름	radius
	// 이름		name
	public double radius;
	public String name;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	// 넓이구하기
	public double getArea() {
		return 3.14*radius*radius;
		// return을 쓰면 public옆에
		// 리턴값과 같은 데이터타입을 써야함.
	}

		 
}

