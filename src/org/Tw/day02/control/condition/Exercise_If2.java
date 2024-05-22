package org.Tw.day02.control.condition;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오.
		// 주문ㅇ하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원입니다.
		// 메뉴를 입력해주세요 : 자바칩프라프치노
		// 없는 메뉴입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다. ");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : " );
		String menu = sc.next();
//		int charge = sc.nextInt();
		// 메뉴마다 값을 다 정해줘야하나? if 문으로??
		if (menu.equals("아메리카노")) { //문자열 비교는 .equals(동일) .contains(포함한 값)
			System.out.println("2500원입니다.");
		}
		else if (menu.equals("카푸치노")){
			System.out.println("3000원입니다.");
		}
		else if  (menu.equals("카페라떼")) {
			System.out.println("3500원입니다.");
		}
		else if (menu.equals("에스프레소")) {
			System.out.println("2000원입니다.");
		}
		else {
			System.out.println("없는 메뉴입니다.");
		}
		
	}

}
