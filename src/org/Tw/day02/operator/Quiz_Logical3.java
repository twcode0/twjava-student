package org.Tw.day02.operator;

import java.util.Scanner;

public class Quiz_Logical3 {
	public static void main(String [] args) {
		/*char a = 'A'; // 문자는 홑따옴표
		a = 'a'; 
		String str = "";// 문자열은 쌍따옴표
		System.out.println(a);*/
		
//		아스키코드표 확인하기 범위를 지정해준다 
//		대문자 65~
		
		//입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해 주세요 : ");
		char word = scanner.next().charAt(0);
		// .charAt(0)문자 하나만 잘라서 초기화하겠따
		boolean result;
		result = (65 <= word) && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
		//		문자열 선언 string, char
		
		
	}
}
