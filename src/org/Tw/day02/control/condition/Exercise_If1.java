package org.Tw.day02.control.condition;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1
		// 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		// 60점 미만이면 불합격으로 출력한다.
		// 단, 4학년의 경우 70점 이상이어야 합격을 출력하는
		//프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.println();
		System.out.print("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt();
//		!= 가 아니면
		if(grade < 4 && score >= 60) {
			System.out.println("합격입니다.");
		}
		else if(grade == 4 && score >= 70) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
//		String result = (score >= 60) ? "합격입니다" : ((grade ==4) &&(score>=70)) ? "합격입니다":"불합격입니다.";
		
//		System.out.println(result + "입니다.");
		
//		왜 run 했을때 점수입력이 안뜨나? 정수 선언및 초기화 전에?
//		4학년만 따로하는 방법을 모르겟음 vv
	}
}


