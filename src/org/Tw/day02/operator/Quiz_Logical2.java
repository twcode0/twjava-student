package org.Tw.day02.operator;

import java.util.Scanner;

public class Quiz_Logical2 {
	public static void main(String [] args) {
		//입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요
		//변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 입력하세요. : ");
		int num = scanner.nextInt();
//		임폴트 자바유틸스캐너 입력되어있는데 왜 오류..? 오타 잘 확인하자..
		boolean result1;
		result1 = (1 <= num) &&( num <= 100) ;
		System.out.println(result1);
		
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		
	}

}
