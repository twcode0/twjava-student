package org.Tw.day01.printbasic;

import java.util.Scanner;

public class Exam_PrintSamlple {
	public static void main(String [] args) {
//		print > 옆으로 붙여서 출력 개행하고싶으면 \n 입력해야함
//		println > 한줄에 하나씩출력
		System.out.print("지금까지와는 다른 출력 명령어");
		System.out.println("지금까지 쓰던 출력 명령어");

		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 수 입력 : ");
		int num = sc.nextInt();
		
		// printf() 메소드 %d(정수출력되는 위치에 코딩) 와 함께해야함
		System.out.printf("정수 출력 : %d", 57);
	}

}
