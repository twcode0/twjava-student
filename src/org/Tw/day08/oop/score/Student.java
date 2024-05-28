package org.Tw.day08.oop.score;

import java.util.Scanner;

public class Student {
	// 멤버 필드
	static int kor;
	static int eng;
	static int math;
	
	// 생성자
	public Student() {
		
	}
	
	// 멤버 메소드
	// 메뉴 출력
		public static int printMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("======= 메인 메뉴 ======");
			System.out.println("1. 성적입력 : ");
			System.out.println("2. 성적 출력 : ");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			return choice;
		}
	// 성적 입력
		public static void inputScore() {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 성적 입력 ======");
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
		}
	// 성적 출력
		public static void printScore() {
			
			System.out.println("====== 성적 출력 ======");
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("총점 : " + (kor+eng+math));
			System.out.println("평균 : " + (kor+eng+math)/3.0);

		}
	// 메세지 출력
		public static void displayMsg(String message) {
			System.out.println(message);
		}
	
}
