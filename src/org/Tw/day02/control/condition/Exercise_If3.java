package org.Tw.day02.control.condition;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수를 입력받아 등급을 알려주는 프로그램을 작성해주세요.
		// 점수를 입력해주세요 : 92
		// 학점은 A입니다.
		// 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함
		// 점수를 입력해주세요 : 102
		// 0~ 100 사이의 수를 입력해주세요
		// 커트라인 ( 90 ~ 100 : A, 89~ 80 : B, 79~70 : C
		// 69~60 : D, 그 외 F 
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		int score = sc.nextInt();
//		char grade=0;
		//모델방식으로 코딩하는 것
		//출력하는 메소드를 줄일 수 있음.
		if(score <0 || score > 100) {
			System.out.println("0~100 사이의 수를 입력해주세요.");
		}else {
			if(score >= 90) {
//				grade = 'A';
				System.out.println("학점은 A입니다.");
			}else if(score >= 80){
//				grade = 'B';
				System.out.println("학점은 B입니다.");
				}
			else if(score >= 70){
//				grade = 'C';
				System.out.println("학점은 C입니다.");
			}
			else if(score >= 60){
//				grade = 'D';
				System.out.println("학점은 D입니다.");
			}else {
//				grade = 'F';
				System.out.println("학점은 F입니다.");
				}
			}
//		System.out.println("학점은" + grade + " 입니다.");
		}
		
		/*char score = 'A';
		
		if (score >= 90) {
			System.out.println("A");
		}
		else if ((89 >= score)|| (score>= 80)) {
			System.out.println("B");
		}
		else if ((79 >= score)|| (score>= 70)) {
			System.out.println("C");
		}
		else if ((69 >= score)|| (score>= 60)) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	*/

}
