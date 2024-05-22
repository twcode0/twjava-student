package org.Tw.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		//비교연산자
		// 더이상 = 는 equal아니다
		// equal는 == 다.
		// = 는 대입연산자이다.
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);
		result = (num1 < num2);
		result = (num1 == num2); // 값이 같을때 true
		result = (num1 != num2); // 값이 다를때 true << 자주 쓰임
		System.out.println("result : " + result);
	}
}
