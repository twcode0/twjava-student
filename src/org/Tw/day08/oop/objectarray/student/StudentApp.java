package org.Tw.day08.oop.objectarray.student;

import java.util.Scanner;


public class StudentApp {
	
	
	public static void main(String[] args) {
		ManageStudent mng= new ManageStudent();
		ViewStudent view = new ViewStudent();
		end :
		while(true) {
			int input = mng.printMenu();
			Student [] students = null;
			switch(input) {
			case 1 :
				students = view.displayInput();
				mng.inputInfo();
				break;
			case 2 :
//				mng.printInfo();
				students= mng.printInfo();
				view.displayInfo(students);
				break;
			case 3 :
				view.displayMsg("프로그램을 종료 합니다.");
				break end;
			default :
				view.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		  }
		}
	
	
//		int score1 = 0;
//		int score2 = 0;
//		
//		end :
//		while(true) {
//			System.out.println("====== 메인메뉴 ======");
//			System.out.println("1. 성적입력 : ");
//			System.out.println("2. 성적출력 : ");
//			System.out.println("3. 종료 ");
//			System.out.print("선택 : ");
//			int choice = sc.nextInt();
//			switch(choice) {
//					case 1 :
//						System.out.println("====== 성적 입력 ======");
//						System.out.print("이름 : ");
//						String name=sc.nextLine();
//						name = sc.nextLine();
//						System.out.print("첫번째 점수 : ");
//						score1 = sc.nextInt();
//						System.out.print("두번째 점수 : ");
//						score2 = sc.nextInt();
//						break;
//					case 2 :
//						System.out.println(student.toString());
//						break;
//					case 3 :
//						System.out.println("프로그램이 종료되었습니다.");
//						break end;
//					default :
//						System.out.println("1~3 사이의 숫자를 입력해 주세요.");
//				}	
				
			
		
		
	
			
		
	}


