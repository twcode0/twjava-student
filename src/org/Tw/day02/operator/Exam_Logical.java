package org.Tw.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		//논리연산자 예제
		//남자이면서 평균평점 4.3이상인 사람
		//컴퓨터공학과 또는 경영학과인 사람
		//이면서 and // 또는 or
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// and -> &&, or 0> ||
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2);
		System.out.println("결과값 1: " + result1);
		result2 = (num1 < num2) || (num1 == num2);
		System.out.println("결과값 2 : " + result2);
		result3 = (num1>num2) && (num1 != num2);
		result4 = (num1 > num2) || (num1 == num2);
		System.out.println("결과값 3 :" + result3);
		// ! 연산자 : 
		System.out.println("결과값 4 :" + result4);
	}
}
