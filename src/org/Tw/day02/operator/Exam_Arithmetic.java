package org.Tw.day02.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main (String [] args) {
		//산술연산
		// +, - , *, / ,%
		// % : 나머지를 구해주는 연산자
		//문제 1 
		// 초 단위의 정수를 입력받고, 몇시간, 몇 분 , 몇 초인지 출력하는 프로그램을 작성하여라.
		Scanner scanner = new Scanner(System.in);
		
		// 3000 > ?hour, ? min, ?sec
		System.out.println("초 단위의 정수를 입력해주세요 : ");
		int time = scanner.nextInt();
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60;
		int second = (time) % 60;
		System.out.println (hour + "시간" + minute +"분" + second +"초");
	}

}
