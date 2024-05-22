package org.Tw.day01.basic;

public class Exam_Constant {
	public static void main(String [] args) {
		//변수는 소문자로 시작!
		// 상수는 모두 대문자로 시작
		final double PI = 3.141519;
		//final 절대 변하지 않게 쓰겠다고 선언
		double radius = 10.2;
		double circleArea =radius * radius * PI;
		System.out.println("원의 면적"+ circleArea);
	}

}
